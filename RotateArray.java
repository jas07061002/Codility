package prac;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {

        int arr[] = {1, 3, 4, 5};
        int k = 1;
        System.out.println(Arrays.toString(solution(arr, k)));

    }

    public static int[] solution(int[] A, int K) {

        for (int i = 0; i < K; i++) {
            for (int j = A.length-1; j > 0; j--) {
                int temp = A[j];
                A[j] = A[j - 1];
                A[j - 1] = temp;
            }
        }

        return A;
    }
}
