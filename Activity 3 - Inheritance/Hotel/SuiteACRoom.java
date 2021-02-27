
public class SuiteACRoom extends HotelRoom 
{
	private int ratePerSqFeet;
	public int getRatePerSqFeet() {
		return ratePerSqFeet;
	}
	public void setRatePerSqFeet(int ratePerSqFeet) {
		this.ratePerSqFeet = ratePerSqFeet;
	}
	public SuiteACRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super(hotelName, numberOfSqFeet, hasTV, hasWifi);
		// TODO Auto-generated constructor stub
		ratePerSqFeet=15;
		if(hasWifi==true)
		{
			ratePerSqFeet();
		}
		int sum=calculateTariff();
		System.out.println("Room tariff per day is: "+sum);
	}
	public int ratePerSqFeet()
	{
		ratePerSqFeet=ratePerSqFeet+2;
		return ratePerSqFeet;
	}
	public int calculateTariff()
	{
		return numberOfSqFeet*ratePerSqFeet;
		
	}
	
}
