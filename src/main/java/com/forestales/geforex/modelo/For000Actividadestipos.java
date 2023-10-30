package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the FOR_000_ACTIVIDADESTIPOS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_ACTIVIDADESTIPOS")
@NamedQuery(name = "For000Actividadestipos.findAll", query = "SELECT f FROM For000Actividadestipos f")
public class For000Actividadestipos implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_ACTIVIDADESTIPOS_ID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADESTIPOS_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_ACTIVIDADESTIPOS_ID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_ACTIVIDADESTIPOS_ID_GENERATOR", sequenceName = "FOR_000_ACTIVIDADESTIPOS_SEQ", allocationSize = 1)
	@Column(name = "ATI_ACTIVIDADTIPOID")
	private Long atiActividadtipoid;

	@Column(name = "ATI_DESCRIPCION")
	private String atiDescripcion;

	@Column(name = "ATI_FECHA")
	private Timestamp atiFecha;

	@Column(name = "ATI_OPERACION")
	private BigDecimal atiOperacion;

	@Column(name = "ATI_USUARIO")
	private String atiUsuario;

	public For000Actividadestipos() {
	}

	public Long getAtiActividadtipoid() {
		return atiActividadtipoid;
	}

	public void setAtiActividadtipoid(Long atiActividadtipoid) {
		this.atiActividadtipoid = atiActividadtipoid;
	}

	public String getAtiDescripcion() {
		return this.atiDescripcion;
	}

	public void setAtiDescripcion(String atiDescripcion) {
		this.atiDescripcion = atiDescripcion;
	}

	public Timestamp getAtiFecha() {
		return this.atiFecha;
	}

	public void setAtiFecha(Timestamp atiFecha) {
		this.atiFecha = atiFecha;
	}

	public BigDecimal getAtiOperacion() {
		return this.atiOperacion;
	}

	public void setAtiOperacion(BigDecimal atiOperacion) {
		this.atiOperacion = atiOperacion;
	}

	public String getAtiUsuario() {
		return this.atiUsuario;
	}

	public void setAtiUsuario(String atiUsuario) {
		this.atiUsuario = atiUsuario;
	}

}