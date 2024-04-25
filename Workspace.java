import java.util.*;

class Workspace {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1 ");
        int number = input.nextInt();
        math(number);
    }

    public static void math(int num1) {
        if (num1 % 3 == 0)
            System.out.println("number can divided by 3");
        else
            System.out.println("number can not divided by 3");

    }
}
