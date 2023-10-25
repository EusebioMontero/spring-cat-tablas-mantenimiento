package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_TIPOSACTUACIONES database table.
 * 
 */
@Entity
@Table(name="FOR_000_TIPOSACTUACIONES")
@NamedQuery(name="For000Tiposactuacione.findAll", query="SELECT f FROM For000Tiposactuacione f")
public class For000Tiposactuacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ACT_ACTUACIONTIPOID")
	private Long actActuaciontipoid;

	@Column(name="ACT_DESCRIPCION")
	private String actDescripcion;

	@Column(name="ACT_FECHA")
	private Timestamp actFecha;

	@Column(name="ACT_OPERACION")
	private BigDecimal actOperacion;

	@Column(name="ACT_USUARIO")
	private String actUsuario;

	public For000Tiposactuacione() {
	}

	public Long getActActuaciontipoid() {
		return this.actActuaciontipoid;
	}

	public void setActActuaciontipoid(Long actActuaciontipoid) {
		this.actActuaciontipoid = actActuaciontipoid;
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

}