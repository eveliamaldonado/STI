package model;
import include.Datos_Cuenta;
import java.sql.PreparedStatement;

public class modelodatos_cuenta extends conexion {
    public boolean insertardatos_cuenta(Datos_Cuenta datos_cuenta){
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta ="INSERT INTO datos_cuenta"+"" +
                    "(id_usuario, usuario, password)" +
                    "VALUES(?, ?, ?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt(1, datos_cuenta.getId_usuario());
            pst.setString(2, datos_cuenta.getUsuario());
            pst.setString(3, datos_cuenta.getPassword());

            if (pst.executeUpdate()  == 1){
                flag = true;
            }


        }catch (Exception ex){
            System.out.println(ex.getMessage());
        } finally {
            try{
                if (getConection() != null) getConection().close();
                if (pst != null ) pst.close();
            } catch (Exception e) {

            }
        }

        return flag;
    }



}













