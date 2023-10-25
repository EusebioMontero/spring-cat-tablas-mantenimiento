package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the FOR_000_EXPEDIENTESESTADOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESESTADOS")
@NamedQuery(name = "For000Expedientesestado.findAll", query = "SELECT f FROM For000Expedientesestado f")
public class For000Expedientesestado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESESTADOS_EXEEXPEDIENTEESTADOID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESESTADOS_SEQ")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "FOR_000_EXPEDIENTESESTADOS_EXEEXPEDIENTEESTADOID_GENERATOR")
	@Column(name = "EXE_EXPEDIENTEESTADOID")
	private long exeExpedienteestadoid;

	@Column(name = "EXE_DESCRIPCION")
	private String exeDescripcion;

	@Column(name = "EXE_FECHA")
	private Timestamp exeFecha;

	@Column(name = "EXE_OPERACION")
	private Integer exeOperacion;

	@Column(name = "EXE_PAUSARESOLUCIONEXPEDIENTE")
	private Integer exePausaresolucionexpediente;

	@Column(name = "EXE_USUARIO")
	private String exeUsuario;

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

	public Integer getExeOperacion() {
		return this.exeOperacion;
	}

	public void setExeOperacion(Integer exeOperacion) {
		this.exeOperacion = exeOperacion;
	}

	public Integer getExePausaresolucionexpediente() {
		return this.exePausaresolucionexpediente;
	}

	public void setExePausaresolucionexpediente(Integer exePausaresolucionexpediente) {
		this.exePausaresolucionexpediente = exePausaresolucionexpediente;
	}

	public String getExeUsuario() {
		return this.exeUsuario;
	}

	public void setExeUsuario(String exeUsuario) {
		this.exeUsuario = exeUsuario;
	}

}