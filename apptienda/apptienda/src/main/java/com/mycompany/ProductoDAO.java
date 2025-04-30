package com.mycompany;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductoDAO {

    public void insertarProducto(Producto producto) {
        try (Connection con = ConexionBD.obtenerConexion()){
            String sql = "INSERT INTO productos(nombre, precio, stock) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, producto.getNombre());
            ps.setDouble(2, producto.getPrecio());
            ps.setInt(3, producto.getStock());
            ps.executeUpdate();
        } catch (Exception e){
            System.out.println("Error insertar: " + e);
        }
    }

    public List<Producto> listarProductos() {
        ArrayList<Producto> productos = new ArrayList<>();
            try (Connection con = ConexionBD.obtenerConexion()){
                String sql = "SELECT * FROM productos";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while(rs.next()){
                    productos.add(new Producto(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getDouble("precio"),
                        rs.getInt("stock")
                    ));
                }
            } catch (Exception e){
                System.out.println("Error listar: " + e);
            }
        return productos;
    }

    public void actualizarProducto(Producto producto) {
        try (Connection con = ConexionBD.obtenerConexion()){
                    String sql = "UPDATE productos SET nombre=?, precio=?, stock=? WHERE id=?";
                    PreparedStatement ps = con.prepareStatement(sql);
                    ps.setString(1, producto.getNombre());
                    ps.setDouble(2, producto.getPrecio());
                    ps.setInt(3, producto.getStock());
                    ps.setInt(4, producto.getId());
                    ps.executeUpdate();
                } catch (Exception e){
                    System.out.println("Error actualizar: " + e);
                }
    }

    public void eliminarProducto(int id) {
        try (Connection con = ConexionBD.obtenerConexion()){
                String sql = "DELETE FROM productos WHERE id=?";
                PreparedStatement ps = con.prepareStatement(sql);
                ps.setInt(1, id);
                ps.executeUpdate();
            } catch (Exception e){
                System.out.println("Error eliminar: " + e);
        }
    }
}

