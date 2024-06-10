

public class Main{

    public static void main(String[] args) {
//        System.out.println(manager1.talk("Kalindu", "Kethaka "));
//        Director director1 = new Director();
//        Vehicle vehicle1 = new Vehicle("black", "BMW", "2020");
        Manager manager1 = new Manager("Kalindu", "0711111111", 50000);
        Vehicle v1 = new Vehicle("green", "gg", 2204);
        System.out.println(manager1.getSalary());
        manager1.setSalary(manager1.getSalary()+20000);
        System.out.println(manager1.getSalary());
        System.out.println(manager1.getTelephoneNumber());


        Employee employee1 = new Employee("Kamal", "7024932222" , 65000 , 24);
        employee1.call();
        employee1.work();

        
        }

    }







