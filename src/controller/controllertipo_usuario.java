package controller;
import include.Tipo_Usuario;
import model.modelotipo_usuario;
import java.util.ArrayList;


public class controllertipo_usuario {
    public boolean insertartipo_usuario(Tipo_Usuario tipo_usuario) {
        modelotipo_usuario tipo_usuario1 = new modelotipo_usuario();
        return tipo_usuario1.insertartipo_usuario(tipo_usuario);

    }
    public ArrayList<Tipo_Usuario> obtenertipo_usuario() {
        modelotipo_usuario tipo_usuario = new modelotipo_usuario();
        return tipo_usuario.obtenertipo_usuario();
    }


    public static void main(String[] args) {
        controllertipo_usuario cc = new controllertipo_usuario();
       // System.out.println(cc.insertartipo_usuario(new Tipo_Usuario(2,"alumna")));

        ArrayList<Tipo_Usuario> tipo_usuario = new ArrayList<Tipo_Usuario>();
        tipo_usuario = cc.obtenertipo_usuario();
        System.out.println(tipo_usuario.get(0).getId_tipo());
    }


}

