package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_POBLACIONES database table.
 * 
 */
@Entity
@Table(name="FOR_000_POBLACIONES")
@NamedQuery(name="For000Poblacione.findAll", query="SELECT f FROM For000Poblacione f")
public class For000Poblacione implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_POBLACIONES_POBPOBLACIONID_GENERATOR")
	@Column(name="POB_POBLACIONID")
	private long pobPoblacionid;

	@Column(name="POB_FECHA")
	private Timestamp pobFecha;

	@Column(name="POB_OPERACION")
	private BigDecimal pobOperacion;

	@Column(name="POB_POBLACION")
	private String pobPoblacion;

	@Column(name="POB_USUARIO")
	private String pobUsuario;

	//bi-directional many-to-one association to For000Expedientesfincas
	@OneToMany(mappedBy="for000Poblacione")
	private List<For000Expedientesfincas> for000Expedientesfincas;

	//bi-directional many-to-one association to For000Provincia
	@ManyToOne
	@JoinColumn(name="POB_PROVINCIAID")
	private For000Provincia for000Provincia;

	public For000Poblacione() {
	}

	public long getPobPoblacionid() {
		return this.pobPoblacionid;
	}

	public void setPobPoblacionid(long pobPoblacionid) {
		this.pobPoblacionid = pobPoblacionid;
	}

	public Timestamp getPobFecha() {
		return this.pobFecha;
	}

	public void setPobFecha(Timestamp pobFecha) {
		this.pobFecha = pobFecha;
	}

	public BigDecimal getPobOperacion() {
		return this.pobOperacion;
	}

	public void setPobOperacion(BigDecimal pobOperacion) {
		this.pobOperacion = pobOperacion;
	}

	public String getPobPoblacion() {
		return this.pobPoblacion;
	}

	public void setPobPoblacion(String pobPoblacion) {
		this.pobPoblacion = pobPoblacion;
	}

	public String getPobUsuario() {
		return this.pobUsuario;
	}

	public void setPobUsuario(String pobUsuario) {
		this.pobUsuario = pobUsuario;
	}

	public List<For000Expedientesfincas> getFor000Expedientesfincas() {
		return this.for000Expedientesfincas;
	}

	public void setFor000Expedientesfincas(List<For000Expedientesfincas> for000Expedientesfincas) {
		this.for000Expedientesfincas = for000Expedientesfincas;
	}

	public For000Expedientesfincas addFor000Expedientesfinca(For000Expedientesfincas for000Expedientesfinca) {
		getFor000Expedientesfincas().add(for000Expedientesfinca);
		for000Expedientesfinca.setFor000Poblacione(this);

		return for000Expedientesfinca;
	}

	public For000Expedientesfincas removeFor000Expedientesfinca(For000Expedientesfincas for000Expedientesfinca) {
		getFor000Expedientesfincas().remove(for000Expedientesfinca);
		for000Expedientesfinca.setFor000Poblacione(null);

		return for000Expedientesfinca;
	}

	public For000Provincia getFor000Provincia() {
		return this.for000Provincia;
	}

	public void setFor000Provincia(For000Provincia for000Provincia) {
		this.for000Provincia = for000Provincia;
	}

}