# Configuración de Base de Datos - Gestión de Alquiler de Vehículos

## Pasos para Configurar la Conexión a MySQL

### 1. Instalar MySQL Server (si no lo tienes instalado)

**Windows:**
- Descarga el instalador desde https://dev.mysql.com/downloads/mysql/
- Ejecuta el instalador y sigue las instrucciones
- Asegúrate de que MySQL esté ejecutándose en el puerto **3306**
- Ten a mano la contraseña del usuario `root` (o configúrala sin contraseña)

**Linux (Ubuntu/Debian):**
```bash
sudo apt-get update
sudo apt-get install mysql-server
```

**macOS:**
```bash
brew install mysql
```

### 2. Crear la Base de Datos

Abre una terminal/cmd y conectate a MySQL:

```bash
mysql -u root -p
```

Si configuraste sin contraseña:
```bash
mysql -u root
```

Luego ejecuta el script SQL completo desde el archivo `scripts/01_init_database.sql`:

```sql
-- Copiar y pegar el contenido completo de scripts/01_init_database.sql
```

O desde la línea de comandos:
```bash
mysql -u root -p < scripts/01_init_database.sql
```

### 3. Verificar la Conexión en application.properties

El archivo `src/main/resources/application.properties` ya está configurado con:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/gestion_alquiler_vehiculos?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
```

**Si tu contraseña de MySQL es diferente**, modifica la línea:
```properties
spring.datasource.password=TU_CONTRASEÑA_AQUI
```

### 4. Ejecutar la Aplicación Spring Boot

```bash
mvn spring-boot:run
```

O si usas Maven directamente:
```bash
mvn clean install
mvn spring-boot:run
```

### 5. Verificar la Conexión

Una vez que la aplicación está ejecutándose, deberías ver en los logs:

```
Hibernate: create table if not exists combustibles (id_combustible integer not null auto_increment, ...)
Hibernate: create table if not exists marcas (id_marca integer not null auto_increment, ...)
...
```

Y finalmente:
```
Tomcat started on port(s): 8080 (http)
```

---

## Estructura de Tablas Creadas

### Tablas Maestras (Catálogos)
- **Marcas** - Marcas de vehículos
- **Modelos** - Modelos de vehículos
- **TiposVehiculo** - Tipos (SUV, Sedán, etc.)
- **Combustibles** - Tipos de combustible
- **EstadosVehiculo** - Estados del vehículo
- **TiposDocumento** - Tipos de documentos (SOAT, etc.)
- **EstadosAlquiler** - Estados del alquiler
- **MetodosPago** - Métodos de pago

### Tablas Principales
- **Vehiculos** - Información de vehículos
- **DocumentosVehiculo** - Documentos de vehículos
- **HistorialKilometraje** - Registro de kilometraje
- **HistorialInfracciones** - Registro de infracciones
- **Clientes** - Datos de clientes
- **Alquileres** - Alquileres activos
- **Pagos** - Registro de pagos

---

## Problemas Comunes

### "Connection refused" o "Can't connect to MySQL"
- Verifica que MySQL esté corriendo: `mysql -u root -p`
- Comprueba el puerto: `netstat -an | findstr 3306` (Windows) o `lsof -i :3306` (Linux/Mac)

### "Access denied for user 'root'"
- Verifica la contraseña en `application.properties`
- Reconfigura MySQL si olvidaste la contraseña

### "Unknown database 'gestion_alquiler_vehiculos'"
- Ejecuta nuevamente el script SQL: `scripts/01_init_database.sql`

### Hibernate DDL Auto
- `update` - Crea/actualiza tablas automáticamente
- `create-drop` - Crea tablas al iniciar y las elimina al cerrar
- `validate` - Solo valida sin cambios
- `none` - No hace nada

---

## Entidades JPA Creadas

Se han creado todas las entidades en `src/main/java/com/example/alquiler/entity/`:

- `Marca.java`
- `Modelo.java`
- `TipoVehiculo.java`
- `Combustible.java`
- `EstadoVehiculo.java`
- `TipoDocumento.java`
- `EstadoAlquiler.java`
- `MetodoPago.java`
- `Vehiculo.java`
- `DocumentoVehiculo.java`
- `HistorialKilometraje.java`
- `HistorialInfraccion.java`
- `Cliente.java`
- `Alquiler.java`
- `Pago.java`

Todas las entidades están completamente mapeadas con relaciones OneToMany y ManyToOne.

---

## Próximos Pasos

Después de confirmar que la base de datos está conectada, puedes:

1. Crear **Repositories** (Spring Data JPA)
2. Crear **Services** (Lógica de negocio)
3. Crear **Controllers** (REST API)
4. Implementar consultas personalizadas

¡Tu conexión a la base de datos está lista!
