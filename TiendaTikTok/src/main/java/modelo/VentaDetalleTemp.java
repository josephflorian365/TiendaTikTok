/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jesus
 */
public class VentaDetalleTemp {

    private Integer CANTIDADTEMP;
    private Double PRECIOTEMPT;
    private Integer PRODUCTOTEMP;
    private Integer VENTATEMP;

    public VentaDetalleTemp() {
    }

    public VentaDetalleTemp(Integer CANTIDADTEMP, Double PRECIOTEMPT, Integer PRODUCTOTEMP, Integer VENTATEMP) {
        this.CANTIDADTEMP = CANTIDADTEMP;
        this.PRECIOTEMPT = PRECIOTEMPT;
        this.PRODUCTOTEMP = PRODUCTOTEMP;
        this.VENTATEMP = VENTATEMP;
    }

    public Integer getCANTIDADTEMP() {
        return CANTIDADTEMP;
    }

    public void setCANTIDADTEMP(Integer CANTIDADTEMP) {
        this.CANTIDADTEMP = CANTIDADTEMP;
    }

    public Double getPRECIOTEMPT() {
        return PRECIOTEMPT;
    }

    public void setPRECIOTEMPT(Double PRECIOTEMPT) {
        this.PRECIOTEMPT = PRECIOTEMPT;
    }

    public Integer getPRODUCTOTEMP() {
        return PRODUCTOTEMP;
    }

    public void setPRODUCTOTEMP(Integer PRODUCTOTEMP) {
        this.PRODUCTOTEMP = PRODUCTOTEMP;
    }

    public Integer getVENTATEMP() {
        return VENTATEMP;
    }

    public void setVENTATEMP(Integer VENTATEMP) {
        this.VENTATEMP = VENTATEMP;
    }
    
}
