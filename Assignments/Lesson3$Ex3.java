import java.util.*;

public class Lesson3$Ex3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int odd = number % 2;
        if (1 <= number && number <= 100) {

            if (odd == 1)
                System.out.println("Weird");
            else if (2 <= number && number <= 5)
                System.out.println("Not Weird");
            else if (6 <= number && number <= 20)
                System.out.println("Weird");
            else
                System.out.println("Not Weird");

        }
    }
}