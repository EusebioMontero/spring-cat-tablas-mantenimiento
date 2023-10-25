package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_DOMICILIOS database table.
 * 
 */
@Entity
@Table(name="FOR_000_DOMICILIOS")
@NamedQuery(name="For000Domicilios.findAll", query="SELECT f FROM For000Domicilios f")
public class For000Domicilios implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_DOMICILIOS_DOMDOMICILIOID_GENERATOR", sequenceName="FOR_000_DOMICILIOS_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_DOMICILIOS_DOMDOMICILIOID_GENERATOR")
	@Column(name="DOM_DOMICILIOID")
	private long domDomicilioid;

	@Column(name="DOM_ACTIVO")
	private BigDecimal domActivo;

	@Column(name="DOM_CODIGOPOSTAL")
	private String domCodigopostal;

	@Column(name="DOM_DIRECCION")
	private String domDireccion;

	@Column(name="DOM_FECHA")
	private Timestamp domFecha;

	@Column(name="DOM_OPERACION")
	private BigDecimal domOperacion;

	@Column(name="DOM_USUARIO")
	private String domUsuario;

	//bi-directional many-to-one association to For000Domiciliostipos
	@ManyToOne
	@JoinColumn(name="DOM_DOMICILIOTIPOID")
	private For000Domiciliostipos for000Domiciliostipo;

	//bi-directional many-to-one association to For000Poblaciones
	@ManyToOne
	@JoinColumn(name="DOM_POBLACIONID")
	private For000Poblaciones for000Poblacione;

	//bi-directional many-to-one association to For000Provincias
	@ManyToOne
	@JoinColumn(name="DOM_PROVINCIAID")
	private For000Provincias for000Provincia;

	//bi-directional many-to-one association to For000Solicitantes
	@ManyToOne
	@JoinColumn(name="DOM_SOLICITANTEID")
	private For000Solicitantes for000Solicitante;

	public For000Domicilios() {
	}

	public long getDomDomicilioid() {
		return this.domDomicilioid;
	}

	public void setDomDomicilioid(long domDomicilioid) {
		this.domDomicilioid = domDomicilioid;
	}

	public BigDecimal getDomActivo() {
		return this.domActivo;
	}

	public void setDomActivo(BigDecimal domActivo) {
		this.domActivo = domActivo;
	}

	public String getDomCodigopostal() {
		return this.domCodigopostal;
	}

	public void setDomCodigopostal(String domCodigopostal) {
		this.domCodigopostal = domCodigopostal;
	}

	public String getDomDireccion() {
		return this.domDireccion;
	}

	public void setDomDireccion(String domDireccion) {
		this.domDireccion = domDireccion;
	}

	public Timestamp getDomFecha() {
		return this.domFecha;
	}

	public void setDomFecha(Timestamp domFecha) {
		this.domFecha = domFecha;
	}

	public BigDecimal getDomOperacion() {
		return this.domOperacion;
	}

	public void setDomOperacion(BigDecimal domOperacion) {
		this.domOperacion = domOperacion;
	}

	public String getDomUsuario() {
		return this.domUsuario;
	}

	public void setDomUsuario(String domUsuario) {
		this.domUsuario = domUsuario;
	}

	public For000Domiciliostipos getFor000Domiciliostipo() {
		return this.for000Domiciliostipo;
	}

	public void setFor000Domiciliostipo(For000Domiciliostipos for000Domiciliostipo) {
		this.for000Domiciliostipo = for000Domiciliostipo;
	}

	public For000Poblaciones getFor000Poblacione() {
		return this.for000Poblacione;
	}

	public void setFor000Poblacione(For000Poblaciones for000Poblacione) {
		this.for000Poblacione = for000Poblacione;
	}

	public For000Provincias getFor000Provincia() {
		return this.for000Provincia;
	}

	public void setFor000Provincia(For000Provincias for000Provincia) {
		this.for000Provincia = for000Provincia;
	}

	public For000Solicitantes getFor000Solicitante() {
		return this.for000Solicitante;
	}

	public void setFor000Solicitante(For000Solicitantes for000Solicitante) {
		this.for000Solicitante = for000Solicitante;
	}

}