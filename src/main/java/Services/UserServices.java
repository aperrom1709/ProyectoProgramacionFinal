package Services;

import Model.Classes.User;
import Model.db.ConectarBD_TV;
import Services.impl.ServiceLogger;
import Utils.CredentialsDB;


public class UserServices {
    private ServiceLogger logger;

    public void UserService() { // Realizar la conexión
        // 1. Crear objeto 'ConectarDB conectarDB = new ConectarDB()'
        ConectarBD_TV conectarBDTv=new ConectarBD_TV(CredentialsDB.USER,CredentialsDB.PASS,CredentialsDB.DB_NAME);



        // 2. conectarDB.RealizarConexion()
        conectarBDTv.realizarConexion();


        // 3. conectarDB.DesconectarDB()
        conectarBDTv.desconectarBD();
    }

    public boolean checkUserExists(User user) {


        return false;
    }
    public UserServices() {

        this.logger = new ServiceLogger();
    }


    public boolean checkUserExists(String text, String text1) {
        return false;
    }
}



