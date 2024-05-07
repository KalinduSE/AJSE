public class Main{

    public static void main(String[] args) {

        int x= 5;

        Employee emp1 = new Employee();
        emp1.age = 14;
        emp1.name = "Kalindu";
        emp1.number = "0701231234";
        System.out.println(emp1.age);z
        emp1.work();
        emp1.talk();
        Employee emp2 = new Employee();
        int sum = emp1.add(1,3);
        System.out.println(sum);
    }
}

class Employee{

    String name;
    int age;
    String number;
    float height;

    void work(){

        System.out.println("Started Working");

    }

    void talk(){

        System.out.println("Started Talking");

    }

    public int add (int x, int y){
        return x+y;
    }


}