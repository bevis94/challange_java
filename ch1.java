import java.util.Scanner;

public class ch1 {
    public static void main(String[] args) {
        System.out.print("購買價格:");
        Scanner scn1 = new Scanner(System.in);
        int n = scn1.nextInt();
        scn1.close();
        System.out.print("付款:");
        Scanner scn2 = new Scanner(System.in);
        n = scn2.nextInt() - n;
        scn2.close();
        System.out.println("$500= " + (int)(n / 500));
        n = n % 500;
        System.out.println("$100= " + (int)(n / 100));
        n = n % 100;
        System.out.println("$50= " + (int)(n / 50));
        n = n % 50;
        System.out.println("$10= " + (int)(n / 10));
        n = n % 10;
        System.out.println("$5= " + (int)(n / 5));
        n = n % 5;
        System.out.println("$1= " + n);
    }
}
