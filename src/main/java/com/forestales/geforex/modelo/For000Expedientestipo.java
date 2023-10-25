package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTESTIPOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESTIPOS")
@NamedQuery(name = "For000Expedientestipo.findAll", query = "SELECT f FROM For000Expedientestipo f")
public class For000Expedientestipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESTIPOS_EXTEXPEDIENTETIPOID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESTIPOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_EXPEDIENTESTIPOS_EXTEXPEDIENTETIPOID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESTIPOS_EXTEXPEDIENTETIPOID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESTIPOS_SEQ", allocationSize = 1)
	@Column(name = "EXT_EXPEDIENTETIPOID")
	private long extExpedientetipoid;

	@Column(name = "EXT_DESCRIPCION")
	private String extDescripcion;

	@Column(name = "EXT_FECHA")
	private Timestamp extFecha;

	@Column(name = "EXT_LETRA")
	private String extLetra;

	@Column(name = "EXT_NUMERACIONCONJUNTA")
	private Integer extNumeracionconjunta;

	@Column(name = "EXT_OPERACION")
	private Integer extOperacion;

	@Column(name = "EXT_PLAZORESOLUCION")
	private Integer extPlazoresolucion;

	@Column(name = "EXT_SILENCIOADMINISTRATIVO")
	private Integer extSilencioadministrativo;

	@Column(name = "EXT_USUARIO")
	private String extUsuario;

	public For000Expedientestipo() {
	}

	public long getExtExpedientetipoid() {
		return this.extExpedientetipoid;
	}

	public void setExtExpedientetipoid(long extExpedientetipoid) {
		this.extExpedientetipoid = extExpedientetipoid;
	}

	public String getExtDescripcion() {
		return this.extDescripcion;
	}

	public void setExtDescripcion(String extDescripcion) {
		this.extDescripcion = extDescripcion;
	}

	public Timestamp getExtFecha() {
		return this.extFecha;
	}

	public void setExtFecha(Timestamp extFecha) {
		this.extFecha = extFecha;
	}

	public String getExtLetra() {
		return this.extLetra;
	}

	public void setExtLetra(String extLetra) {
		this.extLetra = extLetra;
	}

	public Integer getExtNumeracionconjunta() {
		return this.extNumeracionconjunta;
	}

	public void setExtNumeracionconjunta(Integer extNumeracionconjunta) {
		this.extNumeracionconjunta = extNumeracionconjunta;
	}

	public Integer getExtOperacion() {
		return this.extOperacion;
	}

	public void setExtOperacion(Integer extOperacion) {
		this.extOperacion = extOperacion;
	}

	public Integer getExtPlazoresolucion() {
		return this.extPlazoresolucion;
	}

	public void setExtPlazoresolucion(Integer extPlazoresolucion) {
		this.extPlazoresolucion = extPlazoresolucion;
	}

	public Integer getExtSilencioadministrativo() {
		return this.extSilencioadministrativo;
	}

	public void setExtSilencioadministrativo(Integer extSilencioadministrativo) {
		this.extSilencioadministrativo = extSilencioadministrativo;
	}

	public String getExtUsuario() {
		return this.extUsuario;
	}

	public void setExtUsuario(String extUsuario) {
		this.extUsuario = extUsuario;
	}

}