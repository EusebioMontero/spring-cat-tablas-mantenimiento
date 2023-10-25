package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_EXPEDIENTES database table.
 * 
 */
@Entity
@Table(name="FOR_000_EXPEDIENTES")
@NamedQuery(name="For000Expedienteshistorial.findAll", query="SELECT f FROM For000Expedienteshistorial f")
public class For000Expedienteshistorial implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_EXPEDIENTES_EXPEXPEDIENTEID_GENERATOR", sequenceName="FOR_000_EXPEDIENTESPARCELAS_SEQ")
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

	@Column(name="EXP_PERSONAID")
	private BigDecimal expPersonaid;

	@Column(name="EXP_REGISTROENTRADAID")
	private BigDecimal expRegistroentradaid;

	@Column(name="EXP_USUARIO")
	private String expUsuario;

	//bi-directional many-to-one association to For000Expedientesparcelas
	@OneToMany(mappedBy="for000Expediente")
	private List<For000Expedientesparcelas> for000Expedientesparcelas;

	public For000Expedienteshistorial() {
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

	public BigDecimal getExpPersonaid() {
		return this.expPersonaid;
	}

	public void setExpPersonaid(BigDecimal expPersonaid) {
		this.expPersonaid = expPersonaid;
	}

	public BigDecimal getExpRegistroentradaid() {
		return this.expRegistroentradaid;
	}

	public void setExpRegistroentradaid(BigDecimal expRegistroentradaid) {
		this.expRegistroentradaid = expRegistroentradaid;
	}

	public String getExpUsuario() {
		return this.expUsuario;
	}

	public void setExpUsuario(String expUsuario) {
		this.expUsuario = expUsuario;
	}

	public List<For000Expedientesparcelas> getFor000Expedientesparcelas() {
		return this.for000Expedientesparcelas;
	}

	public void setFor000Expedientesparcelas(List<For000Expedientesparcelas> for000Expedientesparcelas) {
		this.for000Expedientesparcelas = for000Expedientesparcelas;
	}

	public For000Expedientesparcelas addFor000Expedientesparcela(For000Expedientesparcelas for000Expedientesparcela) {
		getFor000Expedientesparcelas().add(for000Expedientesparcela);
		for000Expedientesparcela.setFor000Expediente(this);

		return for000Expedientesparcela;
	}

	public For000Expedientesparcelas removeFor000Expedientesparcela(For000Expedientesparcelas for000Expedientesparcela) {
		getFor000Expedientesparcelas().remove(for000Expedientesparcela);
		for000Expedientesparcela.setFor000Expediente(null);

		return for000Expedientesparcela;
	}

}