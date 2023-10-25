package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESTIPOS database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESTIPOS")
@NamedQuery(name="AuditFor000Expedientestipo.findAll", query="SELECT a FROM AuditFor000Expedientestipo a")
public class AuditFor000Expedientestipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EXT_DESCRIPCION")
	private String extDescripcion;

	@Column(name="EXT_EXPEDIENTETIPOID")
	private BigDecimal extExpedientetipoid;

	@Column(name="EXT_FECHA")
	private Timestamp extFecha;

	@Column(name="EXT_LETRA")
	private String extLetra;

	@Column(name="EXT_NUMERACIONCONJUNTA")
	private BigDecimal extNumeracionconjunta;

	@Column(name="EXT_OPERACION")
	private BigDecimal extOperacion;

	@Column(name="EXT_PLAZORESOLUCION")
	private BigDecimal extPlazoresolucion;

	@Column(name="EXT_SILENCIOADMINISTRATIVO")
	private BigDecimal extSilencioadministrativo;

	@Column(name="EXT_USUARIO")
	private String extUsuario;

	public AuditFor000Expedientestipo() {
	}

	public String getExtDescripcion() {
		return this.extDescripcion;
	}

	public void setExtDescripcion(String extDescripcion) {
		this.extDescripcion = extDescripcion;
	}

	public BigDecimal getExtExpedientetipoid() {
		return this.extExpedientetipoid;
	}

	public void setExtExpedientetipoid(BigDecimal extExpedientetipoid) {
		this.extExpedientetipoid = extExpedientetipoid;
	}

	public Timestamp getExtFecha() {
		return this.extFecha;
	}

	public void setExtFecha(Timestamp extFecha) {
		this.extFecha = extFecha;
	}

	public String getExtLetra() {
		return this.extLetra;
	}

	public void setExtLetra(String extLetra) {
		this.extLetra = extLetra;
	}

	public BigDecimal getExtNumeracionconjunta() {
		return this.extNumeracionconjunta;
	}

	public void setExtNumeracionconjunta(BigDecimal extNumeracionconjunta) {
		this.extNumeracionconjunta = extNumeracionconjunta;
	}

	public BigDecimal getExtOperacion() {
		return this.extOperacion;
	}

	public void setExtOperacion(BigDecimal extOperacion) {
		this.extOperacion = extOperacion;
	}

	public BigDecimal getExtPlazoresolucion() {
		return this.extPlazoresolucion;
	}

	public void setExtPlazoresolucion(BigDecimal extPlazoresolucion) {
		this.extPlazoresolucion = extPlazoresolucion;
	}

	public BigDecimal getExtSilencioadministrativo() {
		return this.extSilencioadministrativo;
	}

	public void setExtSilencioadministrativo(BigDecimal extSilencioadministrativo) {
		this.extSilencioadministrativo = extSilencioadministrativo;
	}

	public String getExtUsuario() {
		return this.extUsuario;
	}

	public void setExtUsuario(String extUsuario) {
		this.extUsuario = extUsuario;
	}

}