

public class Employee  extends Staff{

    private int age;

    public Employee(String name, String telephoneNumber, int salary, int age)
    {
        super(name, telephoneNumber, salary);
        this.age = age;
    }



    ///////////////////////////////////////////////////////////////////////////



    public void work(){
        System.out.println(getName() + " is working");
    }

     void call(){
        System.out.println(getName() + " is working");
    }

    public int getAge(){
        return age;
    }

}




