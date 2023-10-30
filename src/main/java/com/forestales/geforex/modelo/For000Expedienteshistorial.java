package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTESHISTORIAL database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESHISTORIAL")
@NamedQuery(name = "For000Expedienteshistorial.findAll", query = "SELECT f FROM For000Expedienteshistorial f")
public class For000Expedienteshistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESHISTORIAL_EXHEXPEDIENTEHISTORIALID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESHISTORIAL_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_EXPEDIENTESHISTORIAL_EXHEXPEDIENTEHISTORIALID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESHISTORIAL_EXHEXPEDIENTEHISTORIALID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESHISTORIAL_SEQ", allocationSize = 1)
	@Column(name = "EXH_EXPEDIENTEHISTORIALID")
	private long exhExpedientehistorialid;

	@Column(name = "EXH_DESCRIPCION")
	private String exhDescripcion;

	@Lob
	@Column(name = "EXH_DOCUMENTO")
	private byte[] exhDocumento;

	@Column(name = "EXH_FECHA")
	private Timestamp exhFecha;

	@Column(name = "EXH_FECHAHISTORIAL")
	private Timestamp exhFechahistorial;

	@Column(name = "EXH_NOMBREARCHIVO")
	private String exhNombrearchivo;

	@Column(name = "EXH_OBSERVACIONES")
	private String exhObservaciones;

	@Column(name = "EXH_OPERACION")
	private BigDecimal exhOperacion;

	@Column(name = "EXH_USUARIO")
	private String exhUsuario;

	// bi-directional many-to-one association to For000Expedienteshistorial
	@ManyToOne
	@JoinColumn(name = "EXH_EXPEDIENTEID")
	private For000Expedienteshistorial for000Expediente;

	public For000Expedienteshistorial() {
	}

	public long getExhExpedientehistorialid() {
		return this.exhExpedientehistorialid;
	}

	public void setExhExpedientehistorialid(long exhExpedientehistorialid) {
		this.exhExpedientehistorialid = exhExpedientehistorialid;
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

	public For000Expedienteshistorial getFor000Expediente() {
		return this.for000Expediente;
	}

	public void setFor000Expediente(For000Expedienteshistorial for000Expediente) {
		this.for000Expediente = for000Expediente;
	}

}