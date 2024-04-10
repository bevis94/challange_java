public class ch3 {
    public static void main(String[] args) {
        int ans = 0;
        for(int i = 1; i < 50; i+=2){
            ans += Math.pow(i, 2);
            ans -= Math.pow(i + 1, 2);
        }
        System.out.println(ans);
    }
}
