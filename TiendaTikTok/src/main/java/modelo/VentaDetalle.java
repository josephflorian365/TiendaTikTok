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
public class VentaDetalle {

    private Integer IDVENDET;
    private Integer CANVENDET;
    private Double PREVENDET;
    private Integer IDPRO;
    private String NOMPRO;
    private Integer IDVEN;
    private Producto producto = new Producto();
    private Venta venta = new Venta();

    public VentaDetalle() {
    }

    public VentaDetalle(Integer IDVENDET, Integer CANVENDET, Double PREVENDET, Integer IDPRO, Integer IDVEN, Producto producto, Venta venta,String NOMPRO) {
        this.IDVENDET = IDVENDET;
        this.CANVENDET = CANVENDET;
        this.PREVENDET = PREVENDET;
        this.IDPRO = IDPRO;
        this.IDVEN = IDVEN;
        this.producto = producto;
        this.venta = venta;
        this.NOMPRO = NOMPRO;
    }
    public Integer getCANVENDET() {
        return CANVENDET;
    }

    public void setCANVENDET(Integer CANVENDET) {
        this.CANVENDET = CANVENDET;
    }

    public Integer getIDVENDET() {
        return IDVENDET;
    }

    public void setIDVENDET(Integer IDVENDET) {
        this.IDVENDET = IDVENDET;
    }

    public Double getPREVENDET() {
        return PREVENDET;
    }

    public void setPREVENDET(Double PREVENDET) {
        this.PREVENDET = PREVENDET;
    }

    public Integer getIDPRO() {
        return IDPRO;
    }

    public void setIDPRO(Integer IDPRO) {
        this.IDPRO = IDPRO;
    }

    public Integer getIDVEN() {
        return IDVEN;
    }

    public void setIDVEN(Integer IDVEN) {
        this.IDVEN = IDVEN;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public String getNOMPRO() {
        return NOMPRO;
    }

    public void setNOMPRO(String NOMPRO) {
        this.NOMPRO = NOMPRO;
    }

    
}
