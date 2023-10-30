package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Set;

/**
 * The persistent class for the FOR_000_DOCUMENTOSTIPOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_DOCUMENTOSTIPOS")
@NamedQuery(name = "For000Documentostipos.findAll", query = "SELECT f FROM For000Documentostipos f")
public class For000Documentostipos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_DOCUMENTOSTIPOS_DOTTIPODOCUMENTOID_GENERATOR", sequenceName = "FOR_000_DOCUMENTOSTIPOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_DOCUMENTOSTIPOS_DOTTIPODOCUMENTOID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_DOCUMENTOSTIPOS_DOTTIPODOCUMENTOID_GENERATOR", sequenceName = "FOR_000_DOCUMENTOSTIPOS_SEQ", allocationSize = 1)
	@Column(name = "DOT_TIPODOCUMENTOID")
	private long dotTipodocumentoid;

	@Column(name = "DOT_DESCRIPCION")
	private String dotDescripcion;

	@Column(name = "DOT_FECHA")
	private Timestamp dotFecha;

	@Column(name = "DOT_OPERACION")
	private BigDecimal dotOperacion;

	@Column(name = "DOT_USUARIO")
	private String dotUsuario;

	public For000Documentostipos() {
	}

	public long getDotTipodocumentoid() {
		return this.dotTipodocumentoid;
	}

	public void setDotTipodocumentoid(long dotTipodocumentoid) {
		this.dotTipodocumentoid = dotTipodocumentoid;
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