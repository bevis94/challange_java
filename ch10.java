public class ch10 {
    public static void main(String[] args) {
        System.out.println(is_prime(97));
    }
    public static boolean is_prime(int n){
        for(int i = 2; i < (int)(n / 2); i++){
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
