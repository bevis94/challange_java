public class ch15 {
    public static void main(String[] args) {
        System.out.println(sum2(10));
    }
    public static int sum2(int n){
        if(n == 1){
            return 2;
        }
        else{
            return sum2(n - 1) + (n * 2);
        }
    }
}
