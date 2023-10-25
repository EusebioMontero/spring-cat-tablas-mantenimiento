package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTESPARCELAS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_EXPEDIENTESPARCELAS")
@NamedQuery(name = "For000Expedientesparcelas.findAll", query = "SELECT f FROM For000Expedientesparcelas f")
public class For000Expedientesparcelas implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_EXPEDIENTESPARCELAS_EPAEXPEDIENTEPARCELAID_GENERATOR", sequenceName = "FOR_000_EXPEDIENTESPARCELAS_SEQ")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "FOR_000_EXPEDIENTESPARCELAS_EPAEXPEDIENTEPARCELAID_GENERATOR")
	@Column(name = "EPA_EXPEDIENTEPARCELAID")
	private long epaExpedienteparcelaid;

	@Column(name = "EPA_ALTURAMADERABLE")
	private BigDecimal epaAlturamaderable;

	@Column(name = "EPA_ARBOLESACORTAR")
	private BigDecimal epaArbolesacortar;

	@Column(name = "EPA_DENSIDAD")
	private BigDecimal epaDensidad;

	@Column(name = "EPA_DIAMETROMEDIO")
	private BigDecimal epaDiametromedio;

	@Column(name = "EPA_ESTEREOCORTEZA")
	private BigDecimal epaEstereocorteza;

	@Column(name = "EPA_FECHA")
	private Timestamp epaFecha;

	@Column(name = "EPA_KGLENA")
	private BigDecimal epaKglena;

	@Column(name = "EPA_M3MADERA")
	private BigDecimal epaM3madera;

	@Column(name = "EPA_OPERACION")
	private BigDecimal epaOperacion;

	@Column(name = "EPA_PARCELA")
	private BigDecimal epaParcela;

	@Column(name = "EPA_POLIGONO")
	private BigDecimal epaPoligono;

	@Column(name = "EPA_PROVINCIAID")
	private BigDecimal epaProvinciaid;

	@Column(name = "EPA_RECINTO")
	private BigDecimal epaRecinto;

	@Column(name = "EPA_SUPERFICIE")
	private BigDecimal epaSuperficie;

	@Column(name = "EPA_SUPERFICIEACTUACION")
	private BigDecimal epaSuperficieactuacion;

	@Column(name = "EPA_USUARIO")
	private String epaUsuario;

	@Column(name = "EPA_ZONA")
	private BigDecimal epaZona;

	// bi-directional many-to-one association to For000Expedientesparcelas
	@ManyToOne
	@JoinColumn(name = "EPA_ESPECIEID")
	private For000Expedientesparcelas for000Especy;

	// bi-directional many-to-one association to For000Expedienteshistorial
	@ManyToOne
	@JoinColumn(name = "EPA_EXPEDIENTEID")
	private For000Expedientes for000Expedientes;

	// bi-directional many-to-one association to For000Municipiossigpac
	@ManyToOne
	@JoinColumn(name = "EPA_MUNICIPIOSIGPACID")
	private For000Municipiossigpac for000Municipiossigpac;

	// bi-directional many-to-one association to For000Tiposactuaciones
	@ManyToOne
	@JoinColumn(name = "EPA_ACTUACIONTIPOID")
	private For000Tiposactuaciones for000Tiposactuacione;

	public For000Expedientesparcelas() {
	}

	public long getEpaExpedienteparcelaid() {
		return this.epaExpedienteparcelaid;
	}

	public void setEpaExpedienteparcelaid(long epaExpedienteparcelaid) {
		this.epaExpedienteparcelaid = epaExpedienteparcelaid;
	}

	public BigDecimal getEpaAlturamaderable() {
		return this.epaAlturamaderable;
	}

	public void setEpaAlturamaderable(BigDecimal epaAlturamaderable) {
		this.epaAlturamaderable = epaAlturamaderable;
	}

	public BigDecimal getEpaArbolesacortar() {
		return this.epaArbolesacortar;
	}

	public void setEpaArbolesacortar(BigDecimal epaArbolesacortar) {
		this.epaArbolesacortar = epaArbolesacortar;
	}

	public BigDecimal getEpaDensidad() {
		return this.epaDensidad;
	}

	public void setEpaDensidad(BigDecimal epaDensidad) {
		this.epaDensidad = epaDensidad;
	}

	public BigDecimal getEpaDiametromedio() {
		return this.epaDiametromedio;
	}

	public void setEpaDiametromedio(BigDecimal epaDiametromedio) {
		this.epaDiametromedio = epaDiametromedio;
	}

	public BigDecimal getEpaEstereocorteza() {
		return this.epaEstereocorteza;
	}

	public void setEpaEstereocorteza(BigDecimal epaEstereocorteza) {
		this.epaEstereocorteza = epaEstereocorteza;
	}

	public Timestamp getEpaFecha() {
		return this.epaFecha;
	}

	public void setEpaFecha(Timestamp epaFecha) {
		this.epaFecha = epaFecha;
	}

	public BigDecimal getEpaKglena() {
		return this.epaKglena;
	}

	public void setEpaKglena(BigDecimal epaKglena) {
		this.epaKglena = epaKglena;
	}

	public BigDecimal getEpaM3madera() {
		return this.epaM3madera;
	}

	public void setEpaM3madera(BigDecimal epaM3madera) {
		this.epaM3madera = epaM3madera;
	}

	public BigDecimal getEpaOperacion() {
		return this.epaOperacion;
	}

	public void setEpaOperacion(BigDecimal epaOperacion) {
		this.epaOperacion = epaOperacion;
	}

	public BigDecimal getEpaParcela() {
		return this.epaParcela;
	}

	public void setEpaParcela(BigDecimal epaParcela) {
		this.epaParcela = epaParcela;
	}

	public BigDecimal getEpaPoligono() {
		return this.epaPoligono;
	}

	public void setEpaPoligono(BigDecimal epaPoligono) {
		this.epaPoligono = epaPoligono;
	}

	public BigDecimal getEpaProvinciaid() {
		return this.epaProvinciaid;
	}

	public void setEpaProvinciaid(BigDecimal epaProvinciaid) {
		this.epaProvinciaid = epaProvinciaid;
	}

	public BigDecimal getEpaRecinto() {
		return this.epaRecinto;
	}

	public void setEpaRecinto(BigDecimal epaRecinto) {
		this.epaRecinto = epaRecinto;
	}

	public BigDecimal getEpaSuperficie() {
		return this.epaSuperficie;
	}

	public void setEpaSuperficie(BigDecimal epaSuperficie) {
		this.epaSuperficie = epaSuperficie;
	}

	public BigDecimal getEpaSuperficieactuacion() {
		return this.epaSuperficieactuacion;
	}

	public void setEpaSuperficieactuacion(BigDecimal epaSuperficieactuacion) {
		this.epaSuperficieactuacion = epaSuperficieactuacion;
	}

	public String getEpaUsuario() {
		return this.epaUsuario;
	}

	public void setEpaUsuario(String epaUsuario) {
		this.epaUsuario = epaUsuario;
	}

	public BigDecimal getEpaZona() {
		return this.epaZona;
	}

	public void setEpaZona(BigDecimal epaZona) {
		this.epaZona = epaZona;
	}

	public For000Expedientesparcelas getFor000Especy() {
		return this.for000Especy;
	}

	public void setFor000Especy(For000Expedientesparcelas for000Especy) {
		this.for000Especy = for000Especy;
	}

	public For000Expedientes getFor000Expedientes() {
		return this.for000Expedientes;
	}

	public void setFor000Expedientse(For000Expedientes for000Expedientes) {
		this.for000Expedientes = for000Expedientes;
	}

	public For000Municipiossigpac getFor000Municipiossigpac() {
		return this.for000Municipiossigpac;
	}

	public void setFor000Municipiossigpac(For000Municipiossigpac for000Municipiossigpac) {
		this.for000Municipiossigpac = for000Municipiossigpac;
	}

	public For000Tiposactuaciones getFor000Tiposactuacione() {
		return this.for000Tiposactuacione;
	}

	public void setFor000Tiposactuacione(For000Tiposactuaciones for000Tiposactuacione) {
		this.for000Tiposactuacione = for000Tiposactuacione;
	}

}