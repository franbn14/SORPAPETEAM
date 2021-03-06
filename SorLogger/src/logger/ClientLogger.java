/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logger;

import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 *
 * @author alberto
 */
public class ClientLogger extends SorLogger {
    private static String message;    
                 
    public static void setLogMessage(int type, String client, String extraInfo) {                                
        Date today = new Date();
        String date=today.getDate()+"-"+(today.getMonth()+1)+"-"+(today.getYear()+1900);
        setLogger("Client Log","logCliente"+date+".log");
        
        message="";
        
        switch(type) {
            case 1: message="Sesión iniciada por "+client;
                break;
            
            case 2: message="Creada solicitud "+extraInfo+" por "+client;
                break;
               
            case 3: message="Eliminada solicitud "+extraInfo+" por "+client;
                break;
                
            case 4: message="Sesión finalizada por "+client;
                break;
                
            case 5: message="Registrado usuario "+client;
                break;
                                                            
          case 6: message="Aceptadas ofertas "+extraInfo+" por el cliente "+client;
                break;                            
                                                            
            case -1: message="Incio de sesión fallido: "+extraInfo+", cliente: "+client;
                break;
                
            case -2: message="Registro de usuario existente: "+client;
                break;
        }        
        writeLog(message,type);
    }
}
