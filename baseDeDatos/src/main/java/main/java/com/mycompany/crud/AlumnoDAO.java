package main.java.com.mycompany.crud;

import java.sql.*;
import java.util.*;

public class AlumnoDAO {
    public void insertar(Alumno alumno) throws SQLException, ClassNotFoundException {
        String sql = "INSERT INTO alumnos (id, nombre, edad, curso) VALUES (?, ?, ?, ?)";
        try (Connection con = ConexionBD.conectar();//me traigo el método conectar de la clase conexionDB
            PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, alumno.getId());//el 1 significa valor del primer interrogante, defino ese valor como int del id de la tabla alumnos 
            ps.setString(2, alumno.getNombre());
            ps.setInt(3, alumno.getEdad());
            ps.setString(4, alumno.getCurso());
            ps.executeUpdate();
        }
    }
    
    public List<Alumno> obtenerTodos() throws SQLException, ClassNotFoundException {
        List<Alumno> lista = new ArrayList<>();
        String sql = "SELECT * FROM alumnos";
        try (Connection con = ConexionBD.conectar();
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Alumno a = new Alumno(
                    rs.getInt("id"),
                    rs.getString("nombre"),
                    rs.getInt("edad"),
                    rs.getString("curso")
                );
                lista.add(a);
            }
        }
        return lista;
    }
    
    public void actualizar(Alumno alumno) throws SQLException, ClassNotFoundException {
        String sql = "UPDATE alumnos SET nombre = ?, edad = ?, curso = ? WHERE id = ?";
        try (Connection con = ConexionBD.conectar();
        PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setString(1, alumno.getNombre());
            ps.setInt(2, alumno.getEdad());
            ps.setString(3, alumno.getCurso());
            ps.setInt(4, alumno.getId());
            ps.executeUpdate();
        }
    }
    
    public void eliminar(int id) throws SQLException, ClassNotFoundException {
        String sql = "DELETE FROM alumnos WHERE id = ?";
        try (Connection con = ConexionBD.conectar();
        PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
        }
    }
}
