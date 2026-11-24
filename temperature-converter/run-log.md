# Temperature Converter - Run Log

## 1. Project Overview

Created a Java program named `TempConverter.java` to convert Celsius temperature into Fahrenheit.

Formula:

`Fahrenheit = (Celsius * 9 / 5) + 32`

## 2. Successful Compilation

**Command:**

```powershell
javac TempConverter.java
```

**Output:**

```text
Compilation successful. No errors.
```

**Explanation:** The Java compiler successfully compiled the source file and generated `TempConverter.class`.

## 3. Successful Execution

**Command:**

```powershell
java TempConverter
```

**Output:**

```text
Temperature Converter
---------------------
Celsius: 25.0
Fahrenheit: 77.0
```

**Explanation:** The program successfully converted 25°C into 77°F.

## 4. Compile-Time Error

**Change introduced:** Removed the semicolon after the Celsius variable declaration.

**Command:**

```powershell
javac TempConverter.java
```

**Actual error output:**

TempConverter.java:6: error: ';' expected
double celsius = 25.0
^
1 error

**Explanation:** The missing semicolon caused a syntax error. The Java compiler detected the issue and stopped compilation.

## 5. Runtime Error

**Change introduced:** Added integer division by a variable containing zero.

```java
int denominator = 0;
int result = 10 / denominator;
```

**Compilation command:**

```powershell
javac TempConverter.java
```

**Output:** Compilation successful.

**Execution command:**

```powershell
java TempConverter
```

**Actual error output:**

Exception in thread "main" java.lang.ArithmeticException: / by zero
at TempConverter.main(TempConverter.java:12)

**Explanation:** The program compiled successfully, but execution failed because integer division by zero is not allowed in Java.

## 6. Conclusion

Successfully learned:

1. How to write a Java temperature conversion program.
2. How to compile Java programs using `javac`.
3. How to execute Java programs using `java`.
4. How to identify compile-time errors.
5. How to identify runtime errors.
