package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESDOCUMENTOS database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESDOCUMENTOS")
@NamedQuery(name="AuditFor000Expedientesdocumento.findAll", query="SELECT a FROM AuditFor000Expedientesdocumento a")
public class AuditFor000Expedientesdocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXD_DESCRIPCION")
	private String exdDescripcion;

	@Lob
	@Column(name="EXD_DOCUMENTO")
	private byte[] exdDocumento;

	@Column(name="EXD_DOCUMENTOTIPOID")
	private BigDecimal exdDocumentotipoid;

	@Column(name="EXD_EXPEDIENTEDOCUMENTOID")
	private BigDecimal exdExpedientedocumentoid;

	@Column(name="EXD_EXPEDIENTEID")
	private BigDecimal exdExpedienteid;

	@Column(name="EXD_FECHA")
	private Timestamp exdFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="EXD_FECHADOCUMENTO")
	private Date exdFechadocumento;

	@Column(name="EXD_NOMBREARCHIVO")
	private String exdNombrearchivo;

	@Column(name="EXD_OPERACION")
	private BigDecimal exdOperacion;

	@Column(name="EXD_USUARIO")
	private String exdUsuario;

	public AuditFor000Expedientesdocumento() {
	}

	public String getExdDescripcion() {
		return this.exdDescripcion;
	}

	public void setExdDescripcion(String exdDescripcion) {
		this.exdDescripcion = exdDescripcion;
	}

	public byte[] getExdDocumento() {
		return this.exdDocumento;
	}

	public void setExdDocumento(byte[] exdDocumento) {
		this.exdDocumento = exdDocumento;
	}

	public BigDecimal getExdDocumentotipoid() {
		return this.exdDocumentotipoid;
	}

	public void setExdDocumentotipoid(BigDecimal exdDocumentotipoid) {
		this.exdDocumentotipoid = exdDocumentotipoid;
	}

	public BigDecimal getExdExpedientedocumentoid() {
		return this.exdExpedientedocumentoid;
	}

	public void setExdExpedientedocumentoid(BigDecimal exdExpedientedocumentoid) {
		this.exdExpedientedocumentoid = exdExpedientedocumentoid;
	}

	public BigDecimal getExdExpedienteid() {
		return this.exdExpedienteid;
	}

	public void setExdExpedienteid(BigDecimal exdExpedienteid) {
		this.exdExpedienteid = exdExpedienteid;
	}

	public Timestamp getExdFecha() {
		return this.exdFecha;
	}

	public void setExdFecha(Timestamp exdFecha) {
		this.exdFecha = exdFecha;
	}

	public Date getExdFechadocumento() {
		return this.exdFechadocumento;
	}

	public void setExdFechadocumento(Date exdFechadocumento) {
		this.exdFechadocumento = exdFechadocumento;
	}

	public String getExdNombrearchivo() {
		return this.exdNombrearchivo;
	}

	public void setExdNombrearchivo(String exdNombrearchivo) {
		this.exdNombrearchivo = exdNombrearchivo;
	}

	public BigDecimal getExdOperacion() {
		return this.exdOperacion;
	}

	public void setExdOperacion(BigDecimal exdOperacion) {
		this.exdOperacion = exdOperacion;
	}

	public String getExdUsuario() {
		return this.exdUsuario;
	}

	public void setExdUsuario(String exdUsuario) {
		this.exdUsuario = exdUsuario;
	}

}