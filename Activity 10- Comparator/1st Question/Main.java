import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList<Player> al=new ArrayList<Player>();
		
	System.out.println("Please provide the number of players to be registered");
	int n=sc.nextInt();
	for(int i=0;i<n;i++)
	{
		System.out.println("Enter the name of the player ");
		String name=sc.next();
		System.out.println("Enter the skill of the player ");
		System.out.println("1.BATTING");
		System.out.println("2.BOWLING");
		System.out.println("3.ALLROUNDER");
		String skill=sc.next();
		if(skill.equals("1"))
		{
			skill="Batting";
		}
		else if(skill.equals("2"))
		{
			skill="Bowling";
		}
		else if(skill.equals("3"))
		{
			skill="Allrounder";
		}
		
		
		al.add(new Player(name,skill));
	}
	Collections.sort(al,new Compare());  
	for(Player s:al)
	{
		System.out.println(s);
	}
	}
}

