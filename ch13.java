public class ch13 {
    public static void main(String[] args) {
        int n = 0;
        int num = 2;
        boolean prime_tf ;
        while (n < 8) {
            prime_tf = true;
            for(int i = 2; i < (int)((Math.pow(2, num)) / 2); i++){
                if((int)(Math.pow(2, num) - 1) % i == 0){
                    prime_tf = false;
                    break;
                }
            }
            if (prime_tf) {
                System.out.println((int)(Math.pow(2, num) - 1));
                n += 1;
            }
            num += 1;
        }
    }
}
