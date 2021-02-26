
public class DeluxeRoom extends HotelRoom
{
	private int ratePerSqFeet;
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	
	public DeluxeRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		ratePerSqFeet=10;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
	}
	
	
}
