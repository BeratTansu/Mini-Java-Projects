# Beyblade App (Object-Oriented Beyblade Simulation)

This project is a simple Java application that demonstrates Object-Oriented Programming (OOP) concepts using a Beyblade-themed simulation.
It includes examples of inheritance, polymorphism, method overriding, and the Factory Design Pattern.

## 📌 Project Overview

The application allows the user to create different types of Beyblades through a factory class.
Each Beyblade type has its own sacred beast, stats, and unique abilities.

## 🧩 Features

Multiple Beyblade classes (Dragon, Dranza, Drayga, Draciel)

Base class (Beyblade) implementing shared properties

Method overriding for:

showInfo()

attack()

revealSacredBeast()

BeybladeFactory that produces objects based on user input

Console-based user interaction (Test class)

## 🛠️ Technologies Used

Java 8+

OOP Principles

Inheritance

Polymorphism

Encapsulation

Factory Pattern

Console I/O (Scanner class)

## 📁 Class Structure
src/
│
├── Beyblade.java
├── Dragon.java
├── Dranza.java
├── Drayga.java
├── Draciel.java
├── BeybladeFactory.java
└── Test.java

## ▶️ How It Works

Application starts and asks the user which Beyblade type to produce.

The factory creates the Beyblade object.

Program displays:

Blader's name

Rotation speed

Attack power

Sacred beast

Beyblade performs:

Normal attack

Sacred beast summon

## 📷 Example Run
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

## 📌 Purpose of the Project

This project was created as a small Java OOP practice example
and serves as a clean demonstration of OOP fundamentals.

## 📄 License

This project is open-source.
Feel free to use or modify it as you wish.
