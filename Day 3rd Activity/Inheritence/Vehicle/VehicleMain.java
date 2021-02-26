import java.io.*;
import java.util.Scanner;

public class VehicleMain {

	public static void main(String[] args) throws  IOException {
				Scanner sc= new Scanner(System.in);
  System.out.println(" 1. Four Wheeler");
  System.out.println(" 2. Two Wheeler");
  System.out.println("Enter the vehicle Type: ");
  
  
  int VehicleType= sc. nextInt();
  
  if(VehicleType==1) {
	  System.out.println(" vehicle Make");
	  String Make= sc.next();
	  System.out.println("Vehicle Number :");
	  String VehicleNumber = sc.next();
	  System.out.println("Fuel Type : ");
	  System.out.println("1. Petrol");
	  System.out.println("2. Diesel");
	  int  FuelType=sc.nextInt();
	  
	 
		  System.out.println(" Fuel Capacity");
		  int FuelCapacity= sc.nextInt();
		  System.out.println("Engine CC");
		  int Cc= sc.nextInt();
		  System.out.println("Kick Start Available [yes/no]");
		  boolean k=sc.nextBoolean();
		  if(k== true){
		  System.out.println("Yes");
			  
		  }
		  else {
			  System.out.println("No");
			  
		  }
		  
	 
	  TwoWheeler f=  new TwoWheeler(Make,VehicleNumber,FuelType,FuelCapacity,Cc,k);
	  f.displayMake();
	  f.displayBasicInfo();
	  f.getKickStartAvailable();
	  
  }
  else if(VehicleType==2) {
	  System.out.println(" vehicle Make");
	  String Make= sc.next();
	  System.out.println("Vehicle Number :");
	  String VehicleNumber = sc.next();
	  System.out.println("Fuel Type : ");
	  System.out.println("1. Petrol");
	  System.out.println("2. Diesel");
	  int FuelType= sc.nextInt();
	   System.out.println(" Fuel Capacity");
		  int FuelCapacity= sc.nextInt();
		  System.out.println("Engine CC");
		  int Cc=sc.nextInt();
		 System.out.println("Audio System");
		 String AudioSystem=sc.next();
		 System.out.println("NUmber of Doors");
		 int NumberOfDoors= sc.nextInt();
		
		  
	  FourWheeler fw= new FourWheeler( Make, VehicleNumber, FuelType, FuelCapacity, Cc,NumberOfDoors,AudioSystem);
	  fw.displayMake();
	  fw.displayBasicInfo();
	  fw.getNumberOfDoors();
	  fw.getAudioSystem();
	  
  }
 
 
  
  sc.close();
  
	}
}
   

