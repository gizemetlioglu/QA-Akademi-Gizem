package week1;

import java.util.Scanner;

public class RelationalOperators {
    public static void main(String[] args){
        System.out.println("Please enter two integers");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        scanner.close();

        System.out.println("Number1 is " + number1 + " and number2 is " + number2);

        System.out.println("Number1  == number2 -->" + (number1  == number2));
        System.out.println("Number1  != number2 -->" + (number1  != number2));
        System.out.println("Number1  > number2 -->" + (number1  > number2));
        System.out.println("Number1  < number2 -->" + (number1  < number2));
        System.out.println("Number1  >= number2 -->" + (number1  >= number2));
        System.out.println("Number1  <= number2 -->" + (number1  <= number2));

}
}
