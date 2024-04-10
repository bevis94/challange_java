public class ch11 {
    public static void main(String[] args) {
        System.out.println(total(10000, 0.1, 2));
    }
    public static double total(double p, double r, int n){
        if(n == 0){
            return p;
        }
        else{
            return total(p, r, n - 1) * (1 + r);
        }
    }
}
