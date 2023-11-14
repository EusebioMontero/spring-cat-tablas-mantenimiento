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
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR", sequenceName = "FOR_000_POBLACIONES_SEQ", allocationSize = 1)
	@Column(name = "POB_POBLACIONID")
	private long pobPoblacionid;

	@Column(name = "POB_FECHA")
	private Timestamp pobFecha;

	@Column(name = "POB_OPERACION")
	private BigDecimal pobOperacion;

	@Column(name = "POB_POBLACION")
	private String pobPoblacion;

	@Column(name = "POB_USUARIO")
	private String pobUsuario;

	// bi-directional many-to-one association to For000Provincias
	@ManyToOne
	@JoinColumn(name = "POB_PROVINCIAID")
	private For000Provincias for000Provincias;

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

	public String getPobUsuario() {
		return this.pobUsuario;
	}

	public void setPobUsuario(String pobUsuario) {
		this.pobUsuario = pobUsuario;
	}

	public For000Provincias getFor000Provincias() {
		return this.for000Provincias;
	}

	public void setFor000Provincias(For000Provincias for000Provincias) {
		this.for000Provincias = for000Provincias;
	}

}