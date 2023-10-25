package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESHISTORIAL database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESHISTORIAL")
@NamedQuery(name="AuditFor000Expedienteshistorial.findAll", query="SELECT a FROM AuditFor000Expedienteshistorial a")
public class AuditFor000Expedienteshistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXH_DESCRIPCION")
	private String exhDescripcion;

	@Lob
	@Column(name="EXH_DOCUMENTO")
	private byte[] exhDocumento;

	@Column(name="EXH_EXPEDIENTEHISTORIALID")
	private BigDecimal exhExpedientehistorialid;

	@Column(name="EXH_EXPEDIENTEID")
	private BigDecimal exhExpedienteid;

	@Column(name="EXH_FECHA")
	private Timestamp exhFecha;

	@Column(name="EXH_FECHAHISTORIAL")
	private Timestamp exhFechahistorial;

	@Column(name="EXH_NOMBREARCHIVO")
	private String exhNombrearchivo;

	@Column(name="EXH_OBSERVACIONES")
	private String exhObservaciones;

	@Column(name="EXH_OPERACION")
	private BigDecimal exhOperacion;

	@Column(name="EXH_USUARIO")
	private String exhUsuario;

	public AuditFor000Expedienteshistorial() {
	}

	public String getExhDescripcion() {
		return this.exhDescripcion;
	}

	public void setExhDescripcion(String exhDescripcion) {
		this.exhDescripcion = exhDescripcion;
	}

	public byte[] getExhDocumento() {
		return this.exhDocumento;
	}

	public void setExhDocumento(byte[] exhDocumento) {
		this.exhDocumento = exhDocumento;
	}

	public BigDecimal getExhExpedientehistorialid() {
		return this.exhExpedientehistorialid;
	}

	public void setExhExpedientehistorialid(BigDecimal exhExpedientehistorialid) {
		this.exhExpedientehistorialid = exhExpedientehistorialid;
	}

	public BigDecimal getExhExpedienteid() {
		return this.exhExpedienteid;
	}

	public void setExhExpedienteid(BigDecimal exhExpedienteid) {
		this.exhExpedienteid = exhExpedienteid;
	}

	public Timestamp getExhFecha() {
		return this.exhFecha;
	}

	public void setExhFecha(Timestamp exhFecha) {
		this.exhFecha = exhFecha;
	}

	public Timestamp getExhFechahistorial() {
		return this.exhFechahistorial;
	}

	public void setExhFechahistorial(Timestamp exhFechahistorial) {
		this.exhFechahistorial = exhFechahistorial;
	}

	public String getExhNombrearchivo() {
		return this.exhNombrearchivo;
	}

	public void setExhNombrearchivo(String exhNombrearchivo) {
		this.exhNombrearchivo = exhNombrearchivo;
	}

	public String getExhObservaciones() {
		return this.exhObservaciones;
	}

	public void setExhObservaciones(String exhObservaciones) {
		this.exhObservaciones = exhObservaciones;
	}

	public BigDecimal getExhOperacion() {
		return this.exhOperacion;
	}

	public void setExhOperacion(BigDecimal exhOperacion) {
		this.exhOperacion = exhOperacion;
	}

	public String getExhUsuario() {
		return this.exhUsuario;
	}

	public void setExhUsuario(String exhUsuario) {
		this.exhUsuario = exhUsuario;
	}

}