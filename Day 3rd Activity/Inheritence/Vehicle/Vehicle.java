public class Vehicle {
    private String make;// -of string
    private String vehicleNumber;// – of type String
    private int fuelType;// – of type String
    private int fuelCapacity;// - of type Integer
    private int cc;// – of type Integer

    public Vehicle(String make, String vehicleNumber, int fuelType, int fuelCapacity, int cc) {
        super();
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public int getFuelType() {
        return fuelType;
    }

    public void setFuelType(int fuelType) {
        this.fuelType = fuelType;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void displayMake() {
        System.out.println("Display the make of the vehicle" + make);
    }

    public void displayBasicInfo() {
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Fuel Type : " + fuelType);
        System.out.println(" Fuel Capacity : " + fuelCapacity);
        System.out.println("Vehicle CC :" + cc);
    }

    public void displayDetailInfo() {

    }

}
