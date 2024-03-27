import java.util.*;

class lec10$4$0 {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            System.out.println("");
            for (int k = 10; k >= i; k--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
        }
        
    }
}
