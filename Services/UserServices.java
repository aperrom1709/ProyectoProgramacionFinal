package Services;

import Model.Classes.User;
import Model.db.ConectarBD_TV;
import Services.impl.ServiceLogger;
import Utils.CredentialsDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class UserServices {
    private ServiceLogger logger;
    public ConectarBD_TV conectarBDTv;

    public  UserServices() { // Realizar la conexión
        // 1. Crear objeto 'ConectarDB conectarDB = new ConectarDB()'
        conectarBDTv=new ConectarBD_TV(CredentialsDB.USER,CredentialsDB.PASS,CredentialsDB.DB_NAME);



        // 2. conectarDB.RealizarConexion()
        conectarBDTv.realizarConexion();


        // 3. conectarDB.DesconectarDB()

        this.logger=new ServiceLogger();
    }

    public boolean checkUserExists(String user,String pass) {
        boolean siono=false;
        try{
            PreparedStatement st=conectarBDTv.obtenerConexion().prepareStatement(CredentialsDB.QUERY_LOGIN);
            st.setString(1,user);
            st.setString(2,pass);
            ResultSet rs=st.executeQuery();
            if (rs.next()){
                siono=true;
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }


        return siono;
    }
    public boolean registrarUsuario(String id_usuario, String pass, String correo,boolean isAdmin ) {
        boolean siono1=true;

        try{
            PreparedStatement st1=conectarBDTv.obtenerConexion().prepareStatement(CredentialsDB.QUERY_INSERT_ALTA);
            // Establecer los parámetros de la sentencia SQL
            st1.setString(1,id_usuario );
            st1.setString(2, pass);
            st1.setString(3, correo);
            st1.setBoolean(4,isAdmin);
            st1.executeUpdate();




        } catch (SQLException e) {
            e.printStackTrace();
        }
        return siono1;



    }




}



