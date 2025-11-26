# Beyblade App (Object-Oriented Beyblade Simulation)

This project is a simple Java application designed to demonstrate Object-Oriented Programming (OOP) through a Beyblade-themed simulation.
It showcases inheritance, polymorphism, method overriding, and the Factory Design Pattern in a clean and understandable way.

## 📌 Project Overview

The program lets the user create different Beyblade types through a factory.
Each Beyblade has:

A unique sacred beast

Different stats

Special attack animations

Shared base properties inherited from the Beyblade class

The project is fully console-based and ideal for Java OOP practice.

## 🧩 Features

Four Beyblade types: Dragon, Dranza, Drayga, Draciel

Base class: Beyblade

Overridden methods:

showInfo()

attack()

revealSacredBeast()

Factory class that generates objects based on user input

Easy-to-follow console interaction

## 🛠️ Technologies Used

Java 8+

OOP Principles

Inheritance

Polymorphism

Encapsulation

Factory Pattern

Console I/O (Scanner)

## 📁 Folder Structure

mini-java-projects/
│
└── BeybladeApp/
    ├── Beyblade.java
    ├── Dragon.java
    ├── Dranza.java
    ├── Drayga.java
    ├── Draciel.java
    ├── BeybladeFactory.java
    └── Test.java

## 🧪 Getting Started

Follow these steps to run the project locally:

### 1️⃣ Clone the repository and directly enter BeybladeApp folder

git clone https://github.com/berattansu/mini-java-projects.git
cd mini-java-projects/BeybladeApp

### 2️⃣ Compile all Java files

javac *.java

### 3️⃣ Run the program

java Test

## 🧬 UML Class Diagram (Mermaid)
```mermaid
classDiagram
    class Beyblade {
        -String bladerName
        -int rotationSpeed
        -int attackPower
        +showInfo()
        +attack()
        +revealSacredBeast()
    }

    class Dragon {
        -String sacredBeast
        -String hiddenAbility
        +showInfo()
        +revealSacredBeast()
    }

    class Dranza {
        -String sacredBeast
        +showInfo()
        +revealSacredBeast()
    }

    class Drayga {
        -String sacredBeast
        +showInfo()
        +revealSacredBeast()
    }

    class Draciel {
        -String sacredBeast
        +showInfo()
        +revealSacredBeast()
    }

    class BeybladeFactory {
        +produceBeyblade(type)
    }

    Beyblade <|-- Dragon
    Beyblade <|-- Dranza
    Beyblade <|-- Drayga
    Beyblade <|-- Draciel
    BeybladeFactory --> Beyblade
