# Sistema Académico - Refactorización y Diseño OO

Este repositorio contiene la implementación de un sistema de gestión académica integral, desarrollado como parte de la materia de **Desarrollo de Software Orientado a Objetos**. El proyecto se enfoca en la transición de un diseño inicial hacia una arquitectura robusta, escalable y profesional en **Java**.

## 🚀 Resumen de la Refactorización

El objetivo principal fue transformar un modelo de datos básico en una estructura de software de alta calidad, aplicando los siguientes principios:

* **Encapsulamiento Estricto**: Se migraron todos los atributos de acceso público a privado (`-`), garantizando la integridad de los datos mediante métodos *getter* y *setter*.
* **Tipado de Datos Moderno**: Sustitución de tipos de datos primitivos e incorrectos (como `char` para cadenas) por `String` y la integración de `java.time.LocalDateTime` para la gestión de eventos y noticias.
* **Abstracción y Herencia**: Implementación de una jerarquía clara para Usuarios (`Docente`, `Alumno`) y Programas Académicos (`Carrera`, `Postgrado`).
* **Patrón de Diseño DAO**: Introducción de una capa de persistencia desacoplada utilizando el patrón **Data Access Object** con una interfaz genérica `IGenericDAO<T>`.

---

## 🏗️ Arquitectura del Sistema

El proyecto está organizado bajo una estructura de paquetes que separa las responsabilidades de negocio de las de almacenamiento:

### 📦 Paquete `model`
Contiene las entidades que representan el dominio del sistema académico:
* **Usuarios**: Gestión de perfiles con roles específicos (Coordinador, Docente, Alumno).
* **Estructura Académica**: Definición de Departamentos, Programas, Asignaturas e Investigaciones.
* **Comunicación**: Manejo de Noticias (con soporte para imágenes) y Eventos institucionales.

### 📦 Paquete `persistence`
Define la lógica de acceso a datos:
* **`IGenericDAO<T>`**: Interfaz que define las operaciones CRUD fundamentales de forma abstracta.
* **Implementaciones**: Clases específicas (ej. `DocenteDAO`) que ejecutan la lógica de persistencia para cada entidad.



---

## 🛠️ Tecnologías y Herramientas

* **Lenguaje**: Java 17+
* **IDE**: IntelliJ IDEA
* **Paradigma**: Programación Orientada a Objetos (POO)
* **Gestión de Versiones**: Git

---
**Ingeniería en Sistemas Computacionales**