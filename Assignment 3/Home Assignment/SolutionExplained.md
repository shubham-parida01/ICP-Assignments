# HomeQuestions Solutions

This repository contains solutions to a set of Java programming exercises (referred to as "HomeQuestions"). The programs cover a variety of basic to intermediate programming topics such as conditionals, loops, user input handling, and random number generation. Below is a detailed explanation of each solution.

## Table of Contents
1. [HomeQuestion1: Scissor-Rock-Paper Game](#homequestion1-scissor-rock-paper-game)
2. [HomeQuestion2: Future Day of the Week](#homequestion2-future-day-of-the-week)
3. [HomeQuestion3: Random Month Name](#homequestion3-random-month-name)
4. [HomeQuestion4: Divisibility Check](#homequestion4-divisibility-check)
5. [HomeQuestion5: Name Display Based on Gender and Age](#homequestion5-name-display-based-on-gender-and-age)

---

### HomeQuestion1: Scissor-Rock-Paper Game
**Objective**: Write a Java program that plays the popular scissor-rock-paper game. The program randomly generates a number (0, 1, or 2) representing scissor, rock, and paper. The program prompts the user to enter a number and determines if the user wins, loses, or draws.

**Explanation**:
- The program uses random number generation to select one of the choices for the computer.
- The user inputs their choice (0, 1, or 2).
- A `switch-case` structure is used to determine the winner based on the user’s and computer’s choices.
- The program outputs whether the user wins, loses, or if there is a draw.

---

### HomeQuestion2: Future Day of the Week
**Objective**: Write a Java program that prompts the user to enter an integer for the current day of the week (Sunday = 0, Monday = 1, ..., Saturday = 6) and asks for the number of days after today to find the future day of the week.

**Explanation**:
- The program takes two inputs: the current day of the week and the number of days to add.
- The modulus operator (`%`) is used to calculate the future day by adding the input number of days to the current day and then using the remainder when divided by 7 (since there are 7 days in a week).
- The result is displayed to show the future day of the week.

---

### HomeQuestion3: Random Month Name
**Objective**: Write a Java program that randomly generates a number between 1 and 12 and displays the English name of the month corresponding to that number.

**Explanation**:
- The program generates a random integer between 1 and 12 using `Math.random()`.
- A `switch-case` statement is used to print the corresponding month name based on the generated number.

---

### HomeQuestion4: Divisibility Check
**Objective**: Write a Java program that takes an integer and determines whether it is divisible by 5 and 6, divisible by 5 or 6, and divisible by 5 or 6 but not both.

**Explanation**:
- The program uses conditional checks (`%` operator) to determine the divisibility of the input number by 5 and 6.
- Three conditions are checked:
  - Whether the number is divisible by both 5 and 6.
  - Whether the number is divisible by either 5 or 6.
  - Whether the number is divisible by either 5 or 6, but not both.
- The results are printed based on these conditions.

---

### HomeQuestion5: Name Display Based on Gender and Age
**Objective**: Write a Java program that displays an appropriate name for a person based on their gender, first name, last name, and age. If the person is female and 20 or over, the program asks if they are married and displays "Mrs." or "Ms." accordingly. If male and 20 or over, it displays "Mr.", else displays the first and last name.

**Explanation**:
- The program takes gender, first name, last name, and age as input.
- For females:
  - If the age is 20 or over, the program prompts for marital status and displays either "Mrs." or "Ms." based on the input.
  - If under 20, the first and last name are displayed.
- For males:
  - If 20 or over, "Mr." is displayed.
  - If under 20, the first and last name are displayed.
- The program uses nested if-else conditions to handle different cases based on the gender and age.

---

## How to Run the Programs

1. **Set Up**: Ensure that Java is installed on your system. If it’s not installed, download and install it from [Oracle's Java Downloads](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html).
   
2. **Compile**: Open your terminal/command prompt, navigate to the folder containing the Java files, and compile the programs using the `javac` command:
   ```sh
   javac HomeQuestion1.java
   javac HomeQuestion2.java
   javac HomeQuestion3.java
   javac HomeQuestion4.java
   javac HomeQuestion5.java
   ```

3. **Run**: After compiling, run each program by typing the following command:
   ```sh
   java HomeQuestion1
   java HomeQuestion2
   java HomeQuestion3
   java HomeQuestion4
   java HomeQuestion5
   ```

## Conclusion

This repository provides solutions to five different Java problems involving control structures like `if-else`, `switch-case`, random number generation, and input handling. These exercises help build a solid foundation for understanding Java programming concepts and control flow.