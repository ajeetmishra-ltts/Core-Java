import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
public class Playername {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("No of Players: ");
		int n = sc.nextInt();
		
		System.out.println("Enter a string: ");
		String[] str = new String[10];    
		Scanner sc1 = new Scanner(System.in);
		for (int i = 0; i < n; i++)   
		{  
		str[i] = sc1.nextLine();
		
		}  
		
		 Set<String> hs = new HashSet<String>(); 
		  for (int i = 0; i < n; i++)
		  {
		  hs.add(str[i]);
		  }
		 
        System.out.println("Initial Set: " + hs);

		
		  Set<String> sorted = new TreeSet<String>(hs);
		  System.out.println("Sorted Set: " + sorted);
		 
	sc.close();
	
	}
	

}