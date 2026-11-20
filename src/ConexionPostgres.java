public class ConexionPostgres implements ConexionBD {
    public void ejecutarConsulta(String consulta) {
        System.out.println("Ejecutando en PostgreSQL: " + consulta);
    }
}