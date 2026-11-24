# Temperature Converter - Execution Run Log

## 1. Project Overview

Created `TempConverter.java` to convert Celsius temperature into Fahrenheit.

Formula:

`Fahrenheit = (Celsius * 9 / 5) + 32`

The Celsius temperature is stored in a named constant.

## 2. Successful Compilation

**Command:**

```powershell
javac TempConverter.java
```

## 3. Successful Execution

**Command:**

```powershell
java TempConverter
```

**Actual output:**

```text
Temperature Converter
---------------------
Celsius: 25.0
Fahrenheit: 77.0
```

**Explanation:** The application successfully converted 25 degrees Celsius into 77 degrees Fahrenheit.

**Screenshot:** `screenshots/Screenshot 2026-11-25 001308.png`

## 4. Compile-Time Error

**Change introduced:** Removed the semicolon from the Celsius constant declaration.

**Command:**

```powershell
javac TempConverter.java
```

**Actual compiler output:**

TempConverter.java:6: error: ';' expected
double celsius = 25.0
^
1 error

**Explanation:** The missing semicolon caused a syntax error. The Java compiler detected the error and prevented compilation.

**Screenshot:** `screenshots/Screenshot 2026-11-25 001341.png`

## 5. Runtime Error

**Change introduced:** Added integer division by zero.

```java
int denominator = 0;
int result = 10 / denominator;
```

**Compilation command:**

```powershell
javac TempConverter.java
```
**Execution command:**

```powershell
java TempConverter
```

**Actual runtime error:**

Exception in thread "main" java.lang.ArithmeticException: / by zero
at TempConverter.main(TempConverter.java:12)

**Explanation:** The program compiled successfully, but execution resulted in an ArithmeticException because integer division by zero is not allowed.

**Screenshot:** `screenshots/Screenshot 2026-11-25 001433.png`

## 6. Final Verification

After removing the temporary errors, the original program was compiled and executed successfully again.

## 7. Conclusion

Successfully learned:

1. Writing and compiling Java programs using `javac`.
2. Executing Java programs using `java`.
3. Identifying compile-time errors.
4. Identifying runtime errors.
5. Capturing terminal evidence and documenting program execution.
