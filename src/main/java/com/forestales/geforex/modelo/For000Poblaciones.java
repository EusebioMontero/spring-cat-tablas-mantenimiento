package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_POBLACIONES database table.
 * 
 */
@Entity
@Table(name = "FOR_000_POBLACIONES")
@NamedQuery(name = "For000Poblaciones.findAll", query = "SELECT f FROM For000Poblaciones f")
public class For000Poblaciones implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR", sequenceName = "FOR_000_POBLACIONES_SEQ")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR")
	@Column(name = "POB_POBLACIONID")
	private long pobPoblacionid;

	@Column(name = "POB_FECHA")
	private Timestamp pobFecha;

	@Column(name = "POB_OPERACION")
	private BigDecimal pobOperacion;

	@Column(name = "POB_POBLACION")
	private String pobPoblacion;

	@Column(name = "POB_PROVINCIAID")
	private BigDecimal pobProvinciaid;

	@Column(name = "POB_USUARIO")
	private String pobUsuario;

	public For000Poblaciones() {
	}

	public long getPobPoblacionid() {
		return this.pobPoblacionid;
	}

	public void setPobPoblacionid(long pobPoblacionid) {
		this.pobPoblacionid = pobPoblacionid;
	}

	public Timestamp getPobFecha() {
		return this.pobFecha;
	}

	public void setPobFecha(Timestamp pobFecha) {
		this.pobFecha = pobFecha;
	}

	public BigDecimal getPobOperacion() {
		return this.pobOperacion;
	}

	public void setPobOperacion(BigDecimal pobOperacion) {
		this.pobOperacion = pobOperacion;
	}

	public String getPobPoblacion() {
		return this.pobPoblacion;
	}

	public void setPobPoblacion(String pobPoblacion) {
		this.pobPoblacion = pobPoblacion;
	}

	public BigDecimal getPobProvinciaid() {
		return this.pobProvinciaid;
	}

	public void setPobProvinciaid(BigDecimal pobProvinciaid) {
		this.pobProvinciaid = pobProvinciaid;
	}

	public String getPobUsuario() {
		return this.pobUsuario;
	}

	public void setPobUsuario(String pobUsuario) {
		this.pobUsuario = pobUsuario;
	}

}