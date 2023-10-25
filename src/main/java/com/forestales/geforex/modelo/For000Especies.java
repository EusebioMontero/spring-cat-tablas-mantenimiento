package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_ESPECIES database table.
 * 
 */
@Entity
@Table(name = "FOR_000_ESPECIES")
@NamedQuery(name = "For000Especies.findAll", query = "SELECT f FROM For000Especies f")
public class For000Especies implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_ESPECIES_ESPESPECIEID_GENERATOR", sequenceName = "FOR_000_ESPECIES_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_ESPECIES_ESPESPECIEID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_ESPECIES_ESPESPECIEID_GENERATOR", sequenceName = "FOR_000_ESPECIES_SEQ", allocationSize = 1)
	@Column(name = "ESP_ESPECIEID")
	private long espEspecieid;

	@Column(name = "ESP_ESPECIEPROTEGIDA")
	private String espEspecieprotegida;

	@Column(name = "ESP_FECHA")
	private Timestamp espFecha;

	@Column(name = "ESP_NOMBRECOMUN")
	private String espNombrecomun;

	@Column(name = "ESP_OPERACION")
	private BigDecimal espOperacion;

	@Column(name = "ESP_USUARIO")
	private String espUsuario;

	public For000Especies() {
	}

	public long getEspEspecieid() {
		return this.espEspecieid;
	}

	public void setEspEspecieid(long espEspecieid) {
		this.espEspecieid = espEspecieid;
	}

	public String getEspEspecieprotegida() {
		return this.espEspecieprotegida;
	}

	public void setEspEspecieprotegida(String espEspecieprotegida) {
		this.espEspecieprotegida = espEspecieprotegida;
	}

	public Timestamp getEspFecha() {
		return this.espFecha;
	}

	public void setEspFecha(Timestamp espFecha) {
		this.espFecha = espFecha;
	}

	public String getEspNombrecomun() {
		return this.espNombrecomun;
	}

	public void setEspNombrecomun(String espNombrecomun) {
		this.espNombrecomun = espNombrecomun;
	}

	public BigDecimal getEspOperacion() {
		return this.espOperacion;
	}

	public void setEspOperacion(BigDecimal espOperacion) {
		this.espOperacion = espOperacion;
	}

	public String getEspUsuario() {
		return this.espUsuario;
	}

	public void setEspUsuario(String espUsuario) {
		this.espUsuario = espUsuario;
	}

}