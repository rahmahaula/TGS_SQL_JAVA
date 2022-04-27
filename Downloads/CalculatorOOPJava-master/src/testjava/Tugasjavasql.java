/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.tugasjavasql;
        
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;        


public class Tugasjavasql {

public static Connection con;
    public static Statement stm;

 public static void main(String args[]){
 try {
 String url ="jdbc:mysql://localhost/testdblg";
 //testjava adalah nama db,silakan sesuaikan
 String user="root";
 String pass="";
//sesuaikan dengan username dan password di db mysql,defaultnya adalah seperti di atasapabila tidak ada perubahan
 Class.forName("com.mysql.jdbc.Driver");
 con =DriverManager.getConnection(url,user,pass);
 stm = con.createStatement();
 System.out.println("koneksi berhasil db nya punya Rahma;");
//xx diganti nama masing masing ya
 } catch (Exception e) {
 System.err.println("koneksi gagal" +e.getMessage());
 }
 }
}
