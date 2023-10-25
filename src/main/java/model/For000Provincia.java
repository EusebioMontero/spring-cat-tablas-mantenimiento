package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_PROVINCIAS database table.
 * 
 */
@Entity
@Table(name="FOR_000_PROVINCIAS")
@NamedQuery(name="For000Provincia.findAll", query="SELECT f FROM For000Provincia f")
public class For000Provincia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_PROVINCIAS_PROPROVINCIAID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_PROVINCIAS_PROPROVINCIAID_GENERATOR")
	@Column(name="PRO_PROVINCIAID")
	private long proProvinciaid;

	@Column(name="PRO_CODIGO")
	private String proCodigo;

	@Column(name="PRO_FECHA")
	private Timestamp proFecha;

	@Column(name="PRO_OPERACION")
	private BigDecimal proOperacion;

	@Column(name="PRO_PROVINCIA")
	private String proProvincia;

	@Column(name="PRO_USUARIO")
	private String proUsuario;

	//bi-directional many-to-one association to For000Expedientesfincas
	@OneToMany(mappedBy="for000Provincia")
	private List<For000Expedientesfincas> for000Expedientesfincas;

	//bi-directional many-to-one association to For000Poblacione
	@OneToMany(mappedBy="for000Provincia")
	private List<For000Poblacione> for000Poblaciones;

	public For000Provincia() {
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

	public List<For000Expedientesfincas> getFor000Expedientesfincas() {
		return this.for000Expedientesfincas;
	}

	public void setFor000Expedientesfincas(List<For000Expedientesfincas> for000Expedientesfincas) {
		this.for000Expedientesfincas = for000Expedientesfincas;
	}

	public For000Expedientesfincas addFor000Expedientesfinca(For000Expedientesfincas for000Expedientesfinca) {
		getFor000Expedientesfincas().add(for000Expedientesfinca);
		for000Expedientesfinca.setFor000Provincia(this);

		return for000Expedientesfinca;
	}

	public For000Expedientesfincas removeFor000Expedientesfinca(For000Expedientesfincas for000Expedientesfinca) {
		getFor000Expedientesfincas().remove(for000Expedientesfinca);
		for000Expedientesfinca.setFor000Provincia(null);

		return for000Expedientesfinca;
	}

	public List<For000Poblacione> getFor000Poblaciones() {
		return this.for000Poblaciones;
	}

	public void setFor000Poblaciones(List<For000Poblacione> for000Poblaciones) {
		this.for000Poblaciones = for000Poblaciones;
	}

	public For000Poblacione addFor000Poblacione(For000Poblacione for000Poblacione) {
		getFor000Poblaciones().add(for000Poblacione);
		for000Poblacione.setFor000Provincia(this);

		return for000Poblacione;
	}

	public For000Poblacione removeFor000Poblacione(For000Poblacione for000Poblacione) {
		getFor000Poblaciones().remove(for000Poblacione);
		for000Poblacione.setFor000Provincia(null);

		return for000Poblacione;
	}

}