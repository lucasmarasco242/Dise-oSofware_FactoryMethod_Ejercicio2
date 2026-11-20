public class ConexionSQLite implements ConexionBD {
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando en SQLite: " + consulta);
    }
}