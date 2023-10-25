package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_ACTIVIDADESSUBTIPOS database table.
 * 
 */
@Entity
@Table(name="FOR_000_ACTIVIDADESSUBTIPOS")
@NamedQuery(name="For000Actividadessubtipo.findAll", query="SELECT f FROM For000Actividadessubtipo f")
public class For000Actividadessubtipo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_ACTIVIDADESSUBTIPOS_ASTACTIVIDADSUBTIPOID_GENERATOR" )
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_ACTIVIDADESSUBTIPOS_ASTACTIVIDADSUBTIPOID_GENERATOR")
	@Column(name="AST_ACTIVIDADSUBTIPOID")
	private long astActividadsubtipoid;

	@Column(name="AST_ACTIVIDADTIPOID")
	private BigDecimal astActividadtipoid;

	@Column(name="AST_DESCRIPCION")
	private String astDescripcion;

	@Column(name="AST_FECHA")
	private Timestamp astFecha;

	@Column(name="AST_OPERACION")
	private BigDecimal astOperacion;

	@Column(name="AST_USUARIO")
	private String astUsuario;

	public For000Actividadessubtipo() {
	}

	public long getAstActividadsubtipoid() {
		return this.astActividadsubtipoid;
	}

	public void setAstActividadsubtipoid(long astActividadsubtipoid) {
		this.astActividadsubtipoid = astActividadsubtipoid;
	}

	public BigDecimal getAstActividadtipoid() {
		return this.astActividadtipoid;
	}

	public void setAstActividadtipoid(BigDecimal astActividadtipoid) {
		this.astActividadtipoid = astActividadtipoid;
	}

	public String getAstDescripcion() {
		return this.astDescripcion;
	}

	public void setAstDescripcion(String astDescripcion) {
		this.astDescripcion = astDescripcion;
	}

	public Timestamp getAstFecha() {
		return this.astFecha;
	}

	public void setAstFecha(Timestamp astFecha) {
		this.astFecha = astFecha;
	}

	public BigDecimal getAstOperacion() {
		return this.astOperacion;
	}

	public void setAstOperacion(BigDecimal astOperacion) {
		this.astOperacion = astOperacion;
	}

	public String getAstUsuario() {
		return this.astUsuario;
	}

	public void setAstUsuario(String astUsuario) {
		this.astUsuario = astUsuario;
	}

}