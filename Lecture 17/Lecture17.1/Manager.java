


public class Manager extends Staff{


    public Manager(String name, String telephoneNumber, int salary){
        super(name, telephoneNumber, salary);
    }

    public void call(){
        System.out.println("Manager is calling");
    }

}  