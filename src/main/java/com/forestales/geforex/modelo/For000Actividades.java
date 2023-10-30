package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_ACTIVIDADES database table.
 * 
 */
@Entity
@Table(name = "FOR_000_ACTIVIDADES")
@NamedQuery(name = "For000Actividades.findAll", query = "SELECT f FROM For000Actividades f")
public class For000Actividades implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_ACTIVIDADES_ACTACTIVIDADTIPOID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_ACTIVIDADES_ACTACTIVIDADTIPOID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_ACTIVIDADES_ACTACTIVIDADTIPOID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADES_SEQ", allocationSize = 1)
	@Column(name = "ACT_ACTIVIDADTIPOID")
	private long actActividadtipoid;

	@Column(name = "ACT_CODIGO")
	private String actCodigo;

	@Column(name = "ACT_DESCRIPCION")
	private String actDescripcion;

	@Column(name = "ACT_FECHA")
	private Timestamp actFecha;

	@Column(name = "ACT_OPERACION")
	private BigDecimal actOperacion;

	@Column(name = "ACT_USUARIO")
	private String actUsuario;

	// bi-directional many-to-one association to For000Actividadessubtipos
	@ManyToOne
	@JoinColumn(name = "ACT_ACTIVIDADSUBTIPOID")
	private For000Actividadessubtipos for000Actividadessubtipo;

	public For000Actividades() {
	}

	public long getActActividadtipoid() {
		return this.actActividadtipoid;
	}

	public void setActActividadtipoid(long actActividadtipoid) {
		this.actActividadtipoid = actActividadtipoid;
	}

	public String getActCodigo() {
		return this.actCodigo;
	}

	public void setActCodigo(String actCodigo) {
		this.actCodigo = actCodigo;
	}

	public String getActDescripcion() {
		return this.actDescripcion;
	}

	public void setActDescripcion(String actDescripcion) {
		this.actDescripcion = actDescripcion;
	}

	public Timestamp getActFecha() {
		return this.actFecha;
	}

	public void setActFecha(Timestamp actFecha) {
		this.actFecha = actFecha;
	}

	public BigDecimal getActOperacion() {
		return this.actOperacion;
	}

	public void setActOperacion(BigDecimal actOperacion) {
		this.actOperacion = actOperacion;
	}

	public String getActUsuario() {
		return this.actUsuario;
	}

	public void setActUsuario(String actUsuario) {
		this.actUsuario = actUsuario;
	}

	public For000Actividadessubtipos getFor000Actividadessubtipo() {
		return this.for000Actividadessubtipo;
	}

	public void setFor000Actividadessubtipo(For000Actividadessubtipos for000Actividadessubtipo) {
		this.for000Actividadessubtipo = for000Actividadessubtipo;
	}

}