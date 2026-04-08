package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {

        // Question 1:
// declare variables here
// then code solution
// then use System.out.println() to display results
// ex: System.out.println("The answer is " + answer);
// REPEAT FOR NEXT EXERCISE

        //Question 1
        int bobSalary = 80000;
        int garySalary = 60000;

       int highestSalary = Math.max(bobSalary, garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //Question 2
        double carPrice = 40000.50;
        double truckPrice = 70000.5789;

        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is $" + lowestPrice);


        //Question 3
        double circleRadius = 7.25;
        double circleArea = Math.PI * circleRadius * circleRadius;

        System.out.println("The area of the circle is " + circleArea);


        //question 4
        //Find and display the square root a variable after it is set to 5.0

        double num = 5.0;
        double squareRoot = Math.sqrt(num);

        System.out.println("The square root of " + num + " is " + squareRoot);




    }
}