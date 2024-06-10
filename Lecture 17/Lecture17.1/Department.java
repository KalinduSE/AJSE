public class Department {

    private String name;
    private int empNum;
    private String telephoneNumber;

    public Department(String name, int empNum, String telephoneNumber){
        this.name = name;
        this.empNum = empNum;
        this.telephoneNumber = telephoneNumber;
    }

    public String getName(){
        return name;
    }

    public int getEmpNum(){
        return empNum;
    }

    public String getTelephoneNumber(){
        return telephoneNumber;
    }

    public void setEmpNum(int empNum){
        this.empNum = empNum;
    }

    public void setTelephoneNumber(String telephoneNumber){
        this.telephoneNumber = telephoneNumber;
    }
}
