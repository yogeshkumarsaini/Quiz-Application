# Quiz Application

A simple console-based Quiz Application that presents multiple-choice questions (MCQs) to the user with a countdown timer for each question. Questions are loaded from a JSON file and the final score is calculated based on correct answers.

---

## ✨ Features

- Multiple Choice Questions (MCQs)
- Countdown timer for each question
- Automatic score calculation
- Questions loaded from a JSON file
- Final result display

---

## 🧠 Concepts Used

- Object-Oriented Programming (OOP)
- Timer & TimerTask
- File handling
- JSON parsing
- Exception handling
- Collections (ArrayList)

---

## 🏗️ Project Structure
```
QuizApplication/
│
├── src/
│   ├── QuizApp.java
│   ├── Question.java
│   ├── QuizService.java
│   └── TimerService.java
│
├── questions.json
└── README.md
```
---

## 📄 questions.json (example)

Place this file at the project root (next to `src/`).

```json
[
  {
    "question": "Which of the following is not a Java feature?",
    "options": ["Object-Oriented", "Platform Independent", "Use of pointers", "Secure"],
    "answer": 3
  },
  {
    "question": "Which method is the entry point of a Java program?",
    "options": ["start()", "main()", "run()", "init()"],
    "answer": 2
  },
  {
    "question": "Which keyword is used to inherit a class in Java?",
    "options": ["this", "super", "extends", "implements"],
    "answer": 3
  },
  {
    "question": "Which of these is not a primitive data type in Java?",
    "options": ["int", "float", "String", "char"],
    "answer": 3
  },
  {
    "question": "What is the size of int data type in Java?",
    "options": ["8 bits", "16 bits", "32 bits", "64 bits"],
    "answer": 3
  },
  {
    "question": "Which concept allows the same method name with different parameters?",
    "options": ["Inheritance", "Encapsulation", "Polymorphism", "Abstraction"],
    "answer": 3
  },
  {
    "question": "Which exception is thrown when dividing by zero?",
    "options": ["NullPointerException", "ArithmeticException", "IOException", "NumberFormatException"],
    "answer": 2
  },
  {
    "question": "Which collection does not allow duplicate elements?",
    "options": ["List", "ArrayList", "Set", "Map"],
    "answer": 3
  },
  {
    "question": "Which keyword is used to create an object in Java?",
    "options": ["class", "new", "object", "create"],
    "answer": 2
  },
  {
    "question": "Which of the following is used for memory management in Java?",
    "options": ["Compiler", "Interpreter", "Garbage Collector", "JVM"],
    "answer": 3
  }
]
```

---

## 🧩 Key Classes (overview)

- Question.java
  - Model class representing a question, its options and the index of the correct answer.

- TimerService.java
  - Manages a per-question countdown using `java.util.Timer` and `TimerTask`.

- QuizService.java
  - Loads questions (from JSON), presents them, reads user input, uses timer service, and computes the score.

- QuizApp.java
  - Main class to start the quiz; coordinates loading from `questions.json` and invokes `QuizService`.

---

## 🔧 Libraries / Dependencies

You can use either:

- Gson (recommended) — com.google.code.gson:gson
- json-simple — for minimal JSON parsing

If you use Maven, add Gson to `pom.xml`:

```xml
<dependency>
  <groupId>com.google.code.gson</groupId>
  <artifactId>gson</artifactId>
  <version>2.10.1</version>
</dependency>
```

---

## 🚀 Build & Run (simple, without a build tool)

1. Download the Gson jar (if using Gson), e.g. `gson-2.10.1.jar`.
2. From the project root:

Unix / macOS:
```bash
javac -cp gson-2.10.1.jar src/*.java -d out
cp questions.json out/
cd out
java -cp .:../gson-2.10.1.jar QuizApp
```

Windows (cmd):
```cmd
javac -cp gson-2.10.1.jar src\*.java -d out
xcopy questions.json out\
cd out
java -cp .;..\\gson-2.10.1.jar QuizApp
```

Notes:
- The code examples assume classes are in the default package. If you move them into packages, adjust the directory layout and compile/run classpaths accordingly.
- Ensure `questions.json` is available on the classpath or accessible by the code when reading from disk.

---

## ✅ Expected Behavior

- The app loads questions from `questions.json`.
- For each question, the app prints the question and options, starts a countdown timer, and accepts the user's answer.
- If time runs out for a question, it moves on.
- After all questions, the final score is displayed.

---

## ✍️ Extending the App (ideas)

- Add shuffled questions and options
- Add different difficulty levels or categories
- Persist high scores to a file or DB
- Add a GUI (Swing / JavaFX)
- Support timed quizzes with configurable time per question

---

## License

This project is provided as-is for learning and demonstration purposes. Feel free to reuse and modify.
