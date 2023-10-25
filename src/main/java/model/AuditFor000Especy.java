package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_ESPECIES database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_ESPECIES")
@NamedQuery(name="AuditFor000Especy.findAll", query="SELECT a FROM AuditFor000Especy a")
public class AuditFor000Especy implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="ESP_ESPECIEID")
	private BigDecimal espEspecieid;

	@Column(name="ESP_ESPECIEPROTEGIDA")
	private String espEspecieprotegida;

	@Column(name="ESP_FECHA")
	private Timestamp espFecha;

	@Column(name="ESP_NOMBRECOMUN")
	private String espNombrecomun;

	@Column(name="ESP_OPERACION")
	private BigDecimal espOperacion;

	@Column(name="ESP_USUARIO")
	private String espUsuario;

	public AuditFor000Especy() {
	}

	public BigDecimal getEspEspecieid() {
		return this.espEspecieid;
	}

	public void setEspEspecieid(BigDecimal espEspecieid) {
		this.espEspecieid = espEspecieid;
	}

	public String getEspEspecieprotegida() {
		return this.espEspecieprotegida;
	}

	public void setEspEspecieprotegida(String espEspecieprotegida) {
		this.espEspecieprotegida = espEspecieprotegida;
	}

	public Timestamp getEspFecha() {
		return this.espFecha;
	}

	public void setEspFecha(Timestamp espFecha) {
		this.espFecha = espFecha;
	}

	public String getEspNombrecomun() {
		return this.espNombrecomun;
	}

	public void setEspNombrecomun(String espNombrecomun) {
		this.espNombrecomun = espNombrecomun;
	}

	public BigDecimal getEspOperacion() {
		return this.espOperacion;
	}

	public void setEspOperacion(BigDecimal espOperacion) {
		this.espOperacion = espOperacion;
	}

	public String getEspUsuario() {
		return this.espUsuario;
	}

	public void setEspUsuario(String espUsuario) {
		this.espUsuario = espUsuario;
	}

}