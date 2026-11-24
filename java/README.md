# Java Library Management System

## 1. Project Overview

The Java Library Management System is a simple application designed to manage library operations.

The application helps users manage books and perform basic library activities.

### Features
- Add new books.
- View available books.
- Search for books.
- Issue books.
- Return books.
- Maintain library records.

## 2. Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Git
- GitHub
- Visual Studio Code

## 3. Project Folder Structure

```text
java/
│
├── variableDemo/
├── variableDemo.java/
├── README.md
└── .gitignore
```

## 4. How to Compile and Run

### Prerequisites
- Java JDK installed.
- VS Code installed.
- Java configured in the system PATH.

### Check Java installation

```bash
java -version
javac -version
```

### Compile Java files

If your Java source file is inside the variableDemo folder:

```bash
javac -d out variableDemo/*.java
```

### Run the application

```bash
java -cp out Main
```

Note: Replace `Main` with the class containing the main() method if your entry-point class has another name. Adjust the source path if your Java files are located elsewhere.

## 5. .gitignore Explanation

The `.gitignore` file prevents unnecessary files from being tracked by Git.

- `*.class` – Ignores compiled Java class files.
- `target/` – Ignores Maven build output.
- `out/` – Ignores compiled Java output.
- `.idea/` – Ignores IntelliJ IDEA configuration files.
- `.vscode/` – Ignores local VS Code configuration files.

## 6. Five Git Best Practices for Java Projects

1. Never commit compiled `.class` files or generated build directories.
2. Never commit passwords, API keys, database credentials, or other sensitive information.
3. Use meaningful commit messages that explain your changes.
4. Create feature branches for new features and bug fixes instead of directly modifying the main branch.
5. Review code through Pull Requests and test changes before merging into the main branch.

## 7. Git Collaboration Workflow

1. Create a GitHub issue describing the task.
2. Create a feature branch.
3. Implement the required changes.
4. Commit and push the changes.
5. Create a Pull Request referencing the issue.
6. Review and merge the Pull Request.

## 8. Author

Java Library Management Project