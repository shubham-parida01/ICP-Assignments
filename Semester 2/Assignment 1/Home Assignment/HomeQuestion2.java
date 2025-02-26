import java.util.ArrayList;
import java.util.Scanner;

public class HomeQuestion2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lines = new ArrayList<>();

        System.out.println("Enter lines (empty line to stop):");
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            if (line.isEmpty()) break;
            lines.add(line);
        }
        sc.close();

        System.out.println("\nReversed order of lines:");
        for (int i = lines.size() - 1; i >= 0; i--) {
            System.out.println(lines.get(i));
        }
    }
}
