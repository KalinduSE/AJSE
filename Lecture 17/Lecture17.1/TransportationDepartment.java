public class TransportationDepartment extends Department {

    private int vehicleNumber;

    public TransportationDepartment(String name, int empNum, String telephoneNumber, int vehicleNumber) {
        super(name, empNum, telephoneNumber);
        this.vehicleNumber = vehicleNumber;
    }

    public int getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
}
