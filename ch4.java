public class ch4 {
    public static void main(String[] args) {
        float ans = 0;
        for(int i = 1; i <= 10; i++){
            ans += 1.0f / (float)i;
        }
        System.out.println(ans);
    }
}
