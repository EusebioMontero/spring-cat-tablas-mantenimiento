package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_EXPEDIENTESESTADOS database table.
 * 
 */
@Entity
@Table(name="FOR_000_EXPEDIENTESESTADOS")
@NamedQuery(name="For000Expedientesestado.findAll", query="SELECT f FROM For000Expedientesestado f")
public class For000Expedientesestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_EXPEDIENTESESTADOS_EXEEXPEDIENTEESTADOID_GENERATOR", sequenceName="FOR_000_EXPEDIENTESESTADOS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_EXPEDIENTESESTADOS_EXEEXPEDIENTEESTADOID_GENERATOR")
	@Column(name="EXE_EXPEDIENTEESTADOID")
	private long exeExpedienteestadoid;

	@Column(name="EXE_DESCRIPCION")
	private String exeDescripcion;

	@Column(name="EXE_FECHA")
	private Timestamp exeFecha;

	@Column(name="EXE_OPERACION")
	private BigDecimal exeOperacion;

	@Column(name="EXE_PAUSARESOLUCIONEXPEDIENTE")
	private BigDecimal exePausaresolucionexpediente;

	@Column(name="EXE_USUARIO")
	private String exeUsuario;

	//bi-directional many-to-one association to For000Expedientes
	@OneToMany(mappedBy="for000Expedientesestado")
	private List<For000Expedientes> for000Expedientes;

	public For000Expedientesestado() {
	}

	public long getExeExpedienteestadoid() {
		return this.exeExpedienteestadoid;
	}

	public void setExeExpedienteestadoid(long exeExpedienteestadoid) {
		this.exeExpedienteestadoid = exeExpedienteestadoid;
	}

	public String getExeDescripcion() {
		return this.exeDescripcion;
	}

	public void setExeDescripcion(String exeDescripcion) {
		this.exeDescripcion = exeDescripcion;
	}

	public Timestamp getExeFecha() {
		return this.exeFecha;
	}

	public void setExeFecha(Timestamp exeFecha) {
		this.exeFecha = exeFecha;
	}

	public BigDecimal getExeOperacion() {
		return this.exeOperacion;
	}

	public void setExeOperacion(BigDecimal exeOperacion) {
		this.exeOperacion = exeOperacion;
	}

	public BigDecimal getExePausaresolucionexpediente() {
		return this.exePausaresolucionexpediente;
	}

	public void setExePausaresolucionexpediente(BigDecimal exePausaresolucionexpediente) {
		this.exePausaresolucionexpediente = exePausaresolucionexpediente;
	}

	public String getExeUsuario() {
		return this.exeUsuario;
	}

	public void setExeUsuario(String exeUsuario) {
		this.exeUsuario = exeUsuario;
	}

	public List<For000Expedientes> getFor000Expedientes() {
		return this.for000Expedientes;
	}

	public void setFor000Expedientes(List<For000Expedientes> for000Expedientes) {
		this.for000Expedientes = for000Expedientes;
	}

	public For000Expedientes addFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().add(for000Expediente);
		for000Expediente.setFor000Expedientesestado(this);

		return for000Expediente;
	}

	public For000Expedientes removeFor000Expediente(For000Expedientes for000Expediente) {
		getFor000Expedientes().remove(for000Expediente);
		for000Expediente.setFor000Expedientesestado(null);

		return for000Expediente;
	}

}