
public class DeluxeACRoom extends DeluxeRoom
{
	private int ratePerSqFeet;
	public DeluxeACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		ratePerSqFeet=12;
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}

	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
	
}
