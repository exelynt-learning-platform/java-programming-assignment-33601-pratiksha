
# Java Development Environment Setup

# Java Library Management System - Setup

## 1. JDK Installation

Installed JDK: JDK 25

## 2. Environment Variable Configuration

Configured the following Windows environment variables:

**JAVA_HOME**

```text
C:\Program Files\Java\jdk-25
```

**PATH**

```text
%JAVA_HOME%\bin
```

## 3. Java Version Verification

Command:

```powershell
java -version
```

Actual output:

java version "27.0.1.1" 2026-11-17
Java(TM) SE Runtime Environment (build 27.0.1.1+4-22)
Java HotSpot(TM) 64-Bit Server VM (build 27.0.1.1+4-22, mixed mode, sharing)

Command:

```powershell
javac -version
```

Actual output:

javac 27.0.1.1

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
