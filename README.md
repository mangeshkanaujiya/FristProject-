 # 👨‍💻 First Year Java Projects

Welcome to my collection of **Java console-based mini-projects** built during the **first year of college**. These beginner-friendly programs are designed to strengthen basic Java concepts like input/output, conditional logic, loops, randomness, and formatting.

---

## 📦 List of Projects

1. [💱 Currency Converter](#1-currency-converter)
2. [🎓 Grade Calculator](#2-grade-calculator)
3. [🔢 Random Number Generator](#3-random-number-generator)
4. [🎮 Guess the Number Game](#4-guess-the-number-game)

---

## 1. 💱 Currency Converter

### 📌 Description

A Java application that converts Indian Rupees (INR) to other currencies like USD, GBP, EUR, and Kuwaiti Dinar (KWD), or vice versa. The conversion rates are hardcoded.

### ⚙️ Concepts Used

- Scanner for user input
- If-Else conditions
- `DecimalFormat` for formatting decimal output

### ▶️ How It Works

- User selects a currency code (1 to 5)
- Enters amount in selected currency
- The program converts it into other currencies using fixed exchange rates
- Formatted results are shown

### 🧪 How to Run

javac Currency_Converter.java
java Currency_Converter


##2. 🎓 Grade Calculator
📌 Description
This Java program takes the total marks and average percentage from the user, calculates the obtained marks, and assigns a grade (A to F) based on the percentage.

⚙️ Concepts Used
Arithmetic calculations

If-Else ladder for grading logic

User input using Scanner

▶️ How It Works
User enters total marks and average percentage

The program calculates obtained marks using:
obtained = (percentage / 100) * total

Then assigns grades as per the following scale:

Grade	Percentage
A	90%+
B	80–89%
C	70–79%
D	60–69%
F	< 60%

🧪 How to Run
javac GradeCalculator.java
java GradeCalculator


3. 🔢 Random Number Generator
📌 Description
This project generates a random number between two integers using Java’s ThreadLocalRandom class. Fast and secure random generation.

⚙️ Concepts Used
ThreadLocalRandom.current().nextInt(min, max+1)

Java random number logic

▶️ How It Works
The getRandomValue(min, max) method returns a random number between the two values

It is useful in games, testing, simulations, or lotteries

🧪 How to Run

javac GFG.java
java GFG

4. 🎮 Guess the Number Game
📌 Description
A fun and interactive game where the user has to guess a random number between 1 and 100 in 5 attempts.

⚙️ Concepts Used
Loops (for)

Random number generation

Conditional statements (if-else)

Scanner for input

▶️ How It Works
The computer randomly selects a number between 1 and 100

The user is given 5 chances to guess it

After each guess, a hint is given: "greater than" or "less than"

If the number is guessed correctly → "Congratulations!"

If not → actual number is revealed

🧪 How to Run
javac guessingNumberGame.java
java guessingNumberGame


📁 Folder Structure

First-Year-Java-Projects/
│
├── Currency_Converter.java
├── GradeCalculator.java
├── GFG.java
├── guessingNumberGame.java
└── README.md


🙋‍♂️ About Me
Hi, I'm Mangesh Ramsajivan Kanaujiya 
📫 Connect With Me:
GitHub: @mangeshkanaujiya
LinkedIn: linkedin.com/in/mangesh-kanaujiya





