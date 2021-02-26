import java.util.*;
public class CompanyMain {

	public static void main(String[] args) {
		
		Company e = new Company();
		
		Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the company name: ");
        String s1 = sc.next();
        System.out.println("Enter the employees: ");
        String s2 = sc.next();
        System.out.println("Enter TeamLead: ");
        String s3 = sc.next();
        
        String res1 = null;
        
        e.setName(s1);
        e.setEmployees(s2);
        e.setLead(s3);
        
        String[] res = s2.split(",");
      
        for(int i=0; i<5;i++)
        {
        	
        	if(res[i].equalsIgnoreCase(s3))
        	{
        		res1="team lead: "+res[i];
        		 
        	}
        
	}
        if(res1==null) {
        	 System.out.println("Name: "+s1);
             System.out.println("Emploees: "+s2);
        	System.out.println("Invalid");
        	System.exit(0);
        }
        System.out.println("Name: "+s1);
        System.out.println("Emploees: "+s2);
        System.out.println(res1);
        
        sc.close();
	}

}
