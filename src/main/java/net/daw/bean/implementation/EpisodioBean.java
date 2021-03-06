/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.daw.bean.implementation;

import com.google.gson.annotations.Expose;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import net.daw.bean.publicinterface.GenericBean;
import net.daw.helper.statics.EncodingUtilHelper;

/**
 *
 * @author Dani
 */
public class EpisodioBean implements GenericBean {

    @Expose
    private int id;
    @Expose
    private Date fecha;
    @Expose
    private String informe;
    @Expose
    private float importe;
    @Expose(serialize = false)
    private int id_importancia;
//    @Expose(deserialize = false)
//    private ImportanciaBean obj_importancia;
    @Expose(serialize = false)
    private int id_servicio;
    @Expose(deserialize = false)
    private ServicioBean obj_servicio;
//    @Expose(serialize = false)
//    private int id_tipo;
//    @Expose(deserialize = false)
//    private TipoBean obj_tipo;
//    @Expose(serialize = false)
//    private int id_paciente;
//    @Expose(deserialize = false)
//    private PacienteBean obj_paciente;
    @Expose(serialize = false)
    private int id_medico;
    @Expose(deserialize = false)
    private MedicoBean obj_medico;
    @Expose(serialize = false)
    private int id_episodio;
    @Expose(deserialize = false)
    private EpisodioBean obj_episodio;
//    @Expose(serialize = false)
//    private int id_prioridad;
//    @Expose(deserialize = false)
//    private PrioridadBean obj_prioridad;

    public EpisodioBean(int id) {
        this.id = id;
    }

    public EpisodioBean() {
        this.id = 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getInforme() {
        return informe;
    }

    public void setInforme(String informe) {
        this.informe = informe;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public int getId_importancia() {
        return id_importancia;
    }

    public void setId_importancia(int id_importancia) {
        this.id_importancia = id_importancia;
    }

//    public ImportanciaBean getObj_importancia() {
//        return obj_importancia;
//    }
//
//    public void setObj_importancia(ImportanciaBean obj_importancia) {
//        this.obj_importancia = obj_importancia;
//    }
    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public ServicioBean getObj_servicio() {
        return obj_servicio;
    }

    public void setObj_servicio(ServicioBean obj_servicio) {
        this.obj_servicio = obj_servicio;
    }

//    public int getId_tipo() {
//        return id_tipo;
//    }
//
//    public void setId_tipo(int id_tipo) {
//        this.id_tipo = id_tipo;
//    }
//
//    public TipoBean getObj_tipo() {
//        return obj_tipo;
//    }
//
//    public void setObj_tipo(TipoBean obj_tipo) {
//        this.obj_tipo = obj_tipo;
//    }
//
//    public int getId_paciente() {
//        return id_paciente;
//    }
//
//    public void setId_paciente(int id_paciente) {
//        this.id_paciente = id_paciente;
//    }
//
//    public PacienteBean getObj_paciente() {
//        return obj_paciente;
//    }
//
//    public void setObj_paciente(PacienteBean obj_paciente) {
//        this.obj_paciente = obj_paciente;
//    }
    public int getId_medico() {
        return id_medico;
    }

    public void setId_medico(int id_medico) {
        this.id_medico = id_medico;
    }

    public MedicoBean getObj_medico() {
        return obj_medico;
    }

    public void setObj_medico(MedicoBean obj_medico) {
        this.obj_medico = obj_medico;
    }

    public int getId_episodio() {
        return id_episodio;
    }

    public void setId_episodio(int id_episodio) {
        this.id_episodio = id_episodio;
    }

    public EpisodioBean getObj_episodio() {
        return obj_episodio;
    }

    public void setObj_episodio(EpisodioBean obj_episodio) {
        this.obj_episodio = obj_episodio;
    }

//    public int getId_prioridad() {
//        return id_prioridad;
//    }
//
//    public void setId_prioridad(int id_prioridad) {
//        this.id_prioridad = id_prioridad;
//    }
//
//    public PrioridadBean getObj_prioridad() {
//        return obj_prioridad;
//    }
//
//    public void setObj_prioridad(PrioridadBean obj_prioridad) {
//        this.obj_prioridad = obj_prioridad;
//    }
    @Override
    public String getColumns() {
        return "id,fecha,informe,id_importancia,id_servicio,id_tipo,importe,id_paciente,id_medico,id_episodio,id_prioridad";
    }

    @Override
    public String getValues() {
        String values;
        values = id + ",";
        values += EncodingUtilHelper.stringifyAndQuotate(fecha) + ",";
        values += EncodingUtilHelper.quotate(informe) + ",";
        values += id_importancia + ",";
        values += id_servicio + ",";
//        values += id_tipo + ",";
        values += importe + ",";
//        values += id_paciente + ",";
        values += id_medico + ",";
        values += id_episodio;
//        values += id_prioridad;
        return values;
    }

    @Override
    public String toPairs() {
        String pairs;
        pairs = "id = " + id + ",";
        pairs += "fecha = " + EncodingUtilHelper.stringifyAndQuotate(fecha) + ",";
        pairs += "informe = " + EncodingUtilHelper.quotate(informe) + ",";
        pairs += "id_importancia = " + id_importancia + ",";
        pairs += "id_servicio = " + id_servicio + ",";
//        pairs += "id_tipo = " + id_tipo + ",";
        pairs += "importe = " + importe + ",";
//        pairs += "id_paciente = " + id_paciente + ",";
        pairs += "id_medico = " + id_medico + ",";
        pairs += "id_episodio = " + id_episodio;
//        pairs += "id_prioridad = " + id_prioridad;
        return pairs;
    }

    @Override
    public EpisodioBean fill(ResultSet oResultSet, Connection pooledConnection, PusuarioBean oPuserBean_security, Integer expand) throws SQLException, Exception {
        this.id = oResultSet.getInt("id");
        this.fecha = oResultSet.getDate("fecha");
        this.informe = oResultSet.getString("informe");
        this.id_importancia = oResultSet.getInt("id_importancia");
        this.id_servicio = oResultSet.getInt("id_servicio");
//        this.id_tipo = oResultSet.getInt("id_tipo");
        this.importe = oResultSet.getFloat("importe");
//        this.id_paciente = oResultSet.getInt("id_paciente");
        this.id_medico = oResultSet.getInt("id_medico");
        this.id_episodio = oResultSet.getInt("id_episodio");
//        this.id_prioridad = oResultSet.getInt("id_prioridad");

//        if(expand > 0){
//            this.obj_importancia = new ImportanciaDao(pooledConnection,oPuserBean_security).get(new ImportanciaBean(this.id_importancia), expand - 1);
//            this.obj_servicio = new ServicioDao(pooledConnection,oPuserBean_security).get(new ServicioBean(this.id_servicio), expand - 1);
//            this.obj_tipo = new TipoDao(pooledConnection,oPuserBean_security).get(new TipoBean(this.id_tipo), expand - 1);
//            this.obj_paciente = new PacienteDao(pooledConnection,oPuserBean_security).get(new PacienteBean(this.id_paciente), expand - 1);
//            this.obj_medico = new MedicoDao(pooledConnection,oPuserBean_security).get(new MedicoBean(this.id_medico), expand - 1);
//            this.obj_episodio = new EpisodioDao(pooledConnection,oPuserBean_security).get(new EpisodioBean(this.id_episodio), expand - 1);
//            this.obj_prioridad = new PrioridadDao(pooledConnection,oPuserBean_security).get(new PrioridadBean(this.id_prioridad), expand - 1);
//        }
        return this;
    }

}
