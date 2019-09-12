import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner key = new Scanner(System.in);

        String[] presidents = new String[]{"Johnson","Nixon","Ford","Carter","Reagan","Bush","Clinton","Bush","Obama","Trump"};
        String response = "";
        while(true) {
            System.out.println("Please type \'history\' to see the last 10 presidents with the most recent first: ");
            response = key.nextLine();
            if (response.equalsIgnoreCase("history") | response.equalsIgnoreCase("\'history\'")) {
                for (int i = 9; i >= 0; i--) {
                    System.out.println(presidents[i]);
                }
                break;
            } else {
                System.out.println("Invalid response.  Please try again.");
            }
        }
    }
}
