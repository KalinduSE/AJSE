public class Vehicle{
    private String color;
    private String brand;
    private int year;


    public Vehicle(String color, String brand, int year){
        this.color = color;
        this.brand = brand;
        this.year = year;

    }
    public void drive(){
        System.out.println("Vehicle is Driving");
    }

    public void setColor(String color){
        color = this.color;
    }

    public String getColor(){ 
        return color;
    }

    public String getBrand(){
        return brand;
    }

    public int getYear(){
        return year;
    }
}

