import java.util.*;

public class InningsMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        Innings in = new Innings();
        System.out.println("Enter the team Name: ");
        in.setTeamname(sc.nextLine());
        System.out.println("Enter the Session: ");
        in.setInningsname(sc.nextLine());
        System.out.println("Enter runs: ");
        in.setRuns(sc.nextInt());

        in.displayInningsDetails();

    }

}
