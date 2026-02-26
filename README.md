[English version](README_EN.md)

# 🧙‍♂️ El Señor de los Anillos — Java (POO)

![Java Vanilla](https://img.shields.io/badge/Java-Vanilla-orange)
![POO Encapsulamiento | Herencia | Polimorfismo](https://img.shields.io/badge/POO-Encapsulamiento%20%7C%20Herencia%20%7C%20Polimorfismo-blue)
![Estado Completado](https://img.shields.io/badge/Estado-Completado-success)
[![GitHub Repo](https://img.shields.io/badge/GitHub-Repo-black)](https://github.com/)

Proyecto Java Vanilla orientado a objetos inspirado en el universo de El Señor de los Anillos, enfocado en practicar encapsulamiento, herencia y polimorfismo mediante una jerarquía de personajes y razas.

## Índice

- [🎯 Objetivo](#-objetivo)
- [✅ Requisitos cumplidos](#-requisitos-cumplidos)
- [🧩 Diseño UML](#-diseño-uml)
- [📁 Estructura del proyecto](#-estructura-del-proyecto)
- [🧠 Conceptos POO aplicados](#-conceptos-poo-aplicados)
- [▶️ Ejecución](#️-ejecución)
- [🖥️ Ejecución real del programa](#️-ejecución-real-del-programa)
- [📸 Evidencias](#-evidencias)
- [👤 Autor](#-autor)

## 🎯 Objetivo

Desarrollar un proyecto en Java Vanilla con una superclase (`LotrCharacter`) y cinco razas derivadas (`Elf`, `Human`, `Orc`, `Hobbit`, `Dwarf`), creando 3 personajes por cada raza en `Main.java` y ejecutando `printDetails()` para demostrar polimorfismo.

## ✅ Requisitos cumplidos

- [x] Superclase `LotrCharacter` con atributos privados, getters y setters.
- [x] Método `printDetails()` definido en la superclase.
- [x] Cinco subclases que extienden `LotrCharacter`: `Elf`, `Human`, `Orc`, `Hobbit`, `Dwarf`.
- [x] Atributo específico por raza:
  - [x] `Elf` → `visionRange`
  - [x] `Human` → `leadership`
  - [x] `Orc` → `sunlightWeakness`
  - [x] `Hobbit` → `stealth`
  - [x] `Dwarf` → `endurance`
- [x] Sobrescritura de `printDetails()` en cada subclase.
- [x] Invocación a `super.printDetails()` antes de imprimir información propia.
- [x] Creación de 3 personajes por cada una de las 5 razas en `Main.java`.
- [x] Demostración de polimorfismo al ejecutar `printDetails()`.

## 🧩 Diseño UML

El siguiente diagrama representa la jerarquía de clases y relaciones de herencia del proyecto:

![Diagrama UML](docs/lotrdrawio.png)

## 📁 Estructura del proyecto

```text
senor-de-los-anillos-java/
├─ docs/
│  ├─ console-output.png
│  └─ lotrdrawio.png
└─ src/
   └─ lotr/
      ├─ app/
      │  └─ Main.java
      ├─ model/
      │  └─ LotrCharacter.java
      └─ races/
         ├─ Dwarf.java
         ├─ Elf.java
         ├─ Hobbit.java
         ├─ Human.java
         └─ Orc.java
```

## 🧠 Conceptos POO aplicados

### 🔒 Encapsulamiento

La superclase `LotrCharacter` define sus atributos como privados (`name`, `age`, `weapon`, `realm`, `faction`, `powerLevel`, `specialItem`, `isAlive`) y expone el acceso mediante getters y setters.

### 🧬 Herencia

Las clases `Elf`, `Human`, `Orc`, `Hobbit` y `Dwarf` heredan de `LotrCharacter`, reutilizando su estructura base y extendiéndola con atributos propios de cada raza.

### 🎭 Polimorfismo

Cada subclase sobrescribe `printDetails()`, llama primero a `super.printDetails()` y añade su información específica. En `Main.java`, la invocación del método sobre distintos tipos demuestra comportamiento polimórfico.

## ▶️ Ejecución

Opción IntelliJ:

Ejecutar `Main.java` desde el IDE.

Opción Terminal:

```bash
javac -d out src/lotr/model/*.java src/lotr/races/*.java src/lotr/app/Main.java
java -cp out lotr.app.Main
```

## 🖥️ Ejecución real del programa

A continuación se muestra la salida real generada por el programa al ejecutar `Main.java`:

![Salida en consola](docs/console-output.png)

La salida puede variar según los datos definidos en `Main.java`.

## 📸 Evidencias

- Captura del resultado en consola en `/docs/console-output.png`.
- Diagrama UML en `/docs/lotrdrawio.png`.
- Commits siguiendo Conventional Commits.

## 👤 Autor

**David Navarro**
