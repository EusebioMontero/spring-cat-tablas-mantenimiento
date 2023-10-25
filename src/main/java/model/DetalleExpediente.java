package model;

import java.io.Serializable;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;

import org.hibernate.annotations.JoinColumnOrFormula;
import org.hibernate.annotations.JoinColumnsOrFormulas;
import org.hibernate.annotations.JoinFormula;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

import com.forestales.geforex.modelo.For000Finca;

/**
 * The persistent class for the AUDIT_FOR_000_EXPEDIENTES database table.
 * 
 */
@Entity
@NamedQuery(name = "AuditFor000Expediente.findAll", query = "SELECT a FROM AuditFor000Expediente a")
public class DetalleExpediente implements Serializable {

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumnsOrFormulas({
			@JoinColumnOrFormula(column = @JoinColumn(name = "finFincaid", referencedColumnName = "id")),
	})
	For000Finca finca;

}