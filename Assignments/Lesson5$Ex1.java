import java.util.*;

public class Lesson5$Ex1 {

    public static void main(String[] args) {

        System.out.print("Input the string: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        int length = text.length();
        int wordsCount = 0;
        
        for (int i = 0; i < length; i++){

            if (text.charAt(i) == ' ') wordsCount++; 
        
        }

        System.out.println(wordsCount);
    }
}