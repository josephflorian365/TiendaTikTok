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
    private Producto producto = new Producto();
    private Venta venta = new Venta();

    public VentaDetalle() {
    }

    public VentaDetalle(Integer IDVENDET, Integer CANVENDET, Double PREVENDET, Producto producto, Venta venta) {
        this.IDVENDET = IDVENDET;
        this.CANVENDET = CANVENDET;
        this.PREVENDET = PREVENDET;
        this.producto = producto;
        this.venta = venta;
    }

    public Integer getIDVENDET() {
        return IDVENDET;
    }

    public void setIDVENDET(Integer IDVENDET) {
        this.IDVENDET = IDVENDET;
    }

    public Integer getCANVENDET() {
        return CANVENDET;
    }

    public void setCANVENDET(Integer CANVENDET) {
        this.CANVENDET = CANVENDET;
    }

    public Double getPREVENDET() {
        return PREVENDET;
    }

    public void setPREVENDET(Double PREVENDET) {
        this.PREVENDET = PREVENDET;
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
    
}
