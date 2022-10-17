package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import org.joda.time.DateTime;

/**
 *
 * @author viter
 */
public class MessageBean implements Serializable {
     
    private String aut;
    private String lang;
    private String msg;
    private String msg2;
        
    public MessageBean() {
    }
    
    public String getAut() {
        return "Juliana Scapim";
    }
    
    public void setLang(String value) {
        lang = value;
    }
    public String getMsg() {
         DateTime dateTime = new DateTime();
         int horario = dateTime.getHourOfDay();
         horario = horario - 3;
         String manha ="";
         String tarde ="";
         String noite ="";
        switch (this.lang){
            case "pt":
                if (horario > 0 && horario < 12){
                    manha = "Bom dia";
                    return manha;
                 }      
                else if (horario > 12 && horario < 18){
                     tarde = "Boa Tarde";
                     return tarde;
                 }
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getMsg2() {
        switch (this.lang){
            case "pt":
                return "Elaborado por";
            case "en":
                return "Created by";
            case "de":
                return "Erstellt von";
            case "fr":
                return "Créé par";
        }
        return "";
    }
}
