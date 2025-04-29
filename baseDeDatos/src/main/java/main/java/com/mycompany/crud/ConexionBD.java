package main.java.com.mycompany.crud;

import java.sql.*;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://192.168.7.41:3306/escuela_alejandro";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "Tic2024P@55W0rD";

    public static Connection conectar() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }
}