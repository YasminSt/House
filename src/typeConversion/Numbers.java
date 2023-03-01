package typeConversion;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int firstNumber = scanner.nextInt();

        int secondNumber = 3;

        int result = firstNumber % secondNumber;

        if (result == 0){
            System.out.println("The Number is divisible");}
        else System.out.println("The Number is not divisible");
        }
    }

