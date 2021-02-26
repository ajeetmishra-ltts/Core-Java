public class FourWheeler extends Vehicle {

    private int numberOfDoors;
    private String audioSystem;

    public FourWheeler(String make, String vehicleNumber, int fuelType, int fuelCapacity, int cc, int numberOfDoors,
            String audioSystem) {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
        this.numberOfDoors = numberOfDoors;
        this.audioSystem = audioSystem;
    }

    public String getAudioSystem() {
        return audioSystem;
    }

    public void setAudioSystem(String audioSystem) {
        this.audioSystem = audioSystem;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetailinfo() {
        System.out.println("Vehicle Number : " + getVehicleNumber());
        System.out.println("Fuel Type : " + getFuelType());
        System.out.println(" Fuel Capacity : " + getFuelCapacity());
        System.out.println("Vehicle CC :" + getCc());
        System.out.println("Audio System:" + getAudioSystem());
        System.out.println("Number of Doors :" + getNumberOfDoors());

    }

}