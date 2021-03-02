import java.util.Comparator;

public class Compare implements Comparator <Player>
{

	public int compare(Player o1, Player o2)
	{
		if(o1.skill.compareTo(o2.skill) == 0 && o1.name.compareTo(o2.name) == 0)  
			return 0;  
			
			else if(o1.skill.compareTo(o2.skill) > 0 && o1.name.compareTo(o2.name) > 0)  
			return 1;  
			
			else  
			return -1; 
		
	}

}
