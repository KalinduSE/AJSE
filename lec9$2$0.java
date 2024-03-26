import java.util.*;

class lec9$2$0{
    public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      System.out.println("Enter the mark");
      int mark = input.nextInt();

      switch(mark){
        case 1 :
        System.out.println("A");
        break;
        case 2 :
        System.out.println("B");
        break;
        case 3 :
        System.out.println("C");
        break;
        case 4 :
        System.out.println("D");
        break;
        case 5 :
        System.out.println("E");
        break;
        default :
        System.out.println("default value");
    }
 }
}