package britishtime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the time in hh:mm format: ");
        String input = in.nextLine();
        String spoken = BritishSpokenTime.toBritishTime(input);
        System.out.println(spoken);
    }
}