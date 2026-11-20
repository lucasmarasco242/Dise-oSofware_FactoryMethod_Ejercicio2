public class Main {
    public static void main(String[] args) {
        CreadorConexion creadorSQLite = new CreadorConexionSQLite();
        ConexionBD conexion1 = creadorSQLite.crearConexion();
        conexion1.ejecutarConsulta("SELECT 1;");

        CreadorConexion creadorPostgres = new CreadorConexionPostgres();
        ConexionBD conexion2 = creadorPostgres.crearConexion();
        conexion2.ejecutarConsulta("SELECT version();");
    }
}