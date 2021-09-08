package week1;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args){
        System.out.println("Please enter three integers:");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        scanner.close();
        int largest;

        if(number1 >= number2){
            if(number1>= number3) {
                System.out.println("The largest number is :" + number1);
            }
        }
        else
            if(number2>=number3) {
                System.out.println("The largest number is :" + number2);

        }
            else{
                System.out.println("The largest number is :" + number3);
            }
    }
}
