package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Cliente;
import modelo.Producto;
import modelo.VentaDetalle;

public class VentaDetalleImpl extends Conexion {

    public VentaDetalle agregarFila(int idpro) throws SQLException, Exception {
        VentaDetalle v = null;
        String sql2 = "SELECT IDPRO,NOMPRO,PREPRO FROM PRODUCTO "
                + "WHERE IDPRO = " + idpro;
        try {
            PreparedStatement ps = this.conectar().prepareStatement(sql2);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                v = new VentaDetalle();
                Producto p = new Producto();
                v.setIDPRO(rs.getInt("IDPRO"));
                p.setNOMPRO(rs.getString("NOMPRO"));
                p.setPREPRO(rs.getDouble("PREPRO"));
                v.setProducto(p);
            }
            ps.close();
            rs.close();
        } catch (Exception e) {
            System.out.println("Error en el nuevo metodo DetalleDAO " + e.getMessage());
            e.printStackTrace();
        } finally {
            this.cerrarCnx();
            return v;
        }
    }
}
