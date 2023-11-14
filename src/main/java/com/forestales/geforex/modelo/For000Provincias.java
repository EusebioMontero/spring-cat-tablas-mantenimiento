package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_PROVINCIAS database table.
 * 
 */
@Entity
@Table(name = "FOR_000_PROVINCIAS")
@NamedQuery(name = "For000Provincias.findAll", query = "SELECT f FROM For000Provincias f")
public class For000Provincias implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FOR_000_PROVINCIAS_PROPROVINCIAID_GENERATOR")
	@SequenceGenerator(name = "FOR_000_PROVINCIAS_PROPROVINCIAID_GENERATOR", sequenceName = "FOR_000_PROVINCIAS_SEQ", allocationSize = 1)
	@Column(name = "PRO_PROVINCIAID")
	private long proProvinciaid;

	@Column(name = "PRO_CODIGO")
	private String proCodigo;

	@Column(name = "PRO_FECHA")
	private Timestamp proFecha;

	@Column(name = "PRO_OPERACION")
	private BigDecimal proOperacion;

	@Column(name = "PRO_PROVINCIA")
	private String proProvincia;

	@Column(name = "PRO_USUARIO")
	private String proUsuario;

	public For000Provincias() {
	}

	public long getProProvinciaid() {
		return this.proProvinciaid;
	}

	public void setProProvinciaid(long proProvinciaid) {
		this.proProvinciaid = proProvinciaid;
	}

	public String getProCodigo() {
		return this.proCodigo;
	}

	public void setProCodigo(String proCodigo) {
		this.proCodigo = proCodigo;
	}

	public Timestamp getProFecha() {
		return this.proFecha;
	}

	public void setProFecha(Timestamp proFecha) {
		this.proFecha = proFecha;
	}

	public BigDecimal getProOperacion() {
		return this.proOperacion;
	}

	public void setProOperacion(BigDecimal proOperacion) {
		this.proOperacion = proOperacion;
	}

	public String getProProvincia() {
		return this.proProvincia;
	}

	public void setProProvincia(String proProvincia) {
		this.proProvincia = proProvincia;
	}

	public String getProUsuario() {
		return this.proUsuario;
	}

	public void setProUsuario(String proUsuario) {
		this.proUsuario = proUsuario;
	}

}