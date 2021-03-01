import java.io.BufferedReader;
import java.io.InputStreamReader;
class InvalidException extends Exception{  
	 InvalidException(String s){  
	  super(s);  
	 }  
	}  
public class TeamName {
	public static void main(String[] args) {
		BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		String array[] = {"Chennai Super Kings",
				"Sun Risers Hyderabad",
				"Delhi Capitals",
				"Kings XI Punjab",
				"Kolkata Knight Riders",
				"Mumbai Indians",
				"Rajasthan Royals",
				"Royal Challengers Bangalore"};
		
		String res1 = null;
		String res2 = null;
		
		System.out.println("Enter Winner of IPL: ");
		try
		{   int count1=0,count2=0;
			String winner = reader.readLine();
			for(int i=0;i<array.length;i++)
			{
				if(array[i].equals(winner))
				{
					res1="Expected IPL Season 13 winner:"+array[i];
					count1++;
				}
			}
			if(count1==0)
			{
				throw new InvalidException("TeamNotFound");
			}
			System.out.println("Enter Runner of IPL: ");
			String runner = reader.readLine();
			for(int i=0;i<array.length;i++)
			{
				if(array[i].equals(runner))
				{
					res2="Expected IPL Season 13 runner:"+array[i];
					count2++;
				}
			}
			if(count2==0)
			{
				throw new InvalidException("TeamNotFound");
			}
			else
			{
				System.out.println(res1);
				System.out.println(res2);
			}
		}
		catch(Exception e)
		{
			System.out.println(e+": Entered team is not a part of IPL Season 13");
		}
	}
}
