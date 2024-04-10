public class ch12 {
    public static void main(String[] args) {
        System.out.println(prime(100));
    }
    public static int prime(int n){
        int[] m = new int[100];
        m[0] = 2;
        int k = 0;
        int num = 3;
        boolean prime_tf ;
        while(n > 1){
            prime_tf = true;
            for(int i = 0; i < k + 1; i++){
                if (num % m[i] == 0) {
                    prime_tf = false;
                    break;
                }
            }
            if(prime_tf){
                k += 1;
                m[k] = num;
                n -= 1;
            }
            num += 1;
        }
        return num - 1;
    }
}
