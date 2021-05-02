package controlador;

import dao.VentaDetalleImpl;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import modelo.VentaDetalle;

@Named(value = "ventaDetalleC")  //ManagedBean
@SessionScoped
public class VentaDetalleC implements Serializable{

    private List<VentaDetalle> listaVentaDetalle;
    private VentaDetalleImpl dao;
    private VentaDetalle ventadetalle;

    public VentaDetalleC() {
        listaVentaDetalle = new ArrayList<>();
        dao = new VentaDetalleImpl();
        ventadetalle = new VentaDetalle();
    }

    public void agregarFila() {
        try {
            VentaDetalle ventadet = dao.agregarFila(ventadetalle.getProducto().getIDPRO());
            ventadet.setCANVENDET(this.ventadetalle.getCANVENDET());
            ventadet.setPREVENDET((ventadet.getProducto().getPREPRO()+0.50)*this.ventadetalle.getCANVENDET() );
            ventadet.setNOMPRO(ventadet.getProducto().getNOMPRO());
            this.listaVentaDetalle.add(ventadet);
            ventadetalle = new VentaDetalle();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public List<VentaDetalle> getListaVentaDetalle() {
        return listaVentaDetalle;
    }

    public void setListaVentaDetalle(List<VentaDetalle> listaVentaDetalle) {
        this.listaVentaDetalle = listaVentaDetalle;
    }

    public VentaDetalle getVentadetalle() {
        return ventadetalle;
    }

    public void setVentadetalle(VentaDetalle ventadetalle) {
        this.ventadetalle = ventadetalle;
    }

    public static void main(String[] args) {
        List<Integer> i = new ArrayList<>();
        i.add(1);
        System.out.println(i);
    }
    
}
