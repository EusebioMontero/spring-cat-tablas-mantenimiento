package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_EXPEDIENTESFINCAS database table.
 * 
 */
@Entity
@Table(name="FOR_000_EXPEDIENTESFINCAS")
@NamedQuery(name="For000Expedientesfincas.findAll", query="SELECT f FROM For000Expedientesfincas f")
public class For000Expedientesfincas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_EXPEDIENTESFINCAS_EXFEXPEDIENTEFINCAID_GENERATOR", sequenceName="FOR_000_EXPEDIENTESFINCAS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_EXPEDIENTESFINCAS_EXFEXPEDIENTEFINCAID_GENERATOR")
	@Column(name="EXF_EXPEDIENTEFINCAID")
	private long exfExpedientefincaid;

	@Column(name="EXF_EXPEDIENTEID")
	private BigDecimal exfExpedienteid;

	@Column(name="EXF_FECHA")
	private Timestamp exfFecha;

	@Column(name="EXF_NOMBREFINCA")
	private String exfNombrefinca;

	@Column(name="EXF_OPERACION")
	private BigDecimal exfOperacion;

	@Column(name="EXF_SUPERFICIEFINCA")
	private BigDecimal exfSuperficiefinca;

	@Column(name="EXF_USUARIO")
	private String exfUsuario;

	//bi-directional many-to-one association to For000Poblacione
	@ManyToOne
	@JoinColumn(name="EXF_POBLACIONID")
	private For000Poblacione for000Poblacione;

	//bi-directional many-to-one association to For000Provincia
	@ManyToOne
	@JoinColumn(name="EXF_PROVINCIAID")
	private For000Provincia for000Provincia;

	public For000Expedientesfincas() {
	}

	public long getExfExpedientefincaid() {
		return this.exfExpedientefincaid;
	}

	public void setExfExpedientefincaid(long exfExpedientefincaid) {
		this.exfExpedientefincaid = exfExpedientefincaid;
	}

	public BigDecimal getExfExpedienteid() {
		return this.exfExpedienteid;
	}

	public void setExfExpedienteid(BigDecimal exfExpedienteid) {
		this.exfExpedienteid = exfExpedienteid;
	}

	public Timestamp getExfFecha() {
		return this.exfFecha;
	}

	public void setExfFecha(Timestamp exfFecha) {
		this.exfFecha = exfFecha;
	}

	public String getExfNombrefinca() {
		return this.exfNombrefinca;
	}

	public void setExfNombrefinca(String exfNombrefinca) {
		this.exfNombrefinca = exfNombrefinca;
	}

	public BigDecimal getExfOperacion() {
		return this.exfOperacion;
	}

	public void setExfOperacion(BigDecimal exfOperacion) {
		this.exfOperacion = exfOperacion;
	}

	public BigDecimal getExfSuperficiefinca() {
		return this.exfSuperficiefinca;
	}

	public void setExfSuperficiefinca(BigDecimal exfSuperficiefinca) {
		this.exfSuperficiefinca = exfSuperficiefinca;
	}

	public String getExfUsuario() {
		return this.exfUsuario;
	}

	public void setExfUsuario(String exfUsuario) {
		this.exfUsuario = exfUsuario;
	}

	public For000Poblacione getFor000Poblacione() {
		return this.for000Poblacione;
	}

	public void setFor000Poblacione(For000Poblacione for000Poblacione) {
		this.for000Poblacione = for000Poblacione;
	}

	public For000Provincia getFor000Provincia() {
		return this.for000Provincia;
	}

	public void setFor000Provincia(For000Provincia for000Provincia) {
		this.for000Provincia = for000Provincia;
	}

}