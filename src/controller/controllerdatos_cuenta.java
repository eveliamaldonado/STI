package controller;
import include.Datos_Cuenta;
import model.modelodatos_cuenta;

public class controllerdatos_cuenta {
    public boolean agregardatos_cuenta(Datos_Cuenta datos_cuenta){
        modelodatos_cuenta datos_cuenta1 = new modelodatos_cuenta();
        return datos_cuenta1.insertardatos_cuenta(datos_cuenta);
    }

    public static void main(String[] args){

        controllerdatos_cuenta cc= new controllerdatos_cuenta();
        System.out.println(cc.agregardatos_cuenta(new Datos_Cuenta(2,"Carmen","nchdg6634")));

    }
}
