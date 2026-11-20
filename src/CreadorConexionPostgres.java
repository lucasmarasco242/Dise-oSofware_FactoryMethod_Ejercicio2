public class CreadorConexionPostgres extends CreadorConexion {
    public ConexionBD crearConexion() {
        return new ConexionPostgres();
    }
}