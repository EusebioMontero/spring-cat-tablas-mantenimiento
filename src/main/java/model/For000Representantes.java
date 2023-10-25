package model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;


/**
 * The persistent class for the FOR_000_REPRESENTANTES database table.
 * 
 */
@Entity
@Table(name="FOR_000_REPRESENTANTES")
@NamedQuery(name="For000Representantes.findAll", query="SELECT f FROM For000Representantes f")
public class For000Representantes implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name="FOR_000_REPRESENTANTES_REPREPRESENTANTEID_GENERATOR", sequenceName="FOR_000_REPRESENTANTES_SEQ")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="FOR_000_REPRESENTANTES_REPREPRESENTANTEID_GENERATOR")
	@Column(name="REP_REPRESENTANTEID")
	private long repRepresentanteid;

	@Column(name="REP_DNICIF")
	private String repDnicif;

	@Column(name="REP_FECHA")
	private Timestamp repFecha;

	@Column(name="REP_NOMBRE")
	private String repNombre;

	@Column(name="REP_OPERACION")
	private BigDecimal repOperacion;

	@Column(name="REP_USUARIO")
	private String repUsuario;

	public For000Representantes() {
	}

	public long getRepRepresentanteid() {
		return this.repRepresentanteid;
	}

	public void setRepRepresentanteid(long repRepresentanteid) {
		this.repRepresentanteid = repRepresentanteid;
	}

	public String getRepDnicif() {
		return this.repDnicif;
	}

	public void setRepDnicif(String repDnicif) {
		this.repDnicif = repDnicif;
	}

	public Timestamp getRepFecha() {
		return this.repFecha;
	}

	public void setRepFecha(Timestamp repFecha) {
		this.repFecha = repFecha;
	}

	public String getRepNombre() {
		return this.repNombre;
	}

	public void setRepNombre(String repNombre) {
		this.repNombre = repNombre;
	}

	public BigDecimal getRepOperacion() {
		return this.repOperacion;
	}

	public void setRepOperacion(BigDecimal repOperacion) {
		this.repOperacion = repOperacion;
	}

	public String getRepUsuario() {
		return this.repUsuario;
	}

	public void setRepUsuario(String repUsuario) {
		this.repUsuario = repUsuario;
	}

}