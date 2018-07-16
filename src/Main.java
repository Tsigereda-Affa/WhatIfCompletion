import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Start with the code below and create a program that will output the sum, product, and average of num1 and num2.
        // If the calculated sum is over 200, print an asterisk next to the sum.
        int num1, num2;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is: " + sum);
        int product = num1 * num2;
        System.out.println("The product is: " + product);
        int  average = sum/2;
        System.out.println("The average is: " + average);
        if (sum>200)
            System.out.println(sum + "*");


    }
}
