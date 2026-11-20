public class CreadorConexionSQLite extends CreadorConexion {
    public ConexionBD crearConexion() {
        return new ConexionSQLite();
    }
}