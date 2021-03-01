import java.io.BufferedReader;
import java.io.InputStreamReader;

class InvalidException extends Exception {
    InvalidException(String s) {
        super(s);
    }
}

public class TeamName {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String array[] = { "Chennai Super Kings", "Sun Risers Hyderabad", "Delhi Capitals", "Kings XI Punjab",
                "Kolkata Knight Riders", "Mumbai Indians", "Rajasthan Royals", "Royal Challengers Bangalore" };

        System.out.println("Enter Winner of IPL: ");
        try {
            int count1 = 0, count2 = 0;
            String winner = reader.readLine();
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(winner)) {
                    count1++;
                }
            }
            if (count1 == 0) {
                throw new InvalidException("TeamNotFound");
            }
            System.out.println("Enter Runner of IPL: ");
            String runner = reader.readLine();
            for (int i = 0; i < array.length; i++) {
                if (array[i].equals(runner)) {
                    count2++;
                }
            }
            if (count2 == 0) {
                throw new InvalidException("TeamNotFound");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

}
