package Classes;
// @author Carlos

import Formularios.frmLogin;
        
public class ProjetoFacens {
    
    public static void main(String[] args) {
        Dados clsdados = new Dados();
        
        Dados_db clsdadosdb = new Dados_db();
        
        frmLogin Login = new frmLogin();
        
        Login.setDados(clsdados);
        Login.setDados_db(clsdadosdb);
        
        Login.setLocationRelativeTo(null);
        Login.setVisible(true);
    }
    
}
