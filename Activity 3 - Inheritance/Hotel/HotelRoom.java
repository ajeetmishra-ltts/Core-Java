
public class HotelRoom 
{
	private String hotelName;
	protected int numberOfSqFeet;
	private Boolean hasTV;
	private Boolean hasWifi;
	public HotelRoom(String hotelName, int numberOfSqFeet, Boolean hasTV, Boolean hasWifi) {
		super();
		this.hotelName = hotelName;
		this.numberOfSqFeet = numberOfSqFeet;
		this.hasTV = hasTV;
		this.hasWifi = hasWifi;
	}
	public int calculateTariff()
	{
		return 0;
	}
	
}
