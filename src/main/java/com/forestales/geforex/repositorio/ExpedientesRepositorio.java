package com.forestales.geforex.repositorio;

import java.util.List;
import javax.persistence.Tuple;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.forestales.geforex.modelo.ExpParcelas;
import com.forestales.geforex.modelo.For000Expedientes;

public interface ExpedientesRepositorio extends JpaRepository<For000Expedientes, Long> {

    @Query("select e.expExpedienteid as expExpedienteid," +
            "e.expIgf as expIgf, e.for000Expedientestipo.extExpedientetipoid as extExpedientetipoid, " +
            "exe.exeExpedienteestadoid as exeExpedienteestadoid," +
            "fin.finFincaid as finFincaid," +
            "e.expFechainicio as expFechainicio," +
            "e.expFechaprevistafin as expFechaprevistafin," +
            "e.expFechafin as expFechafin," +
            " p " +
            "  from For000Expedientes e " +
            "INNER JOIN For000Expedientestipo ext on (ext.extExpedientetipoid=e.for000Expedientestipo.extExpedientetipoid) "
            +
            "INNER JOIN For000Expedientesestado exe on (exe.exeExpedienteestadoid=e.for000Expedientesestado.exeExpedienteestadoid) "
            +
            "INNER JOIN For000Finca fin on (fin.finFincaid=e.for000Finca.finFincaid) " +
            "left join For000Expedientesparcelas p " +
            " on  (e.expExpedienteid=p.for000Expedientes.expExpedienteid) " +
            " where ext.extExpedientetipoid= ?1 ")

    // @Query("select e from For000Expediente e")
    // where for000Expedientestipo.extExpedientetipoid= ?1 ")
    // like %?1%"
    // public List<For000Expediente> findAll();

    // public List<For000Expediente> findExpFiltro(Long tipoExp, Long fincaId);

    // @Query("select e.expExpedienteid as expExpedienteid from For000Expediente e
    // ")
    public List<Tuple> findExpFiltro(Long tipoExp, Long fincaId);
}
