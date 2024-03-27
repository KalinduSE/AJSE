import java.util.*;

class lec10$2$0{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Type starting number of number range");
        int start = input.nextInt();
        System.out.println("Type end number of number range");
        int end = input.nextInt();
        int count = 1;
        for (int i = start; i <= end; i++){
            System.out.println(count + " number of number range is " +i);
            count++;
        }
    }
 }