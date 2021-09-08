package week1;

import java.util.Scanner;

public class IfElseStatement {
    public static void main(String[] args){

        System.out.println("Please enter an integer:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        if(number > 0){
            System.out.println("Your number is positive!!!!!");
        }
        else{
            System.out.print("Your number is not positive");
        }
    }
}
