package funcional;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import funcional.*;
import classmates.*;
import java.sql.PreparedStatement;

/**
 *
 * @author serick
 */
public class Funciones {
    
    //variables para usar en frames
    public static String Usuario_ok=null;
    public static String cur1=null;
    
    //Variables para camparar
    public static String et1=null;
    public static String et2=null;
    public static String et3=null;
    public static String et4=null;
    public static String et5=null;
    public static String et6=null;
    public static String et7=null;
    public static String et8=null;
    public static String et9=null;
    public static String et10=null;
    
    //variables para realizar resgistro
    public static String est1=null;
    public static String est2=null;
    public static String est3=null;
    public static String est4=null;
    public static String est5=null;
    public static String est6=null;
    public static String est7=null;
    public static String est8=null;
    public static String est9=null;
    public static String est10=null;
    
    //variables para llenar lista no asistentes
    public static String bloq=null;
    
    
    public void Login(String nom, String pass){
        
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
        
        String pwmd5 = Md5.getMD5(pass);
        
        try
        {
        Statement b =  cn.createStatement();
        ResultSet busqusua = b.executeQuery("SELECT * FROM registro WHERE ID_nit and usuario='"+nom+"' and clave='"+pwmd5+"'");
        boolean found = false;
        int user_id = 0;
        while(busqusua.next()){found=true; user_id = busqusua.getInt("ID_nit");}
            if(found)
            {
                JOptionPane.showMessageDialog(null, "Acceso correcto...","Login",JOptionPane.INFORMATION_MESSAGE);
                this.Usuario_ok=nom;
                Ppal e1=new Ppal();
                e1.setVisible(true);


            }
            else
            {
                JOptionPane.showMessageDialog(null, "Intente de nuevo...","Login",JOptionPane.ERROR_MESSAGE);
            }
        }
            catch(SQLException ex)
            {
            JOptionPane.showMessageDialog(null,ex, "Error!!", JOptionPane.ERROR_MESSAGE);
            }
    }
    
    public void cursos(String spincurso){
        if(spincurso.equals("N01")){
        cur1=spincurso;
        Estudiantes e2=new Estudiantes();
        e2.setVisible(true);
            
        }
        else if(spincurso.equals("N02")){
        cur1=spincurso;
        Estudiantes e2=new Estudiantes();
        e2.setVisible(true);
        }
        else if(spincurso.equals("N03")){
        cur1=spincurso;
        Estudiantes e2=new Estudiantes();
        e2.setVisible(true);
        
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Por favor seleccione un curso");
        }
    }
    
    public void comparar(String t1){
        if(t1.equals("N01")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
            String query="SELECT `ID_nit`, `N01` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
            ps=cn.prepareStatement(query);
            rs=ps.executeQuery();
            
            while(rs.next()){
                String ns1 = rs.getString("N01");
                String ns2 = rs.getString("ID_nit");
                if(ns2.equals("1")){
                    et1=ns1;
                }
                else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }
        
        }
        }
        
        else if(t1.equals("N02")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
		String query="SELECT `ID_nit`, `N02` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("N02");
                 String ns2 = rs.getString("ID_nit");
                 if(ns2.equals("1")){
                     et1=ns1;
                 }
                 else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        }}
        else if(t1.equals("N03")){
        conexionMYSQL mysql=new conexionMYSQL();
        Connection cn=mysql.Conectar();
	PreparedStatement ps=null;
	ResultSet rs=null; 
        
        for (int i = 1; i <= 10; i++){
        
        try {
		String query="SELECT `ID_nit`, `N03` FROM `estudiantes` WHERE `ID_nit`='"+i+"'";
		ps=cn.prepareStatement(query);
		rs=ps.executeQuery();
              while(rs.next())
              {
                 String ns1 = rs.getString("N03");
                 String ns2 = rs.getString("ID_nit");
                 if(ns2.equals("1")){
                     et1=ns1;
                 }
                 else if(ns2.equals("2")){
                     et2=ns1;
                 }
                 else if(ns2.equals("3")){
                     et3=ns1;
                 }
                 else if(ns2.equals("4")){
                     et4=ns1;
                 }
                 else if(ns2.equals("5")){
                     et5=ns1;
                 }
                 else if(ns2.equals("6")){
                     et6=ns1;
                 }
                 else if(ns2.equals("7")){
                     et7=ns1;
                 }
                 else if(ns2.equals("8")){
                     et8=ns1;
                 }
                 else if(ns2.equals("9")){
                     et9=ns1;
                 }
                 else if(ns2.equals("10")){
                     et10=ns1;
                 }
                 
                 
              }
              
 
	}  
        catch (SQLException e) 
        {
         JOptionPane.showMessageDialog(null, e.getMessage());
        }     
        
        }
        }
        
    }
    
    public void enviarAbase(boolean ch1, boolean ch2, boolean ch3, boolean ch4, boolean ch5, boolean ch6, boolean ch7, boolean ch8, boolean ch9, boolean ch10, String txtest1, String txtest2, String txtest3, String txtest4, String txtest5, String txtest6, String txtest7, String txtest8, String txtest9, String txtest10){
        bloq="";
        
        if(ch1==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest1);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=txtest1;
        }
        
        if(ch2==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest2);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest2;
        }
        
        if(ch3==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest3);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest3;
        }
        
        if(ch4==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest4);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest4;
        }
        
        if(ch5==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest5);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest5;
        }
        
        if(ch6==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest6);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest6;
        }
        
        if(ch7==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest7);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest7;
        }
        
        if(ch8==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest8);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest8;
        }
        
        if(ch9==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest9);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest9;
        }
        
        if(ch10==true){
            conexionMYSQL mysql=new conexionMYSQL();
            Connection cn=mysql.Conectar();
            String Ssql="";
            String mensaje="";
            Ssql="INSERT INTO fallas(nombre) VALUES(?)";
            mensaje="los datos se ingresado correctamente";
            
            try{
                PreparedStatement pst= cn.prepareStatement(Ssql);
                pst.setString(1,txtest10);
                
                int n= pst.executeUpdate();
            }
            catch(SQLException ex){
                JOptionPane.showMessageDialog(null,ex);
            }
        }
        else{
            bloq=bloq+"\n"+txtest10;
        }
        
        Informe e2=new Informe();
        e2.setVisible(true);
    }
    
}
