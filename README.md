# 🔥 Flint

**Flint** is an interpreted programming language implemented in **Java**. It is designed to be simple, expressive, and dynamically typed.

## 🚀 Features

- ✅ **Single-threaded execution**
- ✅ **Dynamically typed variables**
- ✅ **First-class functions**
- ✅ **Arrays**
- ✅ **Objects**
- ✅ **Interpreted runtime** (no compilation step required)

## 🧠 Philosophy

Flint is built for:
- **Simplicity** – Keep syntax clean and human-friendly.
- **Flexibility** – Use dynamic types to make coding faster and more expressive.
- **Extensibility** – Built in Java for easy integration and future enhancement.

## 🧩 How It Works
Flint follows a three-stage execution model:

**Lexing** – A custom-built lexer (or tokenizer) reads the source code and breaks it into meaningful tokens like identifiers, numbers, operators, etc.

**Parsing** – A recursive descent parser reads the tokens and builds an Abstract Syntax Tree (AST). This tree represents the structure of the code using nodes like BinaryOperationNode, IfStatementNode, FunctionCallNode, etc.

**Execution** – Each node in the AST has an execute() method that is recursively called to evaluate the program logic. The result of executing the root node is the final outcome of the program.


## ✨ Example Code (Coming Soon)

```Flint
// Declare variables
var name = "Flint"
var count = 42

// Define a function
function greet(user) {
  print("Hello, " + user)
}

// Use arrays
var list = [1, 2, 3, 4]

// Use objects
var user = {
  name: "Alice",
  age: 30
}

greet(user.name)
```
