# Java Library Management System

## 1. Project Overview

The Java Library Management System is a simple application designed to manage library operations.

It helps users manage books and perform basic library activities such as adding books, viewing available books, issuing books, and returning books.

### Features
- Add new books.
- Display all available books.
- Search for books.
- Issue books.
- Return books.
- Manage library records.

## 2. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Git
- GitHub
- VS Code

## 3. Project Folder Structure

```text
LibraryManagement/
│
├── src/
│   ├── Main.java
│   ├── Book.java
│   └── Library.java
│
├── README.md
├── .gitignore
└── .git/
```

## 4. How to Compile and Run

### Prerequisites
- Install Java JDK.
- Install VS Code.
- Configure Java in your system PATH.

### Compile the project

Open the terminal in the project root directory and execute:

```bash
javac -d out src/*.java
```

### Run the project

```bash
java -cp out Main
```

Note: These commands assume that your Java files do not use package declarations and Main.java contains the main() method.

## 5. .gitignore Explanation

The `.gitignore` file excludes unnecessary files from Git tracking.

- `*.class` – Ignores compiled Java class files.
- `out/` – Ignores compiled output files.
- `target/` – Ignores Maven build output.
- `.idea/` – Ignores IntelliJ IDEA configuration files.
- `.vscode/` – Ignores local VS Code configuration files.

## 6. Git Best Practices for Java Projects

1. Never commit compiled `.class` files or build output directories.
2. Never commit passwords, API keys, database credentials, or other sensitive information.
3. Use meaningful commit messages to describe code changes.
4. Create feature branches instead of directly modifying the main branch.
5. Create pull requests and review code before merging changes into the main branch.

## 7. Git Workflow

1. Create a GitHub issue describing the required change.
2. Create a feature branch for the issue.
3. Implement and commit the changes.
4. Push the feature branch to GitHub.
5. Create a pull request referencing the issue.
6. Review and merge the pull request.

## 8. Author

Java Library Management Project
