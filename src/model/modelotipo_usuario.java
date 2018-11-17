package model;
import include.Tipo_Usuario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class modelotipo_usuario extends conexion {
    public boolean insertartipo_usuario(Tipo_Usuario tipo_usuario) {
        PreparedStatement pst = null;
        boolean flag = false;
        try{
            String consulta ="INSERT INTO tipo_usuario"+"" +
                    "(id_tipo, nombre_tipo_usuario)" +
                    "VALUES(?, ?)";

            pst = getConection().prepareStatement(consulta);
            pst.setInt( 1, tipo_usuario.getId_tipo());
            pst.setString( 2, tipo_usuario.getNombre_tipo_usuario());

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

        public ArrayList<Tipo_Usuario> obtenertipo_usuario(){
            ArrayList<Tipo_Usuario> tipo_usuario = new ArrayList<Tipo_Usuario>();
            PreparedStatement pst = null;
            ResultSet rs = null;

           try {
                String consulta = "SELECT id_tipo, nombre_tipo_usuario"+
                        "FROM tipo_usuario";

                pst = getConection().prepareCall(consulta);
                rs = pst.executeQuery();
                while (rs.next()){
                    tipo_usuario.add(new Tipo_Usuario(rs.getInt("id_tipo"),
                            rs.getString("nombre_tipo_usuario")));


                }
            } catch (Exception e){

           } finally{
               try{
                   if(getConection() != null)getConection().close();
                   if(pst != null)pst.close();
                   if(rs !=null)rs.close();

               } catch (Exception e){

               }
           }

           return tipo_usuario;
        }

}






