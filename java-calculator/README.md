# Java Calculator

## 1. Project Overview

The Java Calculator is a simple console-based application developed using Java. It performs basic arithmetic operations based on user input.

The project demonstrates fundamental Java programming concepts such as classes, methods, conditional statements, switch statements, loops, exception handling, and user input using the Scanner class.

## 2. Features

The calculator supports the following operations:

- Addition (+)
- Subtraction (-)
- Multiplication (*)
- Division (/)
- Modulus (%)
- Numeric input validation
- Operator validation
- Division by zero handling
- Modulus by zero handling
- User-friendly error messages

## 3. Technologies Used

- Programming Language: Java
- JDK: Java Development Kit
- IDE: Visual Studio Code
- Version Control: Git
- Repository Hosting: GitHub

## 4. Project Structure

```text
java-calculator/
│
├── src/
│   └── Calculator.java
│
├── .gitignore
├── README.md
└── github-connected.txt
```

## 5. Prerequisites

Before running the application, make sure you have:

- Java JDK installed.
- Java compiler (javac) configured.
- Java available in your system PATH.
- Visual Studio Code or any Java-supported IDE.

To verify Java installation, execute:

```bash
java -version
javac -version
```

## 6. How to Compile and Run

### Step 1: Clone the repository

```bash
git clone https://github.com/exelynt-learning-platform/java-programming-assignment-33601-pratiksha.git
```

### Step 2: Navigate to the project directory

```bash
cd java-programming-assignment-33601-pratiksha/java-calculator
```

### Step 3: Compile the Java program

```bash
javac src/Calculator.java
```

### Step 4: Run the application

```bash
java -cp src Calculator
```

## 7. Sample Program Run

### Example 1: Addition

```text
===== Java Calculator =====
Enter first number: 10
Enter operator (+, -, *, /, %): +
Enter second number: 5
Result: 15.0
```

### Example 2: Modulus

```text
===== Java Calculator =====
Enter first number: 10
Enter operator (+, -, *, /, %): %
Enter second number: 3
Result: 1.0
```

### Example 3: Division by Zero

```text
===== Java Calculator =====
Enter first number: 10
Enter operator (+, -, *, /, %): /
Enter second number: 0
Error: Division by zero is not allowed.
```

### Example 4: Invalid Numeric Input

```text
===== Java Calculator =====
Enter first number: abc
Invalid number! Please enter a numeric value: 10
```

### Example 5: Invalid Operator

```text
===== Java Calculator =====
Enter first number: 10
Enter operator (+, -, *, /, %): abc
Invalid operator! Please use +, -, *, / or %.
```

## 8. Git and GitHub Workflow

Git was used to manage the source code and track project changes.

The following Git operations were performed:

1. Initialized and configured the Git repository.
2. Created a feature branch named `add-modulus`.
3. Implemented the modulus (%) operation.
4. Committed changes using meaningful commit messages.
5. Merged the required upstream branch into the feature branch.
6. Pushed the feature branch to GitHub.
7. Merged the feature branch into the `main` branch.

### Important Git Commands

Check repository status:

```bash
git status
```

View available branches:

```bash
git branch
```

Create a feature branch:

```bash
git checkout -b add-modulus
```

Stage changes:

```bash
git add .
```

Commit changes:

```bash
git commit -m "Add modulus operation"
```

Push feature branch:

```bash
git push origin add-modulus
```

Merge feature branch into main:

```bash
git checkout main
git pull origin main
git merge add-modulus
git push origin main
```

## 9. Git History

The following command displays the project's commit history:

```bash
git log --oneline --graph --decorate
```

* 10aee93 (HEAD -> add-modulus, origin/add-modulus) Fix code review issues in Java calculator
*   f2c7026 Merge branch 'git-github-version-control-essentials-for-developers-week1-3049' into add-modulus
|\
| * 0cef7a0 (git-github-version-control-essentials-for-developers-week1-3049) docs: add input validation feature
* | 6326818 feat: add modulus operation
|/
* febaafe docs: document Git best practices
* 380e72f docs: add calculator execution example
* ec386ea docs: add project overview and setup
* c731a1f feat: add basic Java calculator
* 90e0d93 chore: add Java gitignore
* 8160147 chore: add Java gitignore
*   ed25255 (origin/main, origin/git-github-version-control-essentials-for-developers-week1-3049, origin/HEAD) Merge pull request #2 from exelynt-learning-platform/feature/add-readme-gitignore
|\
| * 816b4c2 (origin/feature/add-readme-gitignore, feature/add-readme-gitignore) Add project README and gitignore
| * 3d3cd8d completed assignment for working with remote repository
| * 2558a40 (origin/introduction-to-github-week1-3049, introduction-to-github-week1-3049) comleted git branching and merging assignment
| * d459286 comleted git branching and merging assignment
| * e3b78b2 comleted git branching and merging assignment
| * 4c95aaf comleted git branching and merging assignment
| * d3469d1 completed assignment of intro to github
|/
* eb4c292 (main, github-collaboration-best-practices-week1-3049) Add Git branching and merge documentation
* f019025 Add Git branching and merge documentation
* f697772 (add-desserts) Add three desserts to menu
* 2e548b5 Initial commit

## 10. Git Best Practices

The following Git best practices were followed during development:

1. Use meaningful commit messages that clearly explain changes.
2. Create separate feature branches for new functionality.
3. Keep the `main` branch stable and updated.
4. Avoid committing generated files such as `.class` files.
5. Review code changes before merging feature branches.

## 11. .gitignore Configuration

The `.gitignore` file prevents unnecessary files from being tracked by Git.

```gitignore
*.class
target/
out/
.idea/
.vscode/
```

Explanation:

- `*.class` - Excludes compiled Java class files.
- `target/` - Excludes Maven build output.
- `out/` - Excludes IDE compilation output.
- `.idea/` - Excludes IntelliJ IDEA configuration files.
- `.vscode/` - Excludes Visual Studio Code workspace settings.

## 12. Future Enhancements

Possible improvements for this project include:

- Add a graphical user interface.
- Support additional mathematical operations.
- Add calculation history.
- Add automated unit tests.
- Improve error handling and user experience.

## 13. Author

**Project:** Java Calculator

**Repository:** [Java Programming Assignment](https://github.com/exelynt-learning-platform/java-programming-assignment-33601-pratiksha)

**Feature Branch:** `add-modulus`

---

This project was developed as part of Java programming and Git/GitHub learning assignments.
