import java.io.*;
public class RunRate {
	
	public static void main(String args[])
	{
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		int total_runs,total_overs;
		
		try
		{
			System.out.println("Enter total runs: ");
			total_runs = Integer.parseInt(reader.readLine());
			System.out.println("Enter total Overs faced: ");
			total_overs = Integer.parseInt(reader.readLine());
			float result = total_runs/total_overs;
			System.out.println("The Current Run Rate is: "+result);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
