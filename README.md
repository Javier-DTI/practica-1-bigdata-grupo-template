# Práctica 1 — Word Count con Hadoop MapReduce en Java (Grupal)

## 1. Datos de la entrega

- **Asignatura:** Big Data
- **Práctica:** 1 — Word Count con Hadoop MapReduce
- **Equipo:** [Nombre del equipo]
- **Integrantes y usuarios GitHub:** [Completar]
- **Fecha:** [31/10/2026]

## 2. Objetivos

- Diseñar e implementar Word Count con la API Java de Hadoop MapReduce.
- Coordinar el desarrollo mediante Git y GitHub.
- Revisar e integrar los cambios de los integrantes.
- Ejecutar pruebas y validar el resultado en Hadoop.
- Documentar las decisiones técnicas y las contribuciones reales.

## 3. Enunciado

Desarrollad una aplicación Java que cuente las apariciones de palabras en ficheros de texto usando Hadoop MapReduce.

Componentes requeridos:
- **Mapper:** emite `(palabra, 1)` por token normalizado.
- **Combiner:** suma conteos localmente (si se mantiene, justificad por qué es válido).
- **Reducer:** suma los valores por palabra.
- **Driver:** configura y lanza el trabajo.

Acordad y documentad cómo se tratan las mayúsculas, la puntuación, los números, los acentos y las líneas vacías.

## 4. Organización del equipo

| Responsabilidad | Integrante | Resultados |
|---|---|---|
| Diseño e integración del driver | [Nombre] | [Resultados] |
| Implementación del mapper | [Nombre] | [Resultados] |
| Implementación del reducer / combiner | [Nombre] | [Resultados] |
| Pruebas y ejecución Hadoop | [Nombre] | [Resultados] |
| Documentación y revisión | [Nombre] | [Resultados] |

Adaptad los roles al tamaño del grupo. Todos deben revisar la solución y poder explicar el flujo completo. Registrad las contribuciones reales.

## 5. Estructura del proyecto

```text
.
├── README.md
├── pom.xml
├── src/main/java/es/bigdata/wordcount/
│   ├── WordCount.java
│   ├── WordCountMapper.java
│   └── WordCountReducer.java
├── data/
│   └── input.txt
└── docs/
    ├── decisiones-tecnicas.md
    └── resultados/
```

## 6. Plan de trabajo

1. Acordar la tokenización y el contrato de entrada/salida.
2. Repartir tareas y crear ramas de trabajo.
3. Implementar los componentes y abrir pull requests.
4. Revisar los cambios de otro integrante y resolver conflictos.
5. Integrar en la rama principal.
6. Compilar y ejecutar las pruebas localmente y en Hadoop.
7. Completar la documentación y revisar la entrega.

## 7. Entorno

- Ubuntu
- Java 21
- Hadoop 3.5.0
- Local / Stand-alone
  
## 8. Caso de uso

Entrada sugerida:

```text
Hola mundo hola
Big Data, mundo.
```

Salida esperada con la tokenización inicial:

```text
big	1
data	1
hola	2
mundo	2
```

El trabajo se considerará validado cuando:
- Compile sin errores.
- El mapper emita las parejas esperadas.
- El reducer calcule correctamente las sumas.
- La ejecución Hadoop termine correctamente.
- Se documenten al menos los casos de palabras repetidas, puntuación y entrada vacía.
- Los resultados reales coincidan con los esperados según la política de tokenización acordada.

## 9. Decisiones técnicas y colaboración

Documentad en `docs/decisiones-tecnicas.md`:
- La política de tokenización.
- El papel de Shuffle/Sort y del combiner.
- Los casos límite y las pruebas.
- Las alternativas evaluadas.
- Los enlaces a pull requests, revisiones y commits relevantes.
- Los problemas encontrados y cómo se resolvieron.

No uséis el número de commits como única prueba de participación; describid las aportaciones y revisiones concretas.

## 10. Conclusiones

[Qué aprendió el equipo, qué dificultades surgieron y qué mejoras proponéis.]

## 11. Fuentes

- [Apache Hadoop — MapReduce Tutorial](https://hadoop.apache.org/docs/stable/hadoop-mapreduce-client/hadoop-mapreduce-client-core/MapReduceTutorial.html)
- [Apache Hadoop — MapReduce API](https://hadoop.apache.org/docs/stable/api/)
