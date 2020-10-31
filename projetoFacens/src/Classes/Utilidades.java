
package Classes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utilidades {
    
    
    public static boolean isNumeric(String Numero){
        try{
            Integer.parseInt(Numero);
            return true;
            
        } catch (NumberFormatException nfe){
            return false;
        
        }
    }
    
    public static Date StringToDate(String Data){
    SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
    Date x = null;
    try{
        x = formatotexto.parse(Data);
         
    }catch(ParseException ex){
    
    
    }
    return x;
    }
}
