
# Java Development Environment Setup

# Java Library Management System - Setup

# Java Library Management System - Setup

## 1. JDK Installation

- JDK: Eclipse Temurin OpenJDK 25.0.5 LTS
- IDE: IntelliJ IDEA

## 2. Environment Variable Configuration

Configured Windows environment variables.

**JAVA_HOME**
C:\Program Files\Eclipse Adoptium\jdk-25.0.5.8-hotspot


**PATH**
%JAVA_HOME%\bin


## 3. Java Version Verification

**Command:**

```powershell
java -version


**Actual output:**

openjdk version "25.0.5" 2026-10-20 LTS
OpenJDK Runtime Environment Temurin-25.0.5+8 (build 25.0.5+8-LTS)
OpenJDK 64-Bit Server VM Temurin-25.0.5+8 (build 25.0.5+8-LTS, mixed mode, sharing)
```

**Command:**

```powershell
javac -version
```

**Actual output:**

```text
javac 25.0.5
```

## 4. Compile and Run Application

Compile:

```powershell
javac -d out src/LibraryApp.java
```

Run:

```powershell
java -cp out com.library.LibraryApp
```

**Program output:**

```text
Library System Ready
```

## 4. Compile and Run

Compile:

```powershell
javac -d out src/LibraryApp.java
```

Run:

```powershell
java -cp out LibraryApp
```

Program output:

```text
Library System Ready
```

## 5. IDE
IntelliJ IDEA

## 6. Source File
src/LibraryApp.java

## 7. Compilation
javac src/LibraryApp.java

## 8. Execution
java -cp src LibraryApp

## 9. Expected Output
Library System Ready

## 10. Verification
The program was successfully compiled and executed.
