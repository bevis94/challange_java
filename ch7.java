public class ch7 {
    public static void main(String[] args) {
        int[][] num = {{68, 77, 43}, {45, 63, 55}, {56, 65, 97}, {85, 45, 78}, {76, 23, 61}};
        String[] name = {"水果 A", "水果 B", "水果 C", "水果 D", "水果 E"};
        System.out.println("       " + name[0] + " " + name[1] + " " + name[2] + " " + name[3] + " " + name[4] + " ");
        System.out.print("1(早上)  ");
        int[] sum_time = {0, 0, 0};
        int[] sum_day = {0, 0, 0, 0, 0};
        int max_time = 0;
        int max_day = 0;
        for(int i = 0; i < 5; i++){
            sum_time[0] += num[i][0];
            sum_day[i] += num[i][0];
            System.out.print(num[i][0] + "     ");
        }
        System.out.print("\n2(中午)  ");
        for(int i = 0; i < 5; i++){
            sum_time[1] += num[i][1];
            sum_day[i] += num[i][1];
            System.out.print(num[i][1] + "     ");
        }
        System.out.print("\n3(下午)  ");
        for(int i = 0; i < 5; i++){
            sum_time[2] += num[i][2];
            sum_day[i] += num[i][2];
            System.out.print(num[i][2] + "     ");
        }
        System.out.println();
        int n1 = 0;
        for(int i = 0; i < 3; i++){
            System.out.print(sum_time[i] + " ");
            if(sum_time[i] > max_time){
                max_time = sum_time[i];
                n1 = i;
            }
        }
        System.out.println();
        int n2 = 0;
        for(int i = 0; i < 5; i++){
            System.out.print(sum_day[i] + " ");
            if(sum_day[i] > max_day){
                max_day = sum_day[i];
                n2 = i;
            }
        }
        System.out.println("\n" + n1);
        System.out.println(name[n2]);
    }
}
