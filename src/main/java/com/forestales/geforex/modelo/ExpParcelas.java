package com.forestales.geforex.modelo;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import java.math.BigDecimal;
import java.util.Date;
import java.sql.Timestamp;

/**
 * The persistent class for the FOR_000_EXPEDIENTES database table.
 * 
 */
// @Entity
// @JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class,
// property = "id")
public class ExpParcelas implements Serializable {
    private static final long serialVersionUID = 1L;

    @Column(name = "expExpedienteid")
    private long expExpedienteid;

    private String expIgf;

    private long extExpedientetipoid;

    private long exeExpedienteestadoid;

    private long finFincaid;

    // @Column(name = "EXP_CAMPANA")
    private BigDecimal expCampana;

    // @Column(name = "EXP_FECHA")
    private Timestamp expFecha;

    // @Temporal(TemporalType.DATE)
    // @Column(name = "EXP_FECHAFIN")
    private Date expFechafin;

    // @Temporal(TemporalType.DATE)
    // @Column(name = "EXP_FECHAINICIO")
    private Date expFechainicio;

    private Date expFechaprevistafin;

    @Column(name = "EXP_FECHAREGENTRADA")
    private Timestamp expFecharegentrada;

    public long getExpExpedienteid() {
        return expExpedienteid;
    }

    public void setExpExpedienteid(long expExpedienteid) {
        this.expExpedienteid = expExpedienteid;
    }

    public long getExtExpedientetipoid() {
        return extExpedientetipoid;
    }

    public void setExtExpedientetipoid(long extExpedientetipoid) {
        this.extExpedientetipoid = extExpedientetipoid;
    }

    public long getExeExpedienteestadoid() {
        return exeExpedienteestadoid;
    }

    public long getFinFincaid() {
        return finFincaid;
    }

    public void setFinFincaid(long finFincaid) {
        this.finFincaid = finFincaid;
    }

    public void setExeExpedienteestadoid(long exeExpedienteestadoid) {
        this.exeExpedienteestadoid = exeExpedienteestadoid;
    }

    public BigDecimal getExpCampana() {
        return expCampana;
    }

    public void setExpCampana(BigDecimal expCampana) {
        this.expCampana = expCampana;
    }

    public Timestamp getExpFecha() {
        return expFecha;
    }

    public void setExpFecha(Timestamp expFecha) {
        this.expFecha = expFecha;
    }

    public Date getExpFechafin() {
        return expFechafin;
    }

    public void setExpFechafin(Date expFechafin) {
        this.expFechafin = expFechafin;
    }

    public Date getExpFechainicio() {
        return expFechainicio;
    }

    public void setExpFechainicio(Date expFechainicio) {
        this.expFechainicio = expFechainicio;
    }

    public String getExpIgf() {
        return expIgf;
    }

    public void setExpIgf(String expIgf) {
        this.expIgf = expIgf;
    }

    public Date getExpFechaprevistafin() {
        return expFechaprevistafin;
    }

    public void setExpFechaprevistafin(Date expFechaprevistafin) {
        this.expFechaprevistafin = expFechaprevistafin;
    }

    public Timestamp getExpFecharegentrada() {
        return expFecharegentrada;
    }

    public void setExpFecharegentrada(Timestamp expFecharegentrada) {
        this.expFecharegentrada = expFecharegentrada;
    }

    public ExpParcelas() {
    }

}