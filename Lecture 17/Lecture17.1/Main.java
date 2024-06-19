

public class Main{

    public static void main(String[] args) {
//        System.out.println(manager1.talk("Kalindu", "Kethaka "));
//        Director director1 = new Director();
//        Vehicle vehicle1 = new Vehicle("black", "BMW", "2020");
        Manager manager1 = new Manager("Kalindu", "0711111111", 50000);
        Vehicle v1 = new Vehicle("green", "gg", 2204);
        System.out.println(manager1.getSalary());
        manager1.setSalary(manager1.getSalary() + 20000);
        System.out.println(manager1.getSalary());
        System.out.println(manager1.getTelephoneNumber());


        Employee employee1 = new Employee("Kamal", "7024932222", 65000, 24);
        employee1.call();
        employee1.work();

        SalaryDepartment SalaryDepartment1 = new SalaryDepartment("Manager Salary", 10, "0112345678");
        System.out.println(SalaryDepartment1.getName());
        System.out.println(SalaryDepartment1.getEmpNum());
        SalaryDepartment1.setEmpNum(11);
        System.out.println(SalaryDepartment1.getEmpNum());

        TransportationDepartment transportationDepartment1 = new TransportationDepartment("Manager Transport", 5, "928444343433", 2);
        System.out.println(transportationDepartment1.getVehicleNumber());

//        ======Casting======
//        Upcasting

        Manager manager2 = new Manager("Kalindu", "230489723908748", 21312);
        Staff staff1 = manager2;

        Staff staff2 = new Manager("Kalindu", "230489723908748", 21312);

//        Downcasting

        Staff staff3 = new Staff("kalindu", "093938712", 245000);
        Employee emp1 = (Employee) staff3;

       Manager man = new Manager("Kalindu","07122222222",30000);
       Staff staff = man;
       Manager m = (Manager) staff;


        Department department1 = new TransportationDepartment("Kalindu",12,"0712222222",14);
        SalaryDepartment salaryDepartment1 = (SalaryDepartment) new Department("Kalindu",21,"0702222222");


        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        System.out.println(outer.x+ inner.y);





    }
    }







