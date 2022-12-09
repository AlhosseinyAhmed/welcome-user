import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println(" PLease enter your username");
         Scanner sc = new Scanner(System.in);
         String username = sc.next();
         sayWelome(username);
         sc.close();
    }
    private static void sayWelome(String username)
    {
        System.out.println(" Welcome "+username);
    }
}