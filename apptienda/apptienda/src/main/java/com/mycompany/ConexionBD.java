package com.mycompany;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    public static Connection obtenerConexion() {
        try {
            String url = "jdbc:mysql://192.168.7.41:3306/tienda_alejandro"; //Me conecto a la BD que he creado previamente en MySQL
            String usuario = "root";
            String contrasena = "Tic2024P@55W0rD";

            
            return DriverManager.getConnection(url, usuario, contrasena);
        } catch (SQLException e) {
            System.out.println("Error de conexión: " + e.getMessage());
            return null;
        }
    }
}