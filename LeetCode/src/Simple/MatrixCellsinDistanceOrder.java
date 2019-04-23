package Simple;

import java.util.Arrays;

public class MatrixCellsinDistanceOrder {
    public static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int size = R*C;
        int[][] res = new int[size][2];
        res[0][0] = r0;
        res[0][1] = c0;
        int p = 1;
        int i = 1;
        while (p<size){
            for (int j=0; j<=i; j++){
                int k = i-j;
                if (r0 + j < R && c0 + k < C){
                    res[p][0] = r0 + j;
                    res[p][1] = c0 + k;
                    p++;
                    if(p>=size)
                        break;
                }
                if (r0+j<R && c0-k>=0 && k!=0){
                    res[p][0] = r0 + j;
                    res[p][1] = c0 - k;
                    p++;
                    if(p>=size)
                        break;
                }
                if (r0 - j>=0 && c0 + k<C && j!=0){
                    res[p][0] = r0 - j;
                    res[p][1] = c0 + k;
                    p++;
                    if(p>=size)
                        break;
                }
                if (r0-j>=0 && c0-k>=0 && k!=0 && j!=0){
                    res[p][0] = r0 - j;
                    res[p][1] = c0 - k;
                    p++;
                    if(p>=size)
                        break;
                }
            }
            i++;
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] a = allCellsDistOrder(2,2,0,1);
        for (int i = 0; i < a.length;i++){
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
