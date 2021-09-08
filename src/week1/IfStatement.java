package week1;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args){
        System.out.println("Please enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if(number < 0){
            System.out.println("Your number is negative!!!");
        }
        System.out.println("out of if block");
    }
}
