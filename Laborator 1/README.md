**************************
*        COMPULSORY      *
**************************

Program Description:
This Java program demonstrates various functionalities including generating random numbers, performing arithmetic operations, and manipulating arrays. It also implements a method to compute the sum of digits until a single-digit result is obtained.

Program Steps:
1. Printing "Hello World!"
   - Displaying the message "Hello World!" on the screen.

2. Defining an Array of Programming Languages:
   - Creating an array called languages containing popular programming languages.

3. Generating a Random Integer:
   - Generating a random integer n between 0 and 999,999.

4. Performing Arithmetic Operations:
   - Multiplying n by 3.
   - Adding a binary number (10101) to the result.
   - Adding a hexadecimal number (FF) to the result.
   - Multiplying the result by 6.

5. Computing the Sum of Digits:
   - Computing the sum of digits of the result obtained in the previous step until a single-digit result is obtained.

6. Displaying the Chosen Language:
   - Displaying the message "Willy-nilly, this semester I will learn" followed by the programming language corresponding to the computed result.

**************************
*        HOMEWORK        *
**************************

Program Description:
This Java program checks for K-reductible numbers within a given range defined by two integer inputs, a and b, with a specified k value. A number is K-reductible if the sum of the squares of its digits eventually reduces to k after repeated operations.

Program Steps:
1. Input Validation:
   - Checking if the correct number of command-line arguments is provided. (Currently commented out in the code)

2. Parsing Command-line Arguments:
   - Parsing command-line arguments a, b, and k as integers.

3. Validating Input Range:
   - Verifying that a is less than b. If not, displaying an error message and exiting the program.

4. Finding K-Reductible Numbers:
   - Iterating through each number in the range [a, b] and checking if it is K-reductible using the isKReductible() method.

5. Checking K-Reductibility:
   - Implementing the isKReductible() method to determine if a given number is K-reductible.
     - Continuously summing the squares of the digits until the number reduces to a single digit.
     - Checking if the final reduced number is equal to the specified k.

6. Measuring Execution Time:
   - Recording the start and end time of the program execution to calculate the total duration.

7. Output:
   - Printing the K-reductible numbers found within the specified range along with the execution time in nanoseconds.

