import java.util.Scanner;

public class ch6 {
    public static void main(String[] args) {
        String day[]={"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt() - 1;
        scn.close();
        System.out.println(day[n]);
    }
}
