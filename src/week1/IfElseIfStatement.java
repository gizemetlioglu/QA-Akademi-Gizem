package week1;

import java.util.Scanner;

public class IfElseIfStatement {
    public static void main(String[] args){

        System.out.println("Please enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if(number>0){
            System.out.println("Number is positive");
        }
        else if (number<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
