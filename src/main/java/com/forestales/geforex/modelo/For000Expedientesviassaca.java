package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTESVIASSACA database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESVIASSACA")
@NamedQuery(name = "For000Expedientesviassaca.findAll", query = "SELECT f FROM For000Expedientesviassaca f")
public class For000Expedientesviassaca implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTES_EXPEDIENTEVIASACAID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESVIASSACA_SEQ")
	@Column(name = "EVS_EXPEDIENTEVIASACAID")
	private Long evsExpedienteviasacaid;

	@Column(name = "EVS_FECHA")
	private Timestamp evsFecha;

	@Column(name = "EVS_OPERACION")
	private BigDecimal evsOperacion;

	@Column(name = "EVS_USUARIO")
	private String evsUsuario;

	@Column(name = "EVS_VIASSACACONSTRANCHURA")
	private BigDecimal evsViassacaconstranchura;

	@Column(name = "EVS_VIASSACACONSTRLONG")
	private BigDecimal evsViassacaconstrlong;

	@Column(name = "EVS_VIASSACAREPANCHURA")
	private BigDecimal evsViassacarepanchura;

	@Column(name = "EVS_VIASSACAREPLONG")
	private BigDecimal evsViassacareplong;

	// bi-directional many-to-one association to For000Expediente
	@ManyToOne
	@JoinColumn(name = "EVS_EXPEDIENTEID")
	private For000Expedientes for000Expediente;

	public For000Expedientesviassaca() {
	}

	public Long getEvsExpedienteviasacaid() {
		return this.evsExpedienteviasacaid;
	}

	public void setEvsExpedienteviasacaid(Long evsExpedienteviasacaid) {
		this.evsExpedienteviasacaid = evsExpedienteviasacaid;
	}

	public Timestamp getEvsFecha() {
		return this.evsFecha;
	}

	public void setEvsFecha(Timestamp evsFecha) {
		this.evsFecha = evsFecha;
	}

	public BigDecimal getEvsOperacion() {
		return this.evsOperacion;
	}

	public void setEvsOperacion(BigDecimal evsOperacion) {
		this.evsOperacion = evsOperacion;
	}

	public String getEvsUsuario() {
		return this.evsUsuario;
	}

	public void setEvsUsuario(String evsUsuario) {
		this.evsUsuario = evsUsuario;
	}

	public BigDecimal getEvsViassacaconstranchura() {
		return this.evsViassacaconstranchura;
	}

	public void setEvsViassacaconstranchura(BigDecimal evsViassacaconstranchura) {
		this.evsViassacaconstranchura = evsViassacaconstranchura;
	}

	public BigDecimal getEvsViassacaconstrlong() {
		return this.evsViassacaconstrlong;
	}

	public void setEvsViassacaconstrlong(BigDecimal evsViassacaconstrlong) {
		this.evsViassacaconstrlong = evsViassacaconstrlong;
	}

	public BigDecimal getEvsViassacarepanchura() {
		return this.evsViassacarepanchura;
	}

	public void setEvsViassacarepanchura(BigDecimal evsViassacarepanchura) {
		this.evsViassacarepanchura = evsViassacarepanchura;
	}

	public BigDecimal getEvsViassacareplong() {
		return this.evsViassacareplong;
	}

	public void setEvsViassacareplong(BigDecimal evsViassacareplong) {
		this.evsViassacareplong = evsViassacareplong;
	}

	public For000Expedientes getFor000Expediente() {
		return this.for000Expediente;
	}

	public void setFor000Expediente(For000Expedientes for000Expediente) {
		this.for000Expediente = for000Expediente;
	}

}