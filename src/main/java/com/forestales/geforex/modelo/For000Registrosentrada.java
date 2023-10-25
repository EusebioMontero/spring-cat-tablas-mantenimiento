package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.List;

/**
 * The persistent class for the FOR_000_REGISTROSENTRADA database table.
 * 
 */
@Entity
@Table(name = "FOR_000_REGISTROSENTRADA")
@NamedQuery(name = "For000Registrosentrada.findAll", query = "SELECT f FROM For000Registrosentrada f")
public class For000Registrosentrada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "FOR_000_REGISTROSENTRADA_REEREGISTROENTRADAID_GENERATOR", sequenceName = "FOR_000_REGISTROSENTRADA_SEQ")
	// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
	// "FOR_000_REGISTROSENTRADA_REEREGISTROENTRADAID_GENERATOR")
	@Column(name = "REE_REGISTROENTRADAID")
	private long reeRegistroentradaid;

	@Column(name = "REE_DESCRIPCION")
	private String reeDescripcion;

	@Column(name = "REE_FECHA")
	private Timestamp reeFecha;

	@Column(name = "REE_OPERACION")
	private BigDecimal reeOperacion;

	@Column(name = "REE_USUARIO")
	private String reeUsuario;

	// bi-directional many-to-one association to For000Expediente
	@OneToMany(mappedBy = "for000Registrosentrada")
	@JsonManagedReference
	private List<For000Expedientes> for000Expedientes;

	public For000Registrosentrada() {
	}

	public long getReeRegistroentradaid() {
		return this.reeRegistroentradaid;
	}

	public void setReeRegistroentradaid(long reeRegistroentradaid) {
		this.reeRegistroentradaid = reeRegistroentradaid;
	}

	public String getReeDescripcion() {
		return this.reeDescripcion;
	}

	public void setReeDescripcion(String reeDescripcion) {
		this.reeDescripcion = reeDescripcion;
	}

	public Timestamp getReeFecha() {
		return this.reeFecha;
	}

	public void setReeFecha(Timestamp reeFecha) {
		this.reeFecha = reeFecha;
	}

	public BigDecimal getReeOperacion() {
		return this.reeOperacion;
	}

	public void setReeOperacion(BigDecimal reeOperacion) {
		this.reeOperacion = reeOperacion;
	}

	public String getReeUsuario() {
		return this.reeUsuario;
	}

	public void setReeUsuario(String reeUsuario) {
		this.reeUsuario = reeUsuario;
	}

	public List<For000Expedientes> getFor000Expedientes() {
		return this.for000Expedientes;
	}

	public void setFor000Expedientes(List<For000Expedientes> for000Expedientes) {
		this.for000Expedientes = for000Expedientes;
	}

	// public For000Expediente addFor000Expediente(For000Expediente
	// for000Expediente) {
	// getFor000Expedientes().add(for000Expediente);
	// for000Expediente.setFor000Registrosentrada(this);

	// return for000Expediente;
	// }

	// public For000Expediente removeFor000Expediente(For000Expediente
	// for000Expediente) {
	// getFor000Expedientes().remove(for000Expediente);
	// for000Expediente.setFor000Registrosentrada(null);

	// return for000Expediente;
	// }

}