package hashmap;

import java.util.Scanner;
import java.util.Set;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;

public class PlayerMain {

	public static void main(String[] args)throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 TreeMap<Integer,Player> map=new TreeMap<Integer,Player>();    
		 BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
		 System.out.println("Enter the number of players");
		 int n = Integer.parseInt(reader.readLine());
		 int c=1;
		 for(int i=0;i<n;i++)
		 {
			 System.out.println("Enter the details of the player "+c);
			 c++;
			 int capNumber = Integer.parseInt(reader.readLine());
			 System.out.println("Enter the name ");
			 String name = reader.readLine();
			 System.out.println("Enter the team ");
			 String Team = reader.readLine();
			 System.out.println("Enter the skill ");
			 String Skill = reader.readLine();
			 Player p=new Player();
			 p.setName(name);
			 p.setTeam(Team);
			 p.setSkill(Skill);
			 map.put(capNumber, p);
			 
		 }
		 System.out.println("Player Details");
		 Set<Map.Entry<Integer, Player>> entries = map.entrySet();
		 for(Map.Entry<Integer, Player> entry : entries){
	            System.out.println( entry.getKey() + "--" + entry.getValue() );
	        }
	}

}
