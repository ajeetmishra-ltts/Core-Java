import java.util.*;
public class RoomMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Hotel Tariff Calculator");
		System.out.println("1. Deluxe Room\r\n"+ "2. Deluxe AC Room\r\n"+ "3. Suite AC Room\r\n"+ "");
		System.out.println("Select Room Type:");
		int rt=sc.nextInt();
		System.out.println("Hotel name:");
		String hn=sc.next();
		System.out.println("Room Square Feet Area:");
		int rsfa=sc.nextInt();
		System.out.println("Room has TV (yes/no):");
		boolean htv=sc.nextBoolean();
		System.out.println("Room has WIFI (yes/no):");
		boolean hwf=sc.nextBoolean();
		if(rt==1)
		{
			DeluxeRoom dr=new DeluxeRoom(hn,rsfa,htv,hwf);
		}
		else if(rt==2)
		{
			DeluxeACRoom dacr=new DeluxeACRoom(hn,rsfa,htv,hwf);
		}
		else if(rt==3)
		{
			SuiteACRoom sacr=new SuiteACRoom(hn,rsfa,htv,hwf);
		}
	}

}
