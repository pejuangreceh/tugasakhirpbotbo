
package koneksi;
import java.sql.*;
public class konek {
    public Connection cc;
    public Statement ss;
    public ResultSet rr;
    
    public void Class(){
    try{
        Class.forName("com.mysql.jdbc.Driver");
        cc=DriverManager.getConnection("jdbc:mysql://localhost/db_pbo","root","");
        System.out.println("Koneksi Sukses");
    }
    catch(Exception e){
        System.out.println(e);
    }
}
    
}
