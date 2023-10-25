package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESAGENTES database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESAGENTES")
@NamedQuery(name="AuditFor000Expedientesagente.findAll", query="SELECT a FROM AuditFor000Expedientesagente a")
public class AuditFor000Expedientesagente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXA_AGENTEID")
	private BigDecimal exaAgenteid;

	@Column(name="EXA_EXPEDIENTEAGENTEID")
	private BigDecimal exaExpedienteagenteid;

	@Column(name="EXA_EXPEDIENTEID")
	private BigDecimal exaExpedienteid;

	@Column(name="EXA_FECHA")
	private Timestamp exaFecha;

	@Column(name="EXA_FECHAULTNOTAGENTE")
	private BigDecimal exaFechaultnotagente;

	@Column(name="EXA_OBSERVACIONESAGENTE")
	private String exaObservacionesagente;

	@Column(name="EXA_OPERACION")
	private BigDecimal exaOperacion;

	@Column(name="EXA_USUARIO")
	private String exaUsuario;

	public AuditFor000Expedientesagente() {
	}

	public BigDecimal getExaAgenteid() {
		return this.exaAgenteid;
	}

	public void setExaAgenteid(BigDecimal exaAgenteid) {
		this.exaAgenteid = exaAgenteid;
	}

	public BigDecimal getExaExpedienteagenteid() {
		return this.exaExpedienteagenteid;
	}

	public void setExaExpedienteagenteid(BigDecimal exaExpedienteagenteid) {
		this.exaExpedienteagenteid = exaExpedienteagenteid;
	}

	public BigDecimal getExaExpedienteid() {
		return this.exaExpedienteid;
	}

	public void setExaExpedienteid(BigDecimal exaExpedienteid) {
		this.exaExpedienteid = exaExpedienteid;
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

}