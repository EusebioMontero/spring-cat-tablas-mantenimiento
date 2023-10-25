package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_DOMICILIOSTIPOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_DOMICILIOSTIPOS")
@NamedQuery(name = "For000Domiciliostipos.findAll", query = "SELECT f FROM For000Domiciliostipos f")
public class For000Domiciliostipos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_DOMICILIOSTIPOS_DOTDOMICILIOTIPOID_GENERATOR", sequenceName = "FOR_000_DOMICILIOSTIPOS_SEQ")
	// @GeneratedValue(strategy=GenerationType.SEQUENCE,
	// generator="FOR_000_DOMICILIOSTIPOS_DOTDOMICILIOTIPOID_GENERATOR")
	@Column(name = "DOT_DOMICILIOTIPOID")
	private long dotDomiciliotipoid;

	@Column(name = "DOT_DESCRIPCION")
	private String dotDescripcion;

	@Column(name = "DOT_FECHA")
	private Timestamp dotFecha;

	@Column(name = "DOT_OPERACION")
	private BigDecimal dotOperacion;

	@Column(name = "DOT_USUARIO")
	private String dotUsuario;

	public For000Domiciliostipos() {
	}

	public long getDotDomiciliotipoid() {
		return this.dotDomiciliotipoid;
	}

	public void setDotDomiciliotipoid(long dotDomiciliotipoid) {
		this.dotDomiciliotipoid = dotDomiciliotipoid;
	}

	public String getDotDescripcion() {
		return this.dotDescripcion;
	}

	public void setDotDescripcion(String dotDescripcion) {
		this.dotDescripcion = dotDescripcion;
	}

	public Timestamp getDotFecha() {
		return this.dotFecha;
	}

	public void setDotFecha(Timestamp dotFecha) {
		this.dotFecha = dotFecha;
	}

	public BigDecimal getDotOperacion() {
		return this.dotOperacion;
	}

	public void setDotOperacion(BigDecimal dotOperacion) {
		this.dotOperacion = dotOperacion;
	}

	public String getDotUsuario() {
		return this.dotUsuario;
	}

	public void setDotUsuario(String dotUsuario) {
		this.dotUsuario = dotUsuario;
	}

}