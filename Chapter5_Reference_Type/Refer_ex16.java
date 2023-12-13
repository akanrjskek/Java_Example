package Chapter5_Reference_Type;

public class Refer_ex16 {
    public static void main(String[] args) {
        int[][] arr1 = new int[5][5];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr1[i][j] = i * arr1[i].length + j + 1;
            }
        }

        for (int[] arr2 : arr1) {
            for (int num : arr2) {
                System.out.printf("%3d", num);
            }
            System.out.println();
        }
    }
}
