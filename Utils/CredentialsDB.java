package Utils;

public class CredentialsDB {
    public static final String USER ="root";
    public static final String PASS= "";
    public static final String DB_NAME = "db_app";

    //Querys de la aplicacion
    public static String QUERY_LOGIN = "Select * from usuario WHERE id_usuario = ? and pass =?";
    public static String QUERY_CHECK_USER_IN_ACCESOS = "SELECT * From accesos Where idUsuario = ?";
    public static String QUERY_INSERT_USER_IN_ACCESOS = "INSERT INTO accesos VALUES(?,?)";
    public static String QUERY_UPDATE_NACCESOS = "UPDATE accesos set  NACCESOS= nAccesos+1 where idUsuario = ? ";
    public static String QUERY_INSERT_ALTA = "INSERT INTO usuario  VALUES (?,?,?,?)";


}
