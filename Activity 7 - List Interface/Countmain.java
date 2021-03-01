import java.util.*;
import java.util.Scanner;

public class Countmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count=0,counte=0;
		Scanner s=new Scanner(System.in);
		ArrayList<Integer> arr=new ArrayList<Integer>();
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{   int nn = s.nextInt();
			arr.add(nn);
		}
		
		 for(int i=0;i<n;i++)
		 { if(arr.get(i)>=50 && arr.get(i)<=99) 
			 count++; 
		 if(arr.get(i)>=100 && arr.get(i)<=199) 
			 counte++; 
		 }
		 System.out.println(count);
		 System.out.println(counte);
	
		
		

	}

}