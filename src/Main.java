import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable and scanner initializations
        int input;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        input = scanner.nextInt();

        //ternary for printing the intended result
        System.out.print(isPalindrome(input) ? input + " is a Palindrome number." : input + " is not a Palindrome number.");
    }

    static boolean isPalindrome(int number){
        int initialNumber = number, reversedNumber = 0, remainder;

        //operation to reverse the given number
        while (initialNumber != 0) {
            remainder = initialNumber % 10;
            reversedNumber = (reversedNumber * 10) + remainder;
            initialNumber /= 10;
        }

        return number == reversedNumber;
    }
}