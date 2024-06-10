

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

        SalaryDepartment SalaryDepartment1 = new SalaryDepartment("Manager Salary" , 10 , "0112345678");
        System.out.println(SalaryDepartment1.getName());
        System.out.println(SalaryDepartment1.getEmpNum());
        SalaryDepartment1.setEmpNum(11);
        System.out.println(SalaryDepartment1.getEmpNum());

        TransportationDepartment transportationDepartment1 = new TransportationDepartment("Manager Transport", 5 , "928444343433", 2);
        System.out.println(transportationDepartment1.getVehicleNumber());

        ResearchProject researchProject1 = new ResearchProject("AI Reasearch", "Kamal",32);
        System.out.println(researchProject1.getName());
        employee1.talk();
        }

    }







