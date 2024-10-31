/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.ConnectionDB;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author Sofia Moreno
 */
public class prueba {
    public static void main(String[] arg){
        ConnectionDB con = new ConnectionDB();
        Connection conex = con.getConnection(); 
        con.obtenerUsuarios(conex);
    }
    
}

