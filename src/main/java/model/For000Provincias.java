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
@NamedQuery(name="For000Provincias.findAll", query="SELECT f FROM For000Provincias f")
public class For000Provincias implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_PROVINCIAS_PROPROVINCIAID_GENERATOR", sequenceName="FOR_000_PROVINCIAS_SEQ")
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

	//bi-directional many-to-one association to For000Domicilios
	@OneToMany(mappedBy="for000Provincia")
	private List<For000Domicilios> for000Domicilios;

	//bi-directional many-to-one association to For000Poblaciones
	@OneToMany(mappedBy="for000Provincia")
	private List<For000Poblaciones> for000Poblaciones;

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

	public List<For000Domicilios> getFor000Domicilios() {
		return this.for000Domicilios;
	}

	public void setFor000Domicilios(List<For000Domicilios> for000Domicilios) {
		this.for000Domicilios = for000Domicilios;
	}

	public For000Domicilios addFor000Domicilio(For000Domicilios for000Domicilio) {
		getFor000Domicilios().add(for000Domicilio);
		for000Domicilio.setFor000Provincia(this);

		return for000Domicilio;
	}

	public For000Domicilios removeFor000Domicilio(For000Domicilios for000Domicilio) {
		getFor000Domicilios().remove(for000Domicilio);
		for000Domicilio.setFor000Provincia(null);

		return for000Domicilio;
	}

	public List<For000Poblaciones> getFor000Poblaciones() {
		return this.for000Poblaciones;
	}

	public void setFor000Poblaciones(List<For000Poblaciones> for000Poblaciones) {
		this.for000Poblaciones = for000Poblaciones;
	}

	public For000Poblaciones addFor000Poblacione(For000Poblaciones for000Poblacione) {
		getFor000Poblaciones().add(for000Poblacione);
		for000Poblacione.setFor000Provincia(this);

		return for000Poblacione;
	}

	public For000Poblaciones removeFor000Poblacione(For000Poblaciones for000Poblacione) {
		getFor000Poblaciones().remove(for000Poblacione);
		for000Poblacione.setFor000Provincia(null);

		return for000Poblacione;
	}

}