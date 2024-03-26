import java.util.*;

class Workspace{
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);
      System.out.println("Enter the mark");
      int mark = input.nextInt();

      switch(mark){
        case 1 :
        System.out.println("A");
        case 2 :
        System.out.println("B");
        case 3 :
        System.out.println("C");
        case 4 :
        System.out.println("D");
        case 5 :
        System.out.println("E");
        default :
        System.out.println("default value");
    }
 }
}