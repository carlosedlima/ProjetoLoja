
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
    
    
    public static String formatDate(Date Data){
    
        SimpleDateFormat formatotexto = new SimpleDateFormat("yyyy/MM/dd");
        
        return formatotexto.format(Data);
    }
    
    public static int objectToInt(Object Obj){
        int NumInt = Integer.parseInt(objectToString(Obj));
        return NumInt;
    }
    
    public static double objectToDouble(Object Obj){
        String Str = Obj.toString();
        double NumDouble = Double.valueOf(Str).doubleValue();
        return NumDouble;
    }
   
    
   public static String objectToString(Object Obj) {
        String Str = "";
        if (Obj != null){
            Str = Obj.toString();
        }
        return Str;
    }
   
    
}
