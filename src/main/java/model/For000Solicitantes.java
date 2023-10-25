package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;


/**
 * The persistent class for the FOR_000_SOLICITANTES database table.
 * 
 */
@Entity
@Table(name="FOR_000_SOLICITANTES")
@NamedQuery(name="For000Solicitantes.findAll", query="SELECT f FROM For000Solicitantes f")
public class For000Solicitantes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_SOLICITANTES_SOLSOLICITANTEID_GENERATOR", sequenceName="FOR_000_SOLICITANTES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_SOLICITANTES_SOLSOLICITANTEID_GENERATOR")
	@Column(name="SOL_SOLICITANTEID")
	private long solSolicitanteid;

	@Column(name="SOL_APELLIDO1")
	private String solApellido1;

	@Column(name="SOL_APELLIDO2")
	private String solApellido2;

	@Column(name="SOL_DNICIF")
	private String solDnicif;

	@Column(name="SOL_EMAIL")
	private String solEmail;

	@Column(name="SOL_FECHA")
	private Timestamp solFecha;

	@Column(name="SOL_NOMBRE")
	private String solNombre;

	@Column(name="SOL_OPERACION")
	private BigDecimal solOperacion;

	@Column(name="SOL_REPRESENTANTEID")
	private BigDecimal solRepresentanteid;

	@Column(name="SOL_SEXO")
	private String solSexo;

	@Column(name="SOL_TELEFONOFIJO")
	private String solTelefonofijo;

	@Column(name="SOL_TELEFONOMOVIL")
	private String solTelefonomovil;

	@Column(name="SOL_TIPOPERSONA")
	private BigDecimal solTipopersona;

	@Column(name="SOL_USUARIO")
	private String solUsuario;

	//bi-directional many-to-one association to For000Domicilios
	@OneToMany(mappedBy="for000Solicitante")
	private List<For000Domicilios> for000Domicilios;

	public For000Solicitantes() {
	}

	public long getSolSolicitanteid() {
		return this.solSolicitanteid;
	}

	public void setSolSolicitanteid(long solSolicitanteid) {
		this.solSolicitanteid = solSolicitanteid;
	}

	public String getSolApellido1() {
		return this.solApellido1;
	}

	public void setSolApellido1(String solApellido1) {
		this.solApellido1 = solApellido1;
	}

	public String getSolApellido2() {
		return this.solApellido2;
	}

	public void setSolApellido2(String solApellido2) {
		this.solApellido2 = solApellido2;
	}

	public String getSolDnicif() {
		return this.solDnicif;
	}

	public void setSolDnicif(String solDnicif) {
		this.solDnicif = solDnicif;
	}

	public String getSolEmail() {
		return this.solEmail;
	}

	public void setSolEmail(String solEmail) {
		this.solEmail = solEmail;
	}

	public Timestamp getSolFecha() {
		return this.solFecha;
	}

	public void setSolFecha(Timestamp solFecha) {
		this.solFecha = solFecha;
	}

	public String getSolNombre() {
		return this.solNombre;
	}

	public void setSolNombre(String solNombre) {
		this.solNombre = solNombre;
	}

	public BigDecimal getSolOperacion() {
		return this.solOperacion;
	}

	public void setSolOperacion(BigDecimal solOperacion) {
		this.solOperacion = solOperacion;
	}

	public BigDecimal getSolRepresentanteid() {
		return this.solRepresentanteid;
	}

	public void setSolRepresentanteid(BigDecimal solRepresentanteid) {
		this.solRepresentanteid = solRepresentanteid;
	}

	public String getSolSexo() {
		return this.solSexo;
	}

	public void setSolSexo(String solSexo) {
		this.solSexo = solSexo;
	}

	public String getSolTelefonofijo() {
		return this.solTelefonofijo;
	}

	public void setSolTelefonofijo(String solTelefonofijo) {
		this.solTelefonofijo = solTelefonofijo;
	}

	public String getSolTelefonomovil() {
		return this.solTelefonomovil;
	}

	public void setSolTelefonomovil(String solTelefonomovil) {
		this.solTelefonomovil = solTelefonomovil;
	}

	public BigDecimal getSolTipopersona() {
		return this.solTipopersona;
	}

	public void setSolTipopersona(BigDecimal solTipopersona) {
		this.solTipopersona = solTipopersona;
	}

	public String getSolUsuario() {
		return this.solUsuario;
	}

	public void setSolUsuario(String solUsuario) {
		this.solUsuario = solUsuario;
	}

	public List<For000Domicilios> getFor000Domicilios() {
		return this.for000Domicilios;
	}

	public void setFor000Domicilios(List<For000Domicilios> for000Domicilios) {
		this.for000Domicilios = for000Domicilios;
	}

	public For000Domicilios addFor000Domicilio(For000Domicilios for000Domicilio) {
		getFor000Domicilios().add(for000Domicilio);
		for000Domicilio.setFor000Solicitante(this);

		return for000Domicilio;
	}

	public For000Domicilios removeFor000Domicilio(For000Domicilios for000Domicilio) {
		getFor000Domicilios().remove(for000Domicilio);
		for000Domicilio.setFor000Solicitante(null);

		return for000Domicilio;
	}

}