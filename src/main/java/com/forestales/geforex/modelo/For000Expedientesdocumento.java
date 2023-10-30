package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

import com.forestales.geforex.modelo.For000Documentostipos;

/**
 * The persistent class for the FOR_000_EXPEDIENTESDOCUMENTOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESDOCUMENTOS")
@NamedQuery(name = "For000Expedientesdocumento.findAll", query = "SELECT f FROM For000Expedientesdocumento f")
public class For000Expedientesdocumento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESDOCUMENTOS_EXDEXPEDIENTEDOCUMENTOID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESDOCUMENTOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_EXPEDIENTESDOCUMENTOS_EXDEXPEDIENTEDOCUMENTOID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESDOCUMENTOS_EXDEXPEDIENTEDOCUMENTOID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESDOCUMENTOS_SEQ", allocationSize = 1)
	@Column(name = "EXD_EXPEDIENTEDOCUMENTOID")
	private BigDecimal exdExpedientedocumentoid;

	@Column(name = "EXD_DESCRIPCION")
	private String exdDescripcion;

	@Lob
	@Column(name = "EXD_DOCUMENTO")
	private byte[] exdDocumento;

	@Column(name = "EXD_FECHA")
	private Timestamp exdFecha;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXD_FECHADOCUMENTO")
	private Date exdFechadocumento;

	@Column(name = "EXD_NOMBREARCHIVO")
	private String exdNombrearchivo;

	@Column(name = "EXD_OPERACION")
	private BigDecimal exdOperacion;

	@Column(name = "EXD_USUARIO")
	private String exdUsuario;

	// bi-directional many-to-one association to For000Documentostipos
	@ManyToOne
	@JoinColumn(name = "EXD_DOCUMENTOTIPOID")
	private For000Documentostipos for000Documentostipo;

	// bi-directional many-to-one association to For000Expediente
	@ManyToOne
	@JoinColumn(name = "EXD_EXPEDIENTEID")
	private For000Expedientes for000Expediente;

	public For000Expedientesdocumento() {
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

	public BigDecimal getExdExpedientedocumentoid() {
		return this.exdExpedientedocumentoid;
	}

	public void setExdExpedientedocumentoid(BigDecimal exdExpedientedocumentoid) {
		this.exdExpedientedocumentoid = exdExpedientedocumentoid;
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

	public For000Documentostipos getFor000Documentostipo() {
		return this.for000Documentostipo;
	}

	public void setFor000Documentostipo(For000Documentostipos for000Documentostipo) {
		this.for000Documentostipo = for000Documentostipo;
	}

	public For000Expedientes getFor000Expediente() {
		return this.for000Expediente;
	}

	public void setFor000Expediente(For000Expedientes for000Expediente) {
		this.for000Expediente = for000Expediente;
	}

}