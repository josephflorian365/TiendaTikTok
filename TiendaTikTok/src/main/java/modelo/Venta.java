/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author jesus
 */
public class Venta {
    private Integer IDVEN;
    private Date FECVEN;
    private Date FECENTVEN;
    private Cliente cliente = new Cliente();
    private Integer TOTVEN;

    public Venta() {
    }

    public Venta(Integer IDVEN, Date FECVEN, Date FECENTVEN, Integer TOTVEN, Cliente cliente) {
        this.IDVEN = IDVEN;
        this.FECVEN = FECVEN;
        this.FECENTVEN = FECENTVEN;
        this.TOTVEN = TOTVEN;
        this.cliente = cliente;
    }

    public Integer getIDVEN() {
        return IDVEN;
    }

    public void setIDVEN(Integer IDVEN) {
        this.IDVEN = IDVEN;
    }

    public Date getFECVEN() {
        return FECVEN;
    }

    public void setFECVEN(Date FECVEN) {
        this.FECVEN = FECVEN;
    }

    public Date getFECENTVEN() {
        return FECENTVEN;
    }

    public void setFECENTVEN(Date FECENTVEN) {
        this.FECENTVEN = FECENTVEN;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Integer getTOTVEN() {
        return TOTVEN;
    }

    public void setTOTVEN(Integer TOTVEN) {
        this.TOTVEN = TOTVEN;
    }
    
}
