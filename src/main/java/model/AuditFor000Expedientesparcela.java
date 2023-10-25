package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTESPARCELAS database table.
 * 
 */
@Entity
@Table(name="AUDIT_FOR_000_EXPEDIENTESPARCELAS")
@NamedQuery(name="AuditFor000Expedientesparcela.findAll", query="SELECT a FROM AuditFor000Expedientesparcela a")
public class AuditFor000Expedientesparcela implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="EPA_ACTUACIONTIPOID")
	private BigDecimal epaActuaciontipoid;

	@Column(name="EPA_ALTURAMADERABLE")
	private BigDecimal epaAlturamaderable;

	@Column(name="EPA_ARBOLESACORTAR")
	private BigDecimal epaArbolesacortar;

	@Column(name="EPA_DENSIDAD")
	private BigDecimal epaDensidad;

	@Column(name="EPA_DIAMETROMEDIO")
	private BigDecimal epaDiametromedio;

	@Column(name="EPA_ESPECIEID")
	private BigDecimal epaEspecieid;

	@Column(name="EPA_ESTEREOCORTEZA")
	private BigDecimal epaEstereocorteza;

	@Column(name="EPA_EXPEDIENTEID")
	private BigDecimal epaExpedienteid;

	@Column(name="EPA_EXPEDIENTEPARCELAID")
	private BigDecimal epaExpedienteparcelaid;

	@Column(name="EPA_FECHA")
	private Timestamp epaFecha;

	@Column(name="EPA_KGLENA")
	private BigDecimal epaKglena;

	@Column(name="EPA_M3MADERA")
	private BigDecimal epaM3madera;

	@Column(name="EPA_MUNICIPIOSIGPACID")
	private BigDecimal epaMunicipiosigpacid;

	@Column(name="EPA_OPERACION")
	private BigDecimal epaOperacion;

	@Column(name="EPA_PARCELA")
	private BigDecimal epaParcela;

	@Column(name="EPA_POLIGONO")
	private BigDecimal epaPoligono;

	@Column(name="EPA_PROVINCIAID")
	private BigDecimal epaProvinciaid;

	@Column(name="EPA_RECINTO")
	private BigDecimal epaRecinto;

	@Column(name="EPA_SUPERFICIE")
	private BigDecimal epaSuperficie;

	@Column(name="EPA_SUPERFICIEACTUACION")
	private BigDecimal epaSuperficieactuacion;

	@Column(name="EPA_USUARIO")
	private String epaUsuario;

	@Column(name="EPA_ZONA")
	private BigDecimal epaZona;

	public AuditFor000Expedientesparcela() {
	}

	public BigDecimal getEpaActuaciontipoid() {
		return this.epaActuaciontipoid;
	}

	public void setEpaActuaciontipoid(BigDecimal epaActuaciontipoid) {
		this.epaActuaciontipoid = epaActuaciontipoid;
	}

	public BigDecimal getEpaAlturamaderable() {
		return this.epaAlturamaderable;
	}

	public void setEpaAlturamaderable(BigDecimal epaAlturamaderable) {
		this.epaAlturamaderable = epaAlturamaderable;
	}

	public BigDecimal getEpaArbolesacortar() {
		return this.epaArbolesacortar;
	}

	public void setEpaArbolesacortar(BigDecimal epaArbolesacortar) {
		this.epaArbolesacortar = epaArbolesacortar;
	}

	public BigDecimal getEpaDensidad() {
		return this.epaDensidad;
	}

	public void setEpaDensidad(BigDecimal epaDensidad) {
		this.epaDensidad = epaDensidad;
	}

	public BigDecimal getEpaDiametromedio() {
		return this.epaDiametromedio;
	}

	public void setEpaDiametromedio(BigDecimal epaDiametromedio) {
		this.epaDiametromedio = epaDiametromedio;
	}

	public BigDecimal getEpaEspecieid() {
		return this.epaEspecieid;
	}

	public void setEpaEspecieid(BigDecimal epaEspecieid) {
		this.epaEspecieid = epaEspecieid;
	}

	public BigDecimal getEpaEstereocorteza() {
		return this.epaEstereocorteza;
	}

	public void setEpaEstereocorteza(BigDecimal epaEstereocorteza) {
		this.epaEstereocorteza = epaEstereocorteza;
	}

	public BigDecimal getEpaExpedienteid() {
		return this.epaExpedienteid;
	}

	public void setEpaExpedienteid(BigDecimal epaExpedienteid) {
		this.epaExpedienteid = epaExpedienteid;
	}

	public BigDecimal getEpaExpedienteparcelaid() {
		return this.epaExpedienteparcelaid;
	}

	public void setEpaExpedienteparcelaid(BigDecimal epaExpedienteparcelaid) {
		this.epaExpedienteparcelaid = epaExpedienteparcelaid;
	}

	public Timestamp getEpaFecha() {
		return this.epaFecha;
	}

	public void setEpaFecha(Timestamp epaFecha) {
		this.epaFecha = epaFecha;
	}

	public BigDecimal getEpaKglena() {
		return this.epaKglena;
	}

	public void setEpaKglena(BigDecimal epaKglena) {
		this.epaKglena = epaKglena;
	}

	public BigDecimal getEpaM3madera() {
		return this.epaM3madera;
	}

	public void setEpaM3madera(BigDecimal epaM3madera) {
		this.epaM3madera = epaM3madera;
	}

	public BigDecimal getEpaMunicipiosigpacid() {
		return this.epaMunicipiosigpacid;
	}

	public void setEpaMunicipiosigpacid(BigDecimal epaMunicipiosigpacid) {
		this.epaMunicipiosigpacid = epaMunicipiosigpacid;
	}

	public BigDecimal getEpaOperacion() {
		return this.epaOperacion;
	}

	public void setEpaOperacion(BigDecimal epaOperacion) {
		this.epaOperacion = epaOperacion;
	}

	public BigDecimal getEpaParcela() {
		return this.epaParcela;
	}

	public void setEpaParcela(BigDecimal epaParcela) {
		this.epaParcela = epaParcela;
	}

	public BigDecimal getEpaPoligono() {
		return this.epaPoligono;
	}

	public void setEpaPoligono(BigDecimal epaPoligono) {
		this.epaPoligono = epaPoligono;
	}

	public BigDecimal getEpaProvinciaid() {
		return this.epaProvinciaid;
	}

	public void setEpaProvinciaid(BigDecimal epaProvinciaid) {
		this.epaProvinciaid = epaProvinciaid;
	}

	public BigDecimal getEpaRecinto() {
		return this.epaRecinto;
	}

	public void setEpaRecinto(BigDecimal epaRecinto) {
		this.epaRecinto = epaRecinto;
	}

	public BigDecimal getEpaSuperficie() {
		return this.epaSuperficie;
	}

	public void setEpaSuperficie(BigDecimal epaSuperficie) {
		this.epaSuperficie = epaSuperficie;
	}

	public BigDecimal getEpaSuperficieactuacion() {
		return this.epaSuperficieactuacion;
	}

	public void setEpaSuperficieactuacion(BigDecimal epaSuperficieactuacion) {
		this.epaSuperficieactuacion = epaSuperficieactuacion;
	}

	public String getEpaUsuario() {
		return this.epaUsuario;
	}

	public void setEpaUsuario(String epaUsuario) {
		this.epaUsuario = epaUsuario;
	}

	public BigDecimal getEpaZona() {
		return this.epaZona;
	}

	public void setEpaZona(BigDecimal epaZona) {
		this.epaZona = epaZona;
	}

}