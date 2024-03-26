import java.util.*;

class Workspace{
    public static void main(String[] args) {

        Random input = new Random();
        int n1 = input.nextInt(100);
        int n2 = input.nextInt(100);
        int n3 = input.nextInt(100);

        System.out.println( "First  random number is " +n1 );
        System.out.println( "Second random number is " +n2 );
        System.out.println( "Third  random number is " +n3 );

        if (n1>n2 && n1>n3){
            System.out.println( "Lagest number is " +n1 );
        }
        else if (n2>n1 && n2>n3){
            System.out.println( "Lagest number is " +n2 );
        }
        else {
            System.out.println("Lagest number is " + n3);
        }
    }
 }

