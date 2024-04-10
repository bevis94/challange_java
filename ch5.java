import java.util.Scanner;

public class ch5 {
    public static void main(String[] args) {
        System.out.print("num=");
        Scanner scn = new Scanner(System.in);
        long num = scn.nextLong();
        scn.close();
        int[] ans = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        for(int i = 12;i > 0; i--){
            switch ((int)(num % 10)) {
                case 0:
                    ans[0] += 1;
                    break;
                case 1:
                    ans[1] += 1;
                    break;
                case 2:
                    ans[2] += 1;
                    break;
                case 3:
                    ans[3] += 1;
                    break;
                case 4:
                    ans[4] += 1;
                    break;
                case 5:
                    ans[5] += 1;
                    break;
                case 6:
                    ans[6] += 1;
                    break;
                case 7:
                    ans[7] += 1;
                    break;
                case 8:
                    ans[8] += 1;
                    break;
                case 9:
                    ans[9] += 1;
                    break;
            
                default:
                    break;
            }
            num /= 10;
        }
        for(int i = 0; i < 10; i++){
            System.out.println(i + "出現" + ans[i] + "次");
        }
    }
}
