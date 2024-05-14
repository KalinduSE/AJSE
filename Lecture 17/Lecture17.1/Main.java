import java.util.Scanner;

public class Main{

    public static void main(String[] args){
        Manager manager1 = new Manager("Kalindu","0711111111", 50000);
//        System.out.println(manager1.talk("Kalindu","Kethaka"));
        System.out.println(manager1.name + " " + manager1.telephoneNumber +  " " + manager1.salary);
    }
}


    class Manager{
        String name;
        String telephoneNumber;
        int salary;

        public Manager(String name, String telephoneNumber, int salary){

            this.name = name;
            this.telephoneNumber = telephoneNumber;
            this.salary = salary;

        }

        void call(){
            System.out.println("Manager is calling");
        }

         String talk(String string1, String string2 ){

            return string1 + " " + string2;


        }

    }


