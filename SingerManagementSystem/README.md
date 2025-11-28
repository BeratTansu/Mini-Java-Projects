# 🎤 Singer Management System (ArrayList Implementation)
This project is a simple console-based Java application that simulates a database for managing a list of singers. It serves as a practical demonstration of using the ArrayList structure, essential input/output (I/O) operations with Scanner, and basic Object-Oriented Programming (OOP) principles.

The application allows users to add, view, update, remove, and search for singers in a dynamic list.

## 📌 Project Overview
The core data structure is a Java ArrayList<String>, which dynamically stores the names of the singers.

The application is split into two classes:

Singers: Handles all the business logic (adding, removing, updating the list).

Main: Provides the user interface, handles input, and manages the operation flow.

All operations are menu-driven and managed via a main application loop.

## 🧩 Key Features
Dynamic List Management: Uses ArrayList to manage singer names efficiently.

CRUD Operations: Supports Create (Add), Read (View), Update, and Delete (Remove) functionalities.

Search Functionality: Allows searching for a specific singer by name using the indexOf() method.

Menu-Driven Interface: Clear command-line interface guided by numbered options.

0-Based vs. 1-Based Indexing: Handles the conversion between user-friendly 1-based index input and Java's internal 0-based ArrayList indexing.

## 🛠️ Technologies Used
Java 8+

ArrayList (Dynamic List)

Basic OOP (Classes & Methods)

Encapsulation

Console I/O (Scanner)

## 📁 Folder Structure

src/
│
├── Singers.java   // The class that manages the ArrayList and business logic
└── Main.java      // The main class that handles the user interface and program flow

## 🧪 Getting Started

To run the Singer Management System, follow these steps in your terminal:

### 1️⃣ Clone the Repository
git clone https://github.com/berattansu/mini-java-projects.git
