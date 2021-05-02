/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import modelo.Venta;

@Named
@RequestScoped
public class VentaC {

    private Venta venta;

    public VentaC() {
        venta = new Venta();
    }

    public void addMessage() {
        String summary = venta.getTOGGLESWICHT() ? "Activado" : "Desactivado";
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(summary));
    }

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }


}
