import java.util.*;

class Lesson3$Ex1{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Input the 1st number: ");
        int n1 = input.nextInt();
        System.out.print("Input the 2nd number: ");
        int n2 = input.nextInt();
        System.out.print("Input the 3rd number: ");
        int n3 = input.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println( " The greatest: " +n1 );
        }
        if (n2>n1 && n2>n3){
            System.out.println( "The greatest: " +n2 );
        }
        if (n3>n2 && n3>n1){
            System.out.println( "The greatest: " + n3);
        }

    }
}