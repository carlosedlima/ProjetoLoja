
package Classes;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados_db {
    private Connection cnn;
    private String servidor = "localhost";
    private String nomeDoBanco = "petloja";
    private String usuario = "root";
    private String senha = "";
    
    public Dados_db(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            cnn = DriverManager.getConnection("jdbc:mysql://" + servidor + "/" + nomeDoBanco, usuario, senha);
        } catch (Exception ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean ValidarUsuarios(String usuario, String senha) {
        try {
            String sql = "select (1) from usuarios where idUsuario ='"+usuario+"'and senha ='"
                    +senha+"'";
            Statement st = cnn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(Dados_db.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        
    }
    
}
