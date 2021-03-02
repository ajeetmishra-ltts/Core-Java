import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
public class TeamMain {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name;
		long numberOfMatches;
		ArrayList<Team> al=new ArrayList<Team>();
		System.out.println("Enter number of teams:");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter team" +" " + (i+1) +" " + "detail");
			System.out.println("Enter Name");
			name= sc.next();
			System.out.println("Enter number of matches");
			numberOfMatches=sc.nextLong();
			al.add(new Team(name, numberOfMatches));
			
		}
		Collections.sort(al,new TeamComparator());
		System.out.println("Team list after sort by number of matches \n" ); 
		for(Object s:al)
		{
			System.out.println(s);
		}
		
		
}
}



