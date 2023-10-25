package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_MUNICIPIOSSIGPAC database table.
 * 
 */
@Entity
@Table(name = "FOR_000_MUNICIPIOSSIGPAC")
@NamedQuery(name = "For000Municipiossigpac.findAll", query = "SELECT f FROM For000Municipiossigpac f")
public class For000Municipiossigpac implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_MUNICIPIOSSIGPAC_MUSMUNICIPIOSIGPACID_GENERATOR", sequenceName = "MUS_MUNICIPIOSIGPACID")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_MUNICIPIOSSIGPAC_MUSMUNICIPIOSIGPACID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_MUNICIPIOSSIGPAC_MUSMUNICIPIOSIGPACID_GENERATOR", sequenceName = "FOR_000_MUNICIPIOSSIGPAC_SEQ", allocationSize = 1)
	@Column(name = "MUS_MUNICIPIOSIGPACID")
	private long musMunicipiosigpacid;

	@Column(name = "MUS_CODIGOMUNICIPIO")
	private BigDecimal musCodigomunicipio;

	@Column(name = "MUS_CODIGOPROVINCIA")
	private BigDecimal musCodigoprovincia;

	@Column(name = "MUS_FECHA")
	private Timestamp musFecha;

	@Column(name = "MUS_NOMBREMUNICIPIO")
	private String musNombremunicipio;

	@Column(name = "MUS_OPERACION")
	private BigDecimal musOperacion;

	@Column(name = "MUS_USUARIO")
	private String musUsuario;

	public For000Municipiossigpac() {
	}

	public long getMusMunicipiosigpacid() {
		return this.musMunicipiosigpacid;
	}

	public void setMusMunicipiosigpacid(long musMunicipiosigpacid) {
		this.musMunicipiosigpacid = musMunicipiosigpacid;
	}

	public BigDecimal getMusCodigomunicipio() {
		return this.musCodigomunicipio;
	}

	public void setMusCodigomunicipio(BigDecimal musCodigomunicipio) {
		this.musCodigomunicipio = musCodigomunicipio;
	}

	public BigDecimal getMusCodigoprovincia() {
		return this.musCodigoprovincia;
	}

	public void setMusCodigoprovincia(BigDecimal musCodigoprovincia) {
		this.musCodigoprovincia = musCodigoprovincia;
	}

	public Timestamp getMusFecha() {
		return this.musFecha;
	}

	public void setMusFecha(Timestamp musFecha) {
		this.musFecha = musFecha;
	}

	public String getMusNombremunicipio() {
		return this.musNombremunicipio;
	}

	public void setMusNombremunicipio(String musNombremunicipio) {
		this.musNombremunicipio = musNombremunicipio;
	}

	public BigDecimal getMusOperacion() {
		return this.musOperacion;
	}

	public void setMusOperacion(BigDecimal musOperacion) {
		this.musOperacion = musOperacion;
	}

	public String getMusUsuario() {
		return this.musUsuario;
	}

	public void setMusUsuario(String musUsuario) {
		this.musUsuario = musUsuario;
	}

}