# Keyboard Input Questions Explained
---

## **Program Summaries**

### **1. Convert Fahrenheit to Celsius**
- **File:** `Question1.java`
- **Description:** 
  This program converts a temperature value from Fahrenheit to Celsius. The user inputs the temperature in Fahrenheit, and the program calculates the equivalent in Celsius using the formula:
  \[
  \text{Celsius} = (\text{Fahrenheit} - 32) \times \frac{5}{9}
  \]
- **Example Output:**
  ```
  Enter Temperature in Fahrenheit: 98.6
  Celsius is: 37.0
  ```

---

### **2. Convert Distance in Kilometers**
- **File:** `Question2.java`
- **Description:**
  This program converts a distance in kilometers into meters, feet, inches, and centimeters. The user provides the distance in kilometers, and the program performs the conversions.
- **Example Output:**
  ```
  Enter your distance in km: 5
  5 km is 5000 meters
  5 km is 16404.1995 feet
  5 km is 196850.3935 inch
  5 km is 500000 centimetre
  ```

---

### **3. Calculate Gross Salary**
- **File:** `Question3.java`
- **Description:**
  This program calculates the Gross Salary of an employee based on their basic in-hand salary. It calculates DA (40% of basic), HRA (20% of basic), and adds them to the basic salary to compute the Gross Salary.
- **Example Output:**
  ```
  Enter Basic in-hand Salary: 50000
  DA is 20000.0
  HRA is 10000.0
  Gross salary is 80000
  ```

---

### **4. Sum of Digits**
- **File:** `Question4.java`
- **Description:**
  The program computes the sum of all digits in an integer between 0 and 1000. If the number is outside this range, it notifies the user.
- **Example Output:**
  ```
  Enter number between 0 and 1000: 987
  The sum of digits is 24
  ```

---

### **5. Calculate Surface Area and Volume of a Hemisphere**
- **File:** `Question5.java`
- **Description:**
  This program computes the surface area and volume of a hemisphere based on the radius provided by the user. The formulas used are:
  - Surface Area: \( 3 \times \pi \times r^2 \)
  - Volume: \( \frac{2}{3} \times \pi \times r^3 \)
- **Example Output:**
  ```
  Enter Radius of Hemisphere: 5
  Surface area of hemisphere is 235.61944901923448
  Volume of the hemisphere is 261.79938779914943
  ```

---

### **6. Free Fall Distance Calculator**
- **File:** `Question6.java`
- **Description:**
  This program calculates the distance traveled by an object in free fall (in feet) based on the time (in seconds) provided by the user. It uses the formula:
  \[
  \text{Distance} = 0.5 \times 32.174 \times (\text{time}^2)
  \]
- **Example Output:**
  ```
  Enter the number of seconds: 10
  Distance travelled in feet: 1608.7
  ```

---

### **7. Exponentiation Table**
- **File:** `Question7.java`
- **Description:**
  This program displays a table showing powers of integers `a` and `b`. The table starts with \(a=1\) and \(b=2\) and increments both values up to \(a=5\) and \(b=6\).
- **Example Output:**
  ```
  a    b    pow(a,b)
  1    2    1
  2    3    8
  3    4    81
  4    5    1024
  5    6    15625
  ```

---

## **How to Run**
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd <repository-directory>
   ```
2. Navigate to the desired program's file.
3. Compile and run using the following commands:
   ```bash
   javac <filename>.java
   java <filename>
   ```

---

## **Key Learnings**
- Handling user input with `Scanner`.
- Performing basic mathematical computations.
- Using loops and control structures effectively.
- Leveraging Java's `Math` class for operations like exponentiation and constants.

Happy coding! 🚀
