package Chapter5_Reference_Type;

public class Refer_ex17 {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1,2},
                {3,4}
        };

        int[][] arr2 = {
                {4,3},
                {2,1}
        };

        int[][] arr3 = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; ++i){
            for(int j = 0; j < arr2[0].length; ++j){
                for(int k = 0; k < arr1[0].length; ++k){
                    arr3[i][j] += arr1[i][k] * arr2[k][j];
                }
            }
        }

        for (int[] temparr : arr3){
            for(int temp : temparr){
                System.out.printf("%3d",temp);
            }
            System.out.println();
        }

    }
}
