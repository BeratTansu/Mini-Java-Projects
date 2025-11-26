Beyblade App (Object-Oriented Beyblade Simulation)

This project is a simple Java application that demonstrates Object-Oriented Programming (OOP) using a Beyblade-themed simulation.
It includes inheritance, polymorphism, method overriding, and the Factory Design Pattern.

📌 Project Overview

The user can create different types of Beyblades using a factory class.
Each Beyblade type has its own sacred beast, stats, and unique special abilities.

🧩 Features

Multiple Beyblade types (Dragon, Dranza, Drayga, Draciel)

Base class (Beyblade) with shared attributes

Polymorphism through overridden methods

showInfo()

attack()

revealSacredBeast()

BeybladeFactory that returns objects based on user input

Console-based interaction (Test class)

🛠️ Technologies Used

Java 8+

OOP Principles

Inheritance

Polymorphism

Encapsulation

Factory Pattern

Console I/O (Scanner)

📁 Class Structure
src/
│
├── Beyblade.java
├── Dragon.java
├── Dranza.java
├── Drayga.java
├── Draciel.java
├── BeybladeFactory.java
└── Test.java

🧪 Getting Started

Follow these steps to run the project locally:

1. Clone the Repository
git clone https://github.com/your-username/your-repo-name.git

2. Navigate to the Project Folder
cd your-repo-name

3. Compile the Java Files
javac *.java

4. Run the Program
java Test

🧬 UML Class Diagram (Mermaid)

GitHub otomatik olarak render eder. Direkt yapıştırabilirsin.

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

🔁 Program Flow (Flowchart)
flowchart TD
    A[Start Program] --> B[Show Menu]
    B --> C{User Input}
    C -->|Q| D[Exit Program]
    C -->|Valid Type| E[Create Beyblade via Factory]
    C -->|Invalid Type| F[Print 'Invalid Name'] --> B
    E --> G[Show Info]
    G --> H[Attack]
    H --> I[Reveal Sacred Beast]
    I --> B
    D --> J[End]

▶️ How It Works

The application greets the user and waits for input.

The user types a Beyblade name (Dragon, Dranza, etc.).

The factory creates the selected Beyblade.

The program prints:

Blader name

Rotation speed

Attack power

Sacred beast

The Beyblade performs:

A normal attack

A sacred beast summon animation

📷 Example Run
Welcome to the Beyblade Program...
Press 'Q' to exit.

Which Beyblade would you like to produce?
Dragon

Blader Name: Takao
Attack Power: 300
Rotation Speed: 800
Sacred Beast Name: Blue Dragon
Hidden Ability: Communicating with the Sacred Beast

Takao attacks with 300 and 800 rotation speed...
Takao is summoning Blue Dragon...
Takao's Attack: Phantom Cyclone

🎯 Purpose of the Project

This is a small Java OOP practice project designed to reinforce core concepts:

Class inheritance

Method overriding

Polymorphism

Factory pattern usage

📄 License

This project is open-source.
Feel free to use, modify, or extend it however you like.
