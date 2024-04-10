public class ch14 {
    public static void main(String[] args) {
        int[] a = {0, 0, 0, 0, 0, 0};
        int[] b = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] ans = combine(a, b);
        for(int i : ans){
            System.out.print(i + " ");
        }
    }
    public static int[] combine(int a[], int b[]) {
        int[] ans = new int[a.length + b.length];
        for(int i = 0; i < a.length; i++){
            ans[i] = a[i];
        }
        for(int i = 0; i < b.length; i++){
            ans[a.length + i] = b[i];
        }
        return ans;
    }
}
