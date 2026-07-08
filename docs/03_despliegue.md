# Despliegue en la Nube - Railway

## URL Pública
https://alquiler-de-vehiculos-1-production.up.railway.app

## Proveedor Cloud
Railway.app - Plan gratuito (Hobby)

## Base de Datos
MySQL en Railway (instancia cloud)

## Variables de Entorno (GitHub Secrets / Railway Variables)
Las credenciales sensibles se gestionan mediante variables de entorno:
- `SPRING_DATASOURCE_URL` - URL de conexión a MySQL
- `SPRING_DATASOURCE_USERNAME` - Usuario de base de datos
- `SPRING_DATASOURCE_PASSWORD` - Contraseña de base de datos
- `APP_JWT_SECRET` - Clave secreta para tokens JWT
- `APP_JWT_EXPIRATION_MS` - Tiempo de expiración del token

Ninguna credencial está expuesta en el código fuente.

## Endpoints Disponibles
- POST `/api/auth/registro` - Registro de usuarios
- POST `/api/auth/login` - Autenticación y obtención de token JWT
- GET `/api/vehiculos` - Listado de vehículos (requiere token)
- GET `/api/alquileres` - Listado de alquileres (requiere token)
- GET `/api/clientes` - Listado de clientes (requiere token)

## Pasos del Despliegue
1. Push a rama `develop-marjhorick` en GitHub
2. Railway detecta el cambio automáticamente
3. Construye la imagen Docker multi-etapa
4. Despliega el contenedor con las variables de entorno configuradas
5. La app queda disponible en la URL pública