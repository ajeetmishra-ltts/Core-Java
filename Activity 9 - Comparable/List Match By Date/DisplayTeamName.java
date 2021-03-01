import java.util.*;
public class DisplayTeamName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Match3> ls=new ArrayList<Match3>();
		System.out.println("Enter the number of matches ");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
		System.out.println("Enter  match date in (MM-dd-yyyy");
		String d1=sc.next();
		System.out.println("Enter Team 1 ");
		String n1=sc.next();
		System.out.println("Enter Team 2 ");
		String n2=sc.next();
		ls.add(new Match3(d1,n1,n2));
		}
		Collections.sort(ls);
		for(Match3 ele:ls)
		{
			System.out.println(ele);
		}
	}

}