Definición del Caso de Negocio y Requisitos

- Caso de Negocio

El sistema web de gestión de alquiler de vehículos tiene como objetivo automatizar y optimizar los procesos operativos dentro de una empresa de transporte. Actualmente, muchas empresas gestionan sus operaciones de manera manual o mediante herramientas no integradas, lo que genera desorden, errores en los registros y falta de control sobre la disponibilidad de los vehículos.

Este sistema permitirá centralizar la información de vehículos, clientes, alquileres y pagos, facilitando la gestión y mejorando la eficiencia operativa.

- Objetivo del Sistema

Desarrollar un sistema web basado en arquitectura REST que permita gestionar de manera eficiente el alquiler de vehículos, incluyendo el registro de clientes, control de vehículos, gestión de alquileres y seguimiento de pagos.

Actores del Sistema

Administrador
- Gestiona toda la información del sistema
- Registra vehículos, clientes y alquileres
- Supervisa el sistema

Usuario Operador
- Registra clientes
- Realiza alquileres
- Consulta disponibilidad de vehículos

Requisitos Funcionales

Gestión de Vehículos
- Registrar vehículos
- Actualizar información de vehículos
- Eliminar vehículos
- Consultar lista de vehículos
- Consultar disponibilidad de vehículos

Gestión de Clientes
- Registrar clientes
- Actualizar datos de clientes
- Eliminar clientes
- Consultar clientes

Gestión de Alquileres
- Registrar alquiler de vehículo
- Actualizar alquiler
- Cancelar alquiler
- Registrar devolución de vehículo
- Validar fechas de alquiler

Gestión de Pagos
- Registrar pagos
- Consultar pagos asociados a alquileres

Reglas de Negocio
- No permitir alquilar vehículos no disponibles
- Validar que la fecha de inicio sea menor a la fecha de fin
- Cambiar estado del vehículo automáticamente (disponible / alquilado / mantenimiento)


Requisitos No Funcionales

- El sistema debe ser accesible vía navegador web
- Debe tener una arquitectura REST
- Debe manejar datos en formato JSON
- Debe ser escalable y mantenible
- Debe utilizar una base de datos relacional
- Tiempo de respuesta menor a 2 segundos
- Código estructurado bajo buenas prácticas


Modelo de Datos 

Entidades principales:

- Vehículo
- Cliente
- Alquiler
- Pago
- HistorialVehiculo
- Usuario

Relaciones

- Un cliente puede tener muchos alquileres (1:N)
- Un vehículo puede estar en muchos alquileres (1:N)
- Un alquiler tiene un pago (1:1)
- Un vehículo tiene historial (1:N) 