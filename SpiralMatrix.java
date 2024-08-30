package Practice;
/*
 1  2  3  4  5
16 17 18 19  6
15 24 25 20  7
14 23 22 21  8
13 12 11 10  9

* */

public class SpiralMatrix {
    public static void main(String[] args) {
        int matrix[][] = new int[5][5];
        int n = 5;
        int left = 0;
        int right = n - 1;
        int top = 0;
        int bottom = n - 1;
        int v = 1;
       while (v<=n*n){

        for (int i = left; i <=right; i++) {
            matrix[top][i] = v++;
        }
        top++;

        for (int i = top; i <=bottom; i++) {
            matrix[i][right] = v++;
        }
        right--;

        for (int i = right; i >=left; i--) {
            matrix[bottom][i] = v++;
        }
        bottom--;

        for (int i = bottom; i >= top; i--) {
            matrix[i][left] = v++;
        }
        left++;
    }
        System.out.println("---------------------");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.printf("%2d  ",matrix[i][j]);
            }
            System.out.println();
        }
    }
}
