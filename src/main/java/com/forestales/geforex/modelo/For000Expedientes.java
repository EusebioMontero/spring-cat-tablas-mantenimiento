package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTES database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTES")
@NamedQuery(name = "For000Expedientes.findAll", query = "SELECT f FROM For000Expedientes f")
public class For000Expedientes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTES_SEQ", allocationSize = 1)
	@Column(name = "EXP_EXPEDIENTEID")
	private long expExpedienteid;

	@Column(name = "EXP_CAMPANA")
	private BigDecimal expCampana;

	@Column(name = "EXP_FECHA")
	private Timestamp expFecha;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXP_FECHAFIN")
	private Date expFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXP_FECHAINICIO")
	private Date expFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name = "EXP_FECHAPREVISTAFIN")
	private Date expFechaprevistafin;

	@Column(name = "EXP_FECHAREGENTRADA")
	private Timestamp expFecharegentrada;

	@Column(name = "EXP_IGF")
	private String expIgf;

	@Column(name = "EXP_NUMEXPEDIENTE")
	private String expNumexpediente;

	@Column(name = "EXP_OBSERVACIONESEXPEDIENTE")
	private String expObservacionesexpediente;

	@Column(name = "EXP_OPERACION")
	private BigDecimal expOperacion;

	@Column(name = "EXP_USUARIO")
	private String expUsuario;

	// bi-directional many-to-one association to For000Expedientesestado
	@ManyToOne
	@JoinColumn(name = "EXP_EXPEDIENTEESTADOID")
	private For000Expedientesestado for000Expedientesestado;

	// bi-directional many-to-one association to For000Expedientestipo
	@ManyToOne
	@JoinColumn(name = "EXP_EXPEDIENTETIPOID")
	private For000Expedientestipo for000Expedientestipo;

	// bi-directional many-to-one association to For000Finca
	@ManyToOne
	@JoinColumn(name = "EXP_FINCAID")
	private For000Finca for000Finca;

	// bi-directional many-to-one association to For000Registrosentrada
	@ManyToOne
	@JoinColumn(name = "EXP_REGISTROENTRADAID")
	private For000Registrosentrada for000Registrosentrada;

	// bi-directional many-to-one association to For000Solicitantes
	@ManyToOne
	@JoinColumn(name = "EXP_SOLICITANTEID")
	private For000Solicitantes for000Solicitante;

	public For000Expedientes() {
	}

	public long getExpExpedienteid() {
		return this.expExpedienteid;
	}

	public void setExpExpedienteid(long expExpedienteid) {
		this.expExpedienteid = expExpedienteid;
	}

	public BigDecimal getExpCampana() {
		return this.expCampana;
	}

	public void setExpCampana(BigDecimal expCampana) {
		this.expCampana = expCampana;
	}

	public Timestamp getExpFecha() {
		return this.expFecha;
	}

	public void setExpFecha(Timestamp expFecha) {
		this.expFecha = expFecha;
	}

	public Date getExpFechafin() {
		return this.expFechafin;
	}

	public void setExpFechafin(Date expFechafin) {
		this.expFechafin = expFechafin;
	}

	public Date getExpFechainicio() {
		return this.expFechainicio;
	}

	public void setExpFechainicio(Date expFechainicio) {
		this.expFechainicio = expFechainicio;
	}

	public Date getExpFechaprevistafin() {
		return this.expFechaprevistafin;
	}

	public void setExpFechaprevistafin(Date expFechaprevistafin) {
		this.expFechaprevistafin = expFechaprevistafin;
	}

	public Timestamp getExpFecharegentrada() {
		return this.expFecharegentrada;
	}

	public void setExpFecharegentrada(Timestamp expFecharegentrada) {
		this.expFecharegentrada = expFecharegentrada;
	}

	public String getExpIgf() {
		return this.expIgf;
	}

	public void setExpIgf(String expIgf) {
		this.expIgf = expIgf;
	}

	public String getExpNumexpediente() {
		return this.expNumexpediente;
	}

	public void setExpNumexpediente(String expNumexpediente) {
		this.expNumexpediente = expNumexpediente;
	}

	public String getExpObservacionesexpediente() {
		return this.expObservacionesexpediente;
	}

	public void setExpObservacionesexpediente(String expObservacionesexpediente) {
		this.expObservacionesexpediente = expObservacionesexpediente;
	}

	public BigDecimal getExpOperacion() {
		return this.expOperacion;
	}

	public void setExpOperacion(BigDecimal expOperacion) {
		this.expOperacion = expOperacion;
	}

	public String getExpUsuario() {
		return this.expUsuario;
	}

	public void setExpUsuario(String expUsuario) {
		this.expUsuario = expUsuario;
	}

	public For000Expedientesestado getFor000Expedientesestado() {
		return this.for000Expedientesestado;
	}

	public void setFor000Expedientesestado(For000Expedientesestado for000Expedientesestado) {
		this.for000Expedientesestado = for000Expedientesestado;
	}

	public For000Expedientestipo getFor000Expedientestipo() {
		return this.for000Expedientestipo;
	}

	public void setFor000Expedientestipo(For000Expedientestipo for000Expedientestipo) {
		this.for000Expedientestipo = for000Expedientestipo;
	}

	public For000Finca getFor000Finca() {
		return this.for000Finca;
	}

	public void setFor000Finca(For000Finca for000Finca) {
		this.for000Finca = for000Finca;
	}

	public For000Registrosentrada getFor000Registrosentrada() {
		return this.for000Registrosentrada;
	}

	public void setFor000Registrosentrada(For000Registrosentrada for000Registrosentrada) {
		this.for000Registrosentrada = for000Registrosentrada;
	}

	public For000Solicitantes getFor000Solicitante() {
		return this.for000Solicitante;
	}

	public void setFor000Solicitante(For000Solicitantes for000Solicitante) {
		this.for000Solicitante = for000Solicitante;
	}

}