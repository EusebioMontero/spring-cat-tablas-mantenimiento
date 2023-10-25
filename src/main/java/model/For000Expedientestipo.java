package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_EXPEDIENTESTIPOS database table.
 * 
 */
@Entity
@Table(name="FOR_000_EXPEDIENTESTIPOS")
@NamedQuery(name="For000Expedientestipo.findAll", query="SELECT f FROM For000Expedientestipo f")
public class For000Expedientestipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_EXPEDIENTESTIPOS_EXTEXPEDIENTETIPOID_GENERATOR", sequenceName="FOR_000_EXPEDIENTESTIPOS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_EXPEDIENTESTIPOS_EXTEXPEDIENTETIPOID_GENERATOR")
	@Column(name="EXT_EXPEDIENTETIPOID")
	private long extExpedientetipoid;

	@Column(name="EXT_DESCRIPCION")
	private String extDescripcion;

	@Column(name="EXT_FECHA")
	private Timestamp extFecha;

	@Column(name="EXT_LETRA")
	private String extLetra;

	@Column(name="EXT_NUMERACIONCONJUNTA")
	private BigDecimal extNumeracionconjunta;

	@Column(name="EXT_OPERACION")
	private BigDecimal extOperacion;

	@Column(name="EXT_PLAZORESOLUCION")
	private BigDecimal extPlazoresolucion;

	@Column(name="EXT_SILENCIOADMINISTRATIVO")
	private BigDecimal extSilencioadministrativo;

	@Column(name="EXT_USUARIO")
	private String extUsuario;

	//bi-directional many-to-one association to For000Expedientes
	@OneToMany(mappedBy="for000Expedientestipo")
	private List<For000Expedientes> for000Expedientes;

	public For000Expedientestipo() {
	}

	public long getExtExpedientetipoid() {
		return this.extExpedientetipoid;
	}

	public void setExtExpedientetipoid(long extExpedientetipoid) {
		this.extExpedientetipoid = extExpedientetipoid;
	}

	public String getExtDescripcion() {
		return this.extDescripcion;
	}

	public void setExtDescripcion(String extDescripcion) {
		this.extDescripcion = extDescripcion;
	}

	public Timestamp getExtFecha() {
		return this.extFecha;
	}

	public void setExtFecha(Timestamp extFecha) {
		this.extFecha = extFecha;
	}

	public String getExtLetra() {
		return this.extLetra;
	}

	public void setExtLetra(String extLetra) {
		this.extLetra = extLetra;
	}

	public BigDecimal getExtNumeracionconjunta() {
		return this.extNumeracionconjunta;
	}

	public void setExtNumeracionconjunta(BigDecimal extNumeracionconjunta) {
		this.extNumeracionconjunta = extNumeracionconjunta;
	}

	public BigDecimal getExtOperacion() {
		return this.extOperacion;
	}

	public void setExtOperacion(BigDecimal extOperacion) {
		this.extOperacion = extOperacion;
	}

	public BigDecimal getExtPlazoresolucion() {
		return this.extPlazoresolucion;
	}

	public void setExtPlazoresolucion(BigDecimal extPlazoresolucion) {
		this.extPlazoresolucion = extPlazoresolucion;
	}

	public BigDecimal getExtSilencioadministrativo() {
		return this.extSilencioadministrativo;
	}

	public void setExtSilencioadministrativo(BigDecimal extSilencioadministrativo) {
		this.extSilencioadministrativo = extSilencioadministrativo;
	}

	public String getExtUsuario() {
		return this.extUsuario;
	}

	public void setExtUsuario(String extUsuario) {
		this.extUsuario = extUsuario;
	}

	public List<For000Expedientes> getFor000Expedientes() {
		return this.for000Expedientes;
	}

	public void setFor000Expedientes(List<For000Expedientes> for000Expedientes) {
		this.for000Expedientes = for000Expedientes;
	}

	public For000Expedientes addFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().add(for000Expediente);
		for000Expediente.setFor000Expedientestipo(this);

		return for000Expediente;
	}

	public For000Expedientes removeFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().remove(for000Expediente);
		for000Expediente.setFor000Expedientestipo(null);

		return for000Expediente;
	}

}