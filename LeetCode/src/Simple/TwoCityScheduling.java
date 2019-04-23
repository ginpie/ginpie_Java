package Simple;

import java.util.Arrays;

public class TwoCityScheduling {
    public static int twoCitySchedCost(int[][] costs) {
        int res=0;
        int size = costs.length;
        int to_B = 0;
        for (int i = 0; i < size; i++) {
            if (costs[i][1] <= costs[i][0]) {
                to_B++;
            }
        }
        int[] da = new int[size-to_B];
        int[] db = new int[to_B];

        int a=0;
        int b=0;
        for (int i = 0; i < size; i++){
            int delta = Math.abs(costs[i][0] - costs[i][1]);
            if (costs[i][1]<=costs[i][0]){
                costs[i][0]=costs[i][1];
                db[b] = delta;
                b++;
            } else {
                da[a] = delta;
                a++;
            }
            res += costs[i][0];
        }
//        System.out.println(""+a + b);
//        System.out.println(Arrays.toString(da));
//        System.out.println(Arrays.toString(db));


        Arrays.sort(da);
        Arrays.sort(db);
        if (size/2 >= to_B){
            for (int i = 0; i < size/2 - to_B; i++){
                res += da[i];
            }
        } else {
            for (int i = 0; i < to_B - size/2; i++){
                res += db[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        System.out.println(twoCitySchedCost(new int[][] {{10,10},{30,200},{400,50},{30,20}}));
        System.out.println(twoCitySchedCost(new int[][] {{259,770},{448,54},{926,667},{184,139},{840,118},{577,469}}));
    }
}
