import java.util.*;

public class Lesson5$Ex2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int number = input.nextInt();
        primeChecker(number);

    }

    public static void primeChecker(int number){

        int x = 0;
        for (int i = 2; i < number; i++){

            if (number % i == 0) {
                System.out.println(number + " is not a prime number.");
                return;
            }
        }

        System.out.println(number + " is a prime number.");
    }
}
