# Corrección del BUG KAN-5

## BUG relacionado
KAN-5 - [BUG] Corregir mensaje de error al no encontrar vehículo

## Incidencia relacionada
KAN-4 - [INC] Error al buscar vehículo inexistente en el sistema

## Descripción del problema
Se identificó que, al buscar un vehículo inexistente en el sistema de alquiler de vehículos, el sistema no mostraba un mensaje claro para el usuario.

## Resultado actual
El sistema mostraba un mensaje genérico, incorrecto o poco entendible.

## Resultado esperado
El sistema debe mostrar el siguiente mensaje:

"Vehículo no encontrado. Verifique el ID ingresado."

## Solución propuesta
Se documenta la corrección del mensaje de error para que el usuario pueda identificar claramente que el vehículo buscado no existe.

## Validación realizada
- Se revisó el flujo de búsqueda de vehículo.
- Se identificó el escenario donde el vehículo no existe.
- Se definió un mensaje claro para el usuario.
- Se relacionó esta corrección con el BUG KAN-5 y la incidencia KAN-4.

## Estado
Corrección lista para revisión mediante Pull Request.
