package week1;

import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args){
       // 1- Get midterm exam grade
       System.out.println("Please enter midterm grade:");
       Scanner scanner = new Scanner(System.in);
       int midtermGrade = scanner.nextInt();

        System.out.println("Please enter final grade:");
        int finalGrade = scanner.nextInt();

        scanner.close();
        // 3- Multiply midterm grade by 0.4
        double midtermPart = midtermGrade * 0.4;
        //4- Multiply final grade by 0.6
        double finalPart = finalGrade * 0.6;
       // 5- Add two results
       double grade = midtermPart + finalPart;
       // 6- Show the result
        System.out.println("Your grade is : " + grade);
    }
}
