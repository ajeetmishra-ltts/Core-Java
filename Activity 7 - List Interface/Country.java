import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Country {

	public static void main(String[] args) {
		
Scanner sc=new Scanner(System.in);
		
        ArrayList<String> al= new ArrayList<String>();
		System.out.println("Enter the Teams");
	    
        for(int i=0;i<4;i++)
		{
			al.add(sc.next());
		}
		System.out.println("Enter the postion to be swapped");
		int p=sc.nextInt();
		
		Collections.swap(al, 0 ,p);
		
		
		System.out.println(al);
	}

}




