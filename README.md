Ejercicio 2 - Creador de Conexiones a Motores de Base de Datos

Explicación del programa

En este ejercicio se implementó el patrón de diseño Factory Method para crear conexiones a SQLite y PostgreSQL sin acoplar el código principal a las clases concretas, sin utilizar librerías externas ni imports.
El programa cuenta con:
- Una interfaz ConexionBD con el método ejecutarConsulta(String consulta).
- Dos clases concretas (ConexionSQLite y ConexionPostgres) que implementan ConexionBD.
- Una clase abstracta CreadorConexion que define el método de fábrica crearConexion().
- Dos clases creadoras concretas (CreadorConexionSQLite y CreadorConexionPostgres) que devuelven cada tipo de conexión.

Luego, dentro del método main, se utilizan los creadores para obtener las conexiones y ejecutar consultas de prueba.

Lógica utilizada

La lógica del programa consiste en:
- Definir una interfaz común para los distintos motores de base de datos.
- Delegar la creación de cada conexión concreta a su respectiva subclase creadora.
- Mantener la elección del creador separada del uso de la conexión.

Resultado de la ejecución

La ejecución del programa muestra en la consola lo siguiente:
Ejecutando en SQLite: SELECT 1;
Ejecutando en PostgreSQL: SELECT version();

Captura de pantalla

<img width="677" height="164" alt="image" src="https://github.com/user-attachments/assets/0c791de2-768b-4ec4-869a-d61ac01a3021" />
