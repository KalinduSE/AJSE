import java.util.*;

class Mywork{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int marks = input.nextInt();

        if (marks > 74){
            System.out.println("A");
        }
        else{

            if( 64 < marks  && marks < 75){
                System.out.println("B");
            }
            else{

                if( 64 < marks  && marks < 75){
                    System.out.println("B");
                }
                else{

                    if( 54 < marks  && marks < 65){
                        System.out.println("C");
                    }
                    else{
                            System.out.println("Fail");
                        }
                    }
                }
            }
        }

        






    }
