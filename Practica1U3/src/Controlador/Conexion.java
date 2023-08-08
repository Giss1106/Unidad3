
package Controlador;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {
    private static final String drive="com.mysql.jdbc.Drive";
    //ingresar al servidor
    private static final String user="root";
    private static final String pass="";
    private static final String url="jdbc:mysql://Localhost:3306/estudiante";
    Connection conectar=null;
    public Connection conexion(){
        try {
            Class.forName(drive);
            conectar=(Connection)DriverManager.getConnection(url,user,pass);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "error de coneccion"+e.getMessage());
        }
        return conectar;
    }
}
