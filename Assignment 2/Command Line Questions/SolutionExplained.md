# README for Command Line Programs

This document provides details and instructions on running the seven Java programs provided. Each program performs a unique task and requires appropriate input to work as expected.

---

## **Question 1**
**Description:**  
This program calculates and prints the quotient and remainder of two integers.

**How to Run:**  
1. Compile: `javac Question1.java`  
2. Execute: `java Question1 <dividend> <divisor>`  

**Example Input:**  
`java Question1 10 3`  

**Output:**  
```
Dividend: 10
Divisor: 3
Quotient: 3
Remainder: 1
```

---

## **Question 2**
**Description:**  
This program calculates the power of one integer raised to another. Both numbers must be positive integers.

**How to Run:**  
1. Compile: `javac Question2.java`  
2. Execute: `java Question2 <base> <exponent>`  

**Example Input:**  
`java Question2 2 3`  

**Output:**  
`8.0`  

**Error Case:**  
If any number is negative:  
`java Question2 -2 3`  
Output:  
`Error, Positive Integers needed`

---

## **Question 3**
**Description:**  
This program simulates rolling two dice, prints their values, and outputs their sum.

**How to Run:**  
1. Compile: `javac Question3.java`  
2. Execute: `java Question3`  

**Example Output:**  
```
Random Number 1: 4
Random Number 2: 6
Sum of Both is: 10
```

---

## **Question 4**
**Description:**  
This program calculates the value of `cos(5t) + sin(7t)` for a given input `t`.

**How to Run:**  
1. Compile: `javac Question4.java`  
2. Execute: `java Question4 <value_of_t>`  

**Example Input:**  
`java Question4 1.57`  

**Output:**  
`Value of cos(5t) + sin(7t) is 1.0000503383455067`  

---

## **Question 5**
**Description:**  
This program takes three integers as input and prints them in ascending order.

**How to Run:**  
1. Compile: `javac Question5.java`  
2. Execute: `java Question5 <num1> <num2> <num3>`  

**Example Input:**  
`java Question5 9 3 7`  

**Output:**  
`Ascending order is: 3, 7, 9`

---

## **Question 6**
**Description:**  
This program calculates the ASCII value of a given character.

**How to Run:**  
1. Compile: `javac Question6.java`  
2. Execute: `java Question6 <character>`  

**Example Input:**  
`java Question6 A`  

**Output:**  
`ASCII Value of A is: 65`

---

## **Question 7**
**Description:**  
This program checks whether any of the three integers satisfy a condition where one number is less than or equal to the product of the other two. Only positive integers are valid inputs.

**How to Run:**  
1. Compile: `javac Question7.java`  
2. Execute: `java Question7 <num1> <num2> <num3>`  

**Example Input:**  
`java Question7 3 4 5`  

**Output:**  
`true`  

**Error Case:**  
If any number is negative:  
`java Question7 -3 4 5`  
Output:  
`Error, Positive Integers needed`

---

## Notes:
- Ensure Java is installed and added to your system's PATH.
- Replace `<value>` placeholders with appropriate integers or characters while running the programs.
- Handle errors as mentioned in the respective descriptions.

Happy Coding! 😊
