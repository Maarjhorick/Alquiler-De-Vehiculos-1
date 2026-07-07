# Resumen de Integración Continua (CI)

## Pipeline GitHub Actions
El flujo CI está configurado en `.github/workflows/devsecops.yml` y se activa en cada Pull Request hacia las ramas `develop` y `main`.

## Pasos del Pipeline
1. Descarga del código fuente
2. Configuración del entorno Java 17
3. Compilación y pruebas unitarias con JaCoCo
4. Análisis de seguridad con Snyk
5. Construcción de imagen Docker (multi-etapa)
6. Escaneo de vulnerabilidades con Trivy
7. Despliegue de imagen a Docker Hub

## Herramientas Integradas
- **SonarCloud:** Análisis estático de calidad de código. Quality Gate: Passed.
- **Snyk:** Análisis de vulnerabilidades en dependencias Maven.
- **Trivy:** Escaneo de vulnerabilidades en la imagen Docker.
- **JaCoCo:** Reporte de cobertura de pruebas unitarias.
- **Docker Hub:** Registro de imagen: `marjhorick/alquiler-api:latest`

## Resultado
El pipeline garantiza que ningún código con errores de compilación, 
vulnerabilidades críticas o sin pruebas llegue a la rama main.