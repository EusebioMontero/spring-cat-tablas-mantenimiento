package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTESAGENTES database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESAGENTES")
@NamedQuery(name = "For000Expedientesagente.findAll", query = "SELECT f FROM For000Expedientesagente f")
public class For000Expedientesagente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESAGENTES_EXAEXPEDIENTEAGENTEID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESAGENTES_SEQ")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "FOR_000_EXPEDIENTESAGENTES_EXAEXPEDIENTEAGENTEID_GENERATOR")
	@Column(name = "EXA_EXPEDIENTEAGENTEID")
	private long exaExpedienteagenteid;

	@Column(name = "EXA_AGENTEID")
	private BigDecimal exaAgenteid;

	@Column(name = "EXA_FECHA")
	private Timestamp exaFecha;

	@Column(name = "EXA_FECHAULTNOTAGENTE")
	private BigDecimal exaFechaultnotagente;

	@Column(name = "EXA_OBSERVACIONESAGENTE")
	private String exaObservacionesagente;

	@Column(name = "EXA_OPERACION")
	private BigDecimal exaOperacion;

	@Column(name = "EXA_USUARIO")
	private String exaUsuario;

	// bi-directional many-to-one association to For000Expediente
	@ManyToOne
	@JoinColumn(name = "EXA_EXPEDIENTEID")
	private For000Expedientes for000Expediente;

	public For000Expedientesagente() {
	}

	public long getExaExpedienteagenteid() {
		return this.exaExpedienteagenteid;
	}

	public void setExaExpedienteagenteid(long exaExpedienteagenteid) {
		this.exaExpedienteagenteid = exaExpedienteagenteid;
	}

	public BigDecimal getExaAgenteid() {
		return this.exaAgenteid;
	}

	public void setExaAgenteid(BigDecimal exaAgenteid) {
		this.exaAgenteid = exaAgenteid;
	}

	public Timestamp getExaFecha() {
		return this.exaFecha;
	}

	public void setExaFecha(Timestamp exaFecha) {
		this.exaFecha = exaFecha;
	}

	public BigDecimal getExaFechaultnotagente() {
		return this.exaFechaultnotagente;
	}

	public void setExaFechaultnotagente(BigDecimal exaFechaultnotagente) {
		this.exaFechaultnotagente = exaFechaultnotagente;
	}

	public String getExaObservacionesagente() {
		return this.exaObservacionesagente;
	}

	public void setExaObservacionesagente(String exaObservacionesagente) {
		this.exaObservacionesagente = exaObservacionesagente;
	}

	public BigDecimal getExaOperacion() {
		return this.exaOperacion;
	}

	public void setExaOperacion(BigDecimal exaOperacion) {
		this.exaOperacion = exaOperacion;
	}

	public String getExaUsuario() {
		return this.exaUsuario;
	}

	public void setExaUsuario(String exaUsuario) {
		this.exaUsuario = exaUsuario;
	}

	public For000Expedientes getFor000Expediente() {
		return this.for000Expediente;
	}

	public void setFor000Expediente(For000Expedientes for000Expediente) {
		this.for000Expediente = for000Expediente;
	}

}