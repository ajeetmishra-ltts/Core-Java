public class TwoWheeler extends Vehicle{
	private boolean kickStartAvailable;

	public boolean getKickStartAvailable() {
		return kickStartAvailable;
	}

	public void setKickStartAvailable(boolean kickStartAvailable) {
		this.kickStartAvailable = kickStartAvailable;
	}

	public TwoWheeler(String make, String vehicleNumber, int fuelType, int fuelCapacity, int cc,
			boolean kickStartAvailable) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		this.kickStartAvailable = kickStartAvailable;
	}
	

	public void  displayDetailInfo() { 
		System.out.println("Vehicle Number : "+getVehicleNumber());
	 System.out.println("Fuel Type : "+getFuelType() );
	 System.out.println(" Fuel Capacity : "+getFuelCapacity() );
	 System.out.println("Vehicle CC :" + getCc());
		System.out.println("displays the availability of kick start." + getKickStartAvailable() );
	}

}