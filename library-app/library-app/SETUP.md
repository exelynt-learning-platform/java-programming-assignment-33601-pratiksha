# Java Library Application – Setup Guide

## 1. Project Overview

This project is created as part of Java development practice.

**Project Name:** library-app

**Programming Language:** Java

**JDK Version:** Java 25 LTS

**IDE:** IntelliJ IDEA

## 2. Java Installation

Java Development Kit (JDK) 25 was installed on Windows.

JAVA_HOME:

```text
C:\Program Files\Java\jdk-25
```

PATH configuration:

```text
%JAVA_HOME%\bin
```

## 3. Java Version Verification

Command:

```bash
java -version
```

Output:

openjdk version "25.0.5" 2026-10-20 LTS
OpenJDK Runtime Environment Temurin-25.0.5+8 (build 25.0.5+8-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.5+8 (build 25.0.5+8-LTS, mixed mode, sharing)

Command:

```bash
javac -version
```

Output:

javac 25.0.5

## 4. Project Structure

```text
library-app/
│
├── src/
│   └── LibraryApp.java
│
└── SETUP.md
```

## 5. Java Program

File: `LibraryApp.java`

```java
public class LibraryApp {

    public static void main(String[] args) {

        System.out.println("Library system is ready!!!");

    }
}
```

## 6. Program Execution

The application was executed successfully using IntelliJ IDEA.

Output:


Library system is ready!!!


## 7. Conclusion

Java JDK 25 was installed and configured successfully.

JAVA_HOME and PATH environment variables were configured.

IntelliJ IDEA was installed, and a Java project named library-app was created.

The LibraryApp program was compiled and executed successfully.