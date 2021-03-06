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
 * @author a003153722p
 */
public class DocumentoBean implements GenericBean {

    @Expose
    private Integer id = 0;
    @Expose
    private String descripcion;
    @Expose
    private Date fecha;

    /*@Expose(serialize = false)
    private Integer id_tipodocumento = 0;
    @Expose(deserialize = false)
    private TipoDocumentoBean obj_tipodocumento = null;*/
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    /*public TipoDocumentoBean getObj_tipodocumento() {
        return obj_tipodocumento;
    }

    public void setObj_tipodocumento(TipoDocumentoBean obj_tipodocumento) {
        this.obj_tipodocumento = obj_tipodocumento;
    }*/
    public DocumentoBean() {
    }

    public DocumentoBean(Integer id) {
        this.id = id;
    }

    @Override
    public String getColumns() {
        String strColumns = "";
        strColumns += "id,";
        strColumns += "descripcion,";
        strColumns += "fecha";
        return strColumns;
    }

    @Override
    public String getValues() {
        String strColumns = "";
        strColumns += id + ",";
        strColumns += EncodingUtilHelper.quotate(descripcion) + ",";
        strColumns += EncodingUtilHelper.stringifyAndQuotate(fecha);
        return strColumns;
    }

    @Override
    public String toPairs() {
        String strPairs = "";
        //strPairs += "id=" + id + ",";
        strPairs += "descripcion=" + EncodingUtilHelper.quotate(descripcion) + ",";
        strPairs += "fecha=" + EncodingUtilHelper.stringifyAndQuotate(fecha);
        return strPairs;
    }

    @Override
    public GenericBean fill(ResultSet oResultSet, Connection pooledConnection, PusuarioBean oPusuarioBean_security, Integer expand) throws SQLException, Exception {
        this.setId(oResultSet.getInt("id"));
        this.setDescripcion(oResultSet.getString("descripcion"));
        this.setFecha(oResultSet.getDate("fecha"));

        /*if (expand > 0) {
            TipoDocumentoBean oTipoDocumentoBean = new TipoDocumentoBean();
            TipoDocumentoDao oTipoDocumentoDao = new TipoDocumentoDao(pooledConnection, oPusuarioBean_security);
            oTipoDocumentoBean.setId(oResultSet.getInt("id_medico"));
            oTipoDocumentoBean = oTipoDocumentoDao.get(oTipoDocumentoBean, expand - 1);
            this.setObj_tipodocumento("id_tipodocumento");
        } else {
            this.setId_tipodocumento(oResultSet.getInt("id_tipodocumento"));
        }*/
        return this;
    }

}
