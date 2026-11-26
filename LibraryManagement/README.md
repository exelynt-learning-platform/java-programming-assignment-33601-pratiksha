# Library Management System

## Overview

This is a simple Java-based Library Management System demonstrating Object-Oriented Programming concepts.

The project contains a `Book` class with private fields, constructors, a static library name, and methods to display book information and calculate late return fines.

### Concepts demonstrated

- Encapsulation using private variables.
- Static variables shared across objects.
- Default and parameterized constructors.
- `this` keyword for accessing current object variables.
- Method overloading using `calculateFine()`.
- Object creation and method invocation.

## Project Structure

```text
library-management/
├── LibraryManagement.java
└── README.md
```

## Requirements

- Java Development Kit (JDK 8 or later).
- Command Prompt, PowerShell, or IntelliJ IDEA.

## How to Compile

Open a terminal inside the project directory and execute:

```bash
javac LibraryManagement.java
```

## How to Run

Execute:

```bash
java LibraryManagement
```

## Fine Calculation

The library charges Rs. 10 per late day.

Example:
- Late days: 5
- Normal fine: Rs. 50
- Member discount: 20%
- Final fine: Rs. 40

## Sample Program Run

```text
===== LIBRARY BOOK DETAILS =====
Library Name: City Central Library
Book Title: Java Programming
Author: James Gosling
Price: Rs. 550.0
----------------------------
Library Name: City Central Library
Book Title: Clean Code
Author: Robert C. Martin
Price: Rs. 750.0
----------------------------
Library Name: City Central Library
Book Title: Unknown
Author: Unknown
Price: Rs. 0.0
----------------------------
===== FINE CALCULATION =====
Fine for 5 late days: Rs. 50.0
Fine for 5 late days with 20% discount: Rs. 40.0
Fine for 3 late days: Rs. 30.0
```

## Author

Java Programming Assignment
