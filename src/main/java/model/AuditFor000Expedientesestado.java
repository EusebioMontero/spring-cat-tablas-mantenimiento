package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESESTADOS database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESESTADOS")
@NamedQuery(name="AuditFor000Expedientesestado.findAll", query="SELECT a FROM AuditFor000Expedientesestado a")
public class AuditFor000Expedientesestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXE_DESCRIPCION")
	private String exeDescripcion;

	@Column(name="EXE_EXPEDIENTEESTADOID")
	private BigDecimal exeExpedienteestadoid;

	@Column(name="EXE_FECHA")
	private Timestamp exeFecha;

	@Column(name="EXE_OPERACION")
	private BigDecimal exeOperacion;

	@Column(name="EXE_PAUSARESOLUCIONEXPEDIENTE")
	private BigDecimal exePausaresolucionexpediente;

	@Column(name="EXE_USUARIO")
	private String exeUsuario;

	public AuditFor000Expedientesestado() {
	}

	public String getExeDescripcion() {
		return this.exeDescripcion;
	}

	public void setExeDescripcion(String exeDescripcion) {
		this.exeDescripcion = exeDescripcion;
	}

	public BigDecimal getExeExpedienteestadoid() {
		return this.exeExpedienteestadoid;
	}

	public void setExeExpedienteestadoid(BigDecimal exeExpedienteestadoid) {
		this.exeExpedienteestadoid = exeExpedienteestadoid;
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

}