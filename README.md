<em>TestMercadolibre</em>

Test de mercadolibre para identificar mutantes

Caracteristicas:

- Java 17
- SpringBoot 2.7.5
- Maven
- Hibernate: utiliza SQL Server
    - La configuracion se encuentra en el application.properties.
    - Agregar connexionString, usuario y contraseña de la conexion a la base de datos.
    - La base de datos tiene que tener 2 tablas, "Humanos" y "Verificados".
    - Ambas tablas tienen que tener un varchar(MAX) con el nomber "ADN" que no puede ser null

Servicios:

- "/stats":
    - Metodo: GET
    - Descripcion: Devuelve los totales de humanos y mutantes junto con un pocentaje de cuantos mutantes hay por humano.
    

- "/mutant":
    - Metodo: POST
    - Body: application/json y hay que enviar un String[] (nxn)
    - Descripcion: Valida si el adn que se envia es mutante o es humano.
    

