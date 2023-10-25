package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_SERVICIOSTERRITORIALES database table.
 * 
 */
@Entity
@Table(name="FOR_000_SERVICIOSTERRITORIALES")
@NamedQuery(name="For000Serviciosterritoriales.findAll", query="SELECT f FROM For000Serviciosterritoriales f")
public class For000Serviciosterritoriales implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_SERVICIOSTERRITORIALES_SETSERVICIOTERRITORIALID_GENERATOR", sequenceName="FOR_000_SERVICIOSTERRITORIALES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_SERVICIOSTERRITORIALES_SETSERVICIOTERRITORIALID_GENERATOR")
	@Column(name="SET_SERVICIOTERRITORIALID")
	private long setServicioterritorialid;

	@Column(name="SET_CODIGO")
	private String setCodigo;

	@Column(name="SET_DESCRIPCION")
	private String setDescripcion;

	@Column(name="SET_FECHA")
	private Timestamp setFecha;

	@Column(name="SET_OPERACION")
	private BigDecimal setOperacion;

	@Column(name="SET_USUARIO")
	private String setUsuario;

	public For000Serviciosterritoriales() {
	}

	public long getSetServicioterritorialid() {
		return this.setServicioterritorialid;
	}

	public void setSetServicioterritorialid(long setServicioterritorialid) {
		this.setServicioterritorialid = setServicioterritorialid;
	}

	public String getSetCodigo() {
		return this.setCodigo;
	}

	public void setSetCodigo(String setCodigo) {
		this.setCodigo = setCodigo;
	}

	public String getSetDescripcion() {
		return this.setDescripcion;
	}

	public void setSetDescripcion(String setDescripcion) {
		this.setDescripcion = setDescripcion;
	}

	public Timestamp getSetFecha() {
		return this.setFecha;
	}

	public void setSetFecha(Timestamp setFecha) {
		this.setFecha = setFecha;
	}

	public BigDecimal getSetOperacion() {
		return this.setOperacion;
	}

	public void setSetOperacion(BigDecimal setOperacion) {
		this.setOperacion = setOperacion;
	}

	public String getSetUsuario() {
		return this.setUsuario;
	}

	public void setSetUsuario(String setUsuario) {
		this.setUsuario = setUsuario;
	}

}