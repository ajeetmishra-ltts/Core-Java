import java.util.*;

public class ArrayExpec {
 
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		try {
			
			System.out.println("Enter the no of overs: ");
	        int nover=sc.nextInt();
	        
	        System.out.println("Enter the no of runs in each over: ");
	        int arr []=new int[nover+1];
	        
	        for(int i=1;i<=nover;i++)
	        {
	            arr[i]=sc.nextInt();
	        }
	        System.out.println("Enter over number: ");
	        int overn=sc.nextInt();
	        System.out.println("Runs scored in the over: "+arr[overn]);

			
		}
		catch(Exception e) {
			
			System.out.println(e);
			
		}
	}
	
}