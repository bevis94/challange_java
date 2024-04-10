import java.util.Scanner;

public class ch2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double n1 = scn.nextDouble();
        double n2 = scn.nextDouble();
        scn.close();
        if(n1 != 0 && n2 != 0){
            if(n1 > 0){
                if(n2 > 0){
                    System.out.println("第一象限");
                }
                else{
                    System.out.println("第四象限");
                }
            }
            else{
                if(n2 > 0){
                    System.out.println("第二象限");
                }
                else{
                    System.out.println("第三象限");
                }
            }
        }
        else{
            if(n2 == 0){
                System.out.println("x軸");
            }
            else{
                System.out.println("y軸");
            }
        }
    }
}
