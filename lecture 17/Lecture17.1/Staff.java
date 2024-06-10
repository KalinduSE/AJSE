public class Staff {

    private String name;
    private String telephoneNumber;
    private int salary;

    public Staff(String name, String telephoneNumber, int salary){
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.salary = salary;
    }

    public String talk(String string1, String string2 ){
        return string1 + " " + string2+name;
    }

    public String getName(){
        return name;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    public int getSalary(){
        return salary;
    }

    public void setSalary(int salary){
        this.salary = salary;
    }
    
    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    } 
    
    
}