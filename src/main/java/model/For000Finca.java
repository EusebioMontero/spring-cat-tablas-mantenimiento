package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_FINCAS database table.
 * 
 */
@Entity
@Table(name="FOR_000_FINCAS")
@NamedQuery(name="For000Finca.findAll", query="SELECT f FROM For000Finca f")
public class For000Finca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_FINCAS_FINFINCAID_GENERATOR", sequenceName="FOR_000_FINCAS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_FINCAS_FINFINCAID_GENERATOR")
	@Column(name="FIN_FINCAID")
	private long finFincaid;

	@Column(name="FIN_FECHA")
	private Timestamp finFecha;

	@Column(name="FIN_NOMBREFINCA")
	private String finNombrefinca;

	@Column(name="FIN_OPERACION")
	private BigDecimal finOperacion;

	@Column(name="FIN_POBLACION")
	private String finPoblacion;

	@Column(name="FIN_PROVINCIA")
	private String finProvincia;

	@Column(name="FIN_SUPERFICIEFINCA")
	private BigDecimal finSuperficiefinca;

	@Column(name="FIN_USUARIO")
	private String finUsuario;

	//bi-directional many-to-one association to For000Expedientes
	@OneToMany(mappedBy="for000Finca")
	private List<For000Expedientes> for000Expedientes;

	public For000Finca() {
	}

	public long getFinFincaid() {
		return this.finFincaid;
	}

	public void setFinFincaid(long finFincaid) {
		this.finFincaid = finFincaid;
	}

	public Timestamp getFinFecha() {
		return this.finFecha;
	}

	public void setFinFecha(Timestamp finFecha) {
		this.finFecha = finFecha;
	}

	public String getFinNombrefinca() {
		return this.finNombrefinca;
	}

	public void setFinNombrefinca(String finNombrefinca) {
		this.finNombrefinca = finNombrefinca;
	}

	public BigDecimal getFinOperacion() {
		return this.finOperacion;
	}

	public void setFinOperacion(BigDecimal finOperacion) {
		this.finOperacion = finOperacion;
	}

	public String getFinPoblacion() {
		return this.finPoblacion;
	}

	public void setFinPoblacion(String finPoblacion) {
		this.finPoblacion = finPoblacion;
	}

	public String getFinProvincia() {
		return this.finProvincia;
	}

	public void setFinProvincia(String finProvincia) {
		this.finProvincia = finProvincia;
	}

	public BigDecimal getFinSuperficiefinca() {
		return this.finSuperficiefinca;
	}

	public void setFinSuperficiefinca(BigDecimal finSuperficiefinca) {
		this.finSuperficiefinca = finSuperficiefinca;
	}

	public String getFinUsuario() {
		return this.finUsuario;
	}

	public void setFinUsuario(String finUsuario) {
		this.finUsuario = finUsuario;
	}

	public List<For000Expedientes> getFor000Expedientes() {
		return this.for000Expedientes;
	}

	public void setFor000Expedientes(List<For000Expedientes> for000Expedientes) {
		this.for000Expedientes = for000Expedientes;
	}

	public For000Expedientes addFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().add(for000Expediente);
		for000Expediente.setFor000Finca(this);

		return for000Expediente;
	}

	public For000Expedientes removeFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().remove(for000Expediente);
		for000Expediente.setFor000Finca(null);

		return for000Expediente;
	}

}