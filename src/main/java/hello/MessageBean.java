package hello;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.beans.*;
import java.io.Serializable;
import java.time.LocalTime;
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
        LocalTime hora = LocalTime.now();
        if (hora.getHour() >= 0 && hora.getHour() < 12){
               return getManha();
        }
        else if (hora.getHour() >= 12 && hora.getHour() < 18){
               return getTarde();
        }
        else{
               return getNoite();
        }
    }
     
    public String getManha() {
        switch (this.lang){
            case "pt":
                return "Bom dia" ++ hora.getHour();
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getTarde() {
        switch (this.lang){
            case "pt":
                return "Boa Tarde" ++ hora.getHour();
            case "en":
                return "Hello";
            case "de":
                return "Hallo";
            case "fr":
                return "Bonjour";
        }
        return "";
    }
    public String getNoite() {
        switch (this.lang){
            case "pt":
                return "Boa noite" ++ hora.getHour();
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
