package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_USUARIOS database table.
 * 
 */
@Entity
@Table(name="FOR_000_USUARIOS")
@NamedQuery(name="For000Usuario.findAll", query="SELECT f FROM For000Usuario f")
public class For000Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_USUARIOS_USUUSUARIOID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_USUARIOS_USUUSUARIOID_GENERATOR")
	@Column(name="USU_USUARIOID")
	private long usuUsuarioid;

	@Column(name="USU_FECHA")
	private Timestamp usuFecha;

	@Column(name="USU_LOGIN")
	private String usuLogin;

	@Column(name="USU_NOMBRE")
	private String usuNombre;

	@Column(name="USU_PASSWORD")
	private String usuPassword;

	@Column(name="USU_SERVICIOTERRITORIALID")
	private BigDecimal usuServicioterritorialid;

	@Column(name="USU_TIPO")
	private BigDecimal usuTipo;

	@Column(name="USU_USUARIO")
	private String usuUsuario;

	public For000Usuario() {
	}

	public long getUsuUsuarioid() {
		return this.usuUsuarioid;
	}

	public void setUsuUsuarioid(long usuUsuarioid) {
		this.usuUsuarioid = usuUsuarioid;
	}

	public Timestamp getUsuFecha() {
		return this.usuFecha;
	}

	public void setUsuFecha(Timestamp usuFecha) {
		this.usuFecha = usuFecha;
	}

	public String getUsuLogin() {
		return this.usuLogin;
	}

	public void setUsuLogin(String usuLogin) {
		this.usuLogin = usuLogin;
	}

	public String getUsuNombre() {
		return this.usuNombre;
	}

	public void setUsuNombre(String usuNombre) {
		this.usuNombre = usuNombre;
	}

	public String getUsuPassword() {
		return this.usuPassword;
	}

	public void setUsuPassword(String usuPassword) {
		this.usuPassword = usuPassword;
	}

	public BigDecimal getUsuServicioterritorialid() {
		return this.usuServicioterritorialid;
	}

	public void setUsuServicioterritorialid(BigDecimal usuServicioterritorialid) {
		this.usuServicioterritorialid = usuServicioterritorialid;
	}

	public BigDecimal getUsuTipo() {
		return this.usuTipo;
	}

	public void setUsuTipo(BigDecimal usuTipo) {
		this.usuTipo = usuTipo;
	}

	public String getUsuUsuario() {
		return this.usuUsuario;
	}

	public void setUsuUsuario(String usuUsuario) {
		this.usuUsuario = usuUsuario;
	}

}