import java.util.*;

class lec8{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if (marks > 74){
            System.out.println("A"); //75-100
        }
        else{

            if( marks > 64){
                System.out.println("B"); //65-74
            }
            else{

                if( marks > 54){
                    System.out.println("C"); //64-55
                }
               else{
                      System.out.println("Fail");  //54-0
                   }
              }
        }
 }
}
