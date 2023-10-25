package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_DOCUMENTOSTIPOS database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_DOCUMENTOSTIPOS")
@NamedQuery(name="AuditFor000Documentostipo.findAll", query="SELECT a FROM AuditFor000Documentostipo a")
public class AuditFor000Documentostipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="DOT_DESCRIPCION")
	private String dotDescripcion;

	@Column(name="DOT_FECHA")
	private Timestamp dotFecha;

	@Column(name="DOT_OPERACION")
	private BigDecimal dotOperacion;

	@Column(name="DOT_TIPODOCUMENTOID")
	private BigDecimal dotTipodocumentoid;

	@Column(name="DOT_USUARIO")
	private String dotUsuario;

	public AuditFor000Documentostipo() {
	}

	public String getDotDescripcion() {
		return this.dotDescripcion;
	}

	public void setDotDescripcion(String dotDescripcion) {
		this.dotDescripcion = dotDescripcion;
	}

	public Timestamp getDotFecha() {
		return this.dotFecha;
	}

	public void setDotFecha(Timestamp dotFecha) {
		this.dotFecha = dotFecha;
	}

	public BigDecimal getDotOperacion() {
		return this.dotOperacion;
	}

	public void setDotOperacion(BigDecimal dotOperacion) {
		this.dotOperacion = dotOperacion;
	}

	public BigDecimal getDotTipodocumentoid() {
		return this.dotTipodocumentoid;
	}

	public void setDotTipodocumentoid(BigDecimal dotTipodocumentoid) {
		this.dotTipodocumentoid = dotTipodocumentoid;
	}

	public String getDotUsuario() {
		return this.dotUsuario;
	}

	public void setDotUsuario(String dotUsuario) {
		this.dotUsuario = dotUsuario;
	}

}