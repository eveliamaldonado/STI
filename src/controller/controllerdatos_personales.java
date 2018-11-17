package controller;
import include.Datos_Personales;
import model.modelodatos_personales;
import java.util.ArrayList;

public class controllerdatos_personales {
    public boolean agregardatos_personales(Datos_Personales datos_personales) {
        modelodatos_personales datos_personales1 = new modelodatos_personales();
        return datos_personales1.insertardatos_personales(datos_personales);
    }
     public ArrayList<Datos_Personales> obtenerdatos_personales(){
        modelodatos_personales datos_personales =  new modelodatos_personales();
        return datos_personales.obtenerdatos_personales();
     }
    public static void main(String[] args) {
        controllerdatos_personales cc = new controllerdatos_personales();
        //System.out.println(cc.agregardatos_personales(new Datos_Personales(2,"Carmen","Espinoza","Ramirez",23,1,1) ));

        ArrayList<Datos_Personales> datos_personales = new ArrayList<>();
        datos_personales = cc.obtenerdatos_personales();
        System.out.println(datos_personales.size());
    }
}