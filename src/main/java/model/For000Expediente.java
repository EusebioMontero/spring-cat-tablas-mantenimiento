package model;

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
@Table(name="FOR_000_EXPEDIENTES")
@NamedQuery(name="For000Expediente.findAll", query="SELECT f FROM For000Expediente f")
public class For000Expediente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR", sequenceName="FOR_000_EXPEDIENTES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR")
	@Column(name="EXP_EXPEDIENTEID")
	private long expExpedienteid;

	@Column(name="EXP_CAMPANA")
	private BigDecimal expCampana;

	@Column(name="EXP_EXPEDIENTEESTADOID")
	private BigDecimal expExpedienteestadoid;

	@Column(name="EXP_EXPEDIENTETIPOID")
	private BigDecimal expExpedientetipoid;

	@Column(name="EXP_FECHA")
	private Timestamp expFecha;

	@Temporal(TemporalType.DATE)
	@Column(name="EXP_FECHAFIN")
	private Date expFechafin;

	@Temporal(TemporalType.DATE)
	@Column(name="EXP_FECHAINICIO")
	private Date expFechainicio;

	@Temporal(TemporalType.DATE)
	@Column(name="EXP_FECHAPREVISTAFIN")
	private Date expFechaprevistafin;

	@Column(name="EXP_FECHAREGENTRADA")
	private Timestamp expFecharegentrada;

	@Column(name="EXP_FINCAID")
	private BigDecimal expFincaid;

	@Column(name="EXP_IGF")
	private String expIgf;

	@Column(name="EXP_NUMEXPEDIENTE")
	private String expNumexpediente;

	@Column(name="EXP_OBSERVACIONESEXPEDIENTE")
	private String expObservacionesexpediente;

	@Column(name="EXP_OPERACION")
	private BigDecimal expOperacion;

	@Column(name="EXP_REGISTROENTRADAID")
	private BigDecimal expRegistroentradaid;

	@Column(name="EXP_SOLICITANTEID")
	private BigDecimal expSolicitanteid;

	@Column(name="EXP_USUARIO")
	private String expUsuario;

	public For000Expediente() {
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

	public BigDecimal getExpExpedienteestadoid() {
		return this.expExpedienteestadoid;
	}

	public void setExpExpedienteestadoid(BigDecimal expExpedienteestadoid) {
		this.expExpedienteestadoid = expExpedienteestadoid;
	}

	public BigDecimal getExpExpedientetipoid() {
		return this.expExpedientetipoid;
	}

	public void setExpExpedientetipoid(BigDecimal expExpedientetipoid) {
		this.expExpedientetipoid = expExpedientetipoid;
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

	public BigDecimal getExpFincaid() {
		return this.expFincaid;
	}

	public void setExpFincaid(BigDecimal expFincaid) {
		this.expFincaid = expFincaid;
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

	public BigDecimal getExpRegistroentradaid() {
		return this.expRegistroentradaid;
	}

	public void setExpRegistroentradaid(BigDecimal expRegistroentradaid) {
		this.expRegistroentradaid = expRegistroentradaid;
	}

	public BigDecimal getExpSolicitanteid() {
		return this.expSolicitanteid;
	}

	public void setExpSolicitanteid(BigDecimal expSolicitanteid) {
		this.expSolicitanteid = expSolicitanteid;
	}

	public String getExpUsuario() {
		return this.expUsuario;
	}

	public void setExpUsuario(String expUsuario) {
		this.expUsuario = expUsuario;
	}

}