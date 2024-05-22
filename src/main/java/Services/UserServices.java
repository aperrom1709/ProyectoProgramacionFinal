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




}



