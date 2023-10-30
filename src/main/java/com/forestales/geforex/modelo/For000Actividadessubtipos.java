package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_ACTIVIDADESSUBTIPOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_ACTIVIDADESSUBTIPOS")
@NamedQuery(name = "For000Actividadessubtipos.findAll", query = "SELECT f FROM For000Actividadessubtipos f")
public class For000Actividadessubtipos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_ACTIVIDADESSUBTIPOS_ID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADESSUBTIPOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_ACTIVIDADESSUBTIPOS_ASTACTIVIDADSUBTIPOID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_ACTIVIDADESSUBTIPOS_ASTACTIVIDADSUBTIPOID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADESSUBTIPOS_SEQ", allocationSize = 1)
	@Column(name = "AST_ACTIVIDADSUBTIPOID")
	private long astActividadsubtipoid;

	@Column(name = "AST_DESCRIPCION")
	private String astDescripcion;

	@Column(name = "AST_FECHA")
	private Timestamp astFecha;

	@Column(name = "AST_OPERACION")
	private BigDecimal astOperacion;

	@Column(name = "AST_USUARIO")
	private String astUsuario;

	// bi-directional many-to-one association to For000Actividadestipos
	@ManyToOne
	@JoinColumn(name = "AST_ACTIVIDADTIPOID")
	private For000Actividadestipos for000Actividadestipo;

	public For000Actividadessubtipos() {
	}

	public long getAstActividadsubtipoid() {
		return this.astActividadsubtipoid;
	}

	public void setAstActividadsubtipoid(long astActividadsubtipoid) {
		this.astActividadsubtipoid = astActividadsubtipoid;
	}

	public String getAstDescripcion() {
		return this.astDescripcion;
	}

	public void setAstDescripcion(String astDescripcion) {
		this.astDescripcion = astDescripcion;
	}

	public Timestamp getAstFecha() {
		return this.astFecha;
	}

	public void setAstFecha(Timestamp astFecha) {
		this.astFecha = astFecha;
	}

	public BigDecimal getAstOperacion() {
		return this.astOperacion;
	}

	public void setAstOperacion(BigDecimal astOperacion) {
		this.astOperacion = astOperacion;
	}

	public String getAstUsuario() {
		return this.astUsuario;
	}

	public void setAstUsuario(String astUsuario) {
		this.astUsuario = astUsuario;
	}

	public For000Actividadestipos getFor000Actividadestipo() {
		return this.for000Actividadestipo;
	}

	public void setFor000Actividadestipo(For000Actividadestipos for000Actividadestipo) {
		this.for000Actividadestipo = for000Actividadestipo;
	}

}