public class ch8 {
    public static void main(String[] args) {
        int[][] num = {{37, 16, 43}, {12, 18, 94}};
        int max = 0;
        int[] ans = {0, 0};
        for(int i = 0; i < num.length; i++){
            for(int j = 0; j < num[i].length; j++){
                if(num[i][j] > max){
                    max = num[i][j];
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        System.out.println("row:" + ans[0] + ", col:" + ans[1]);
    }
}
