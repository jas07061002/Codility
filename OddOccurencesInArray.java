package prac;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class OddOccurencesInArray {

    public static void main(String[] args) {

        int arr[] = {3,5,8,4,3,8,5};

        System.out.println(solution2(arr));


    }

    public static int solution2(int[] A) {

        HashSet<Integer> dups = new HashSet<Integer>();
        int elem = -1;

        for (int i = 0; i < A.length; i++) {
            if (dups.add(A[i])) {
                elem = A[i];
            }
        }
        return elem;
    }

/*    public static int solution(int[] A){

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<A.length;i++){
            if(map.containsKey(A[i])){
                map.put(A[i],map.get(A[i])+1);
            }
            else{
                map.put(A[i],1);
            }

        }

        for(int i=0;i<A.length;i++) {
            if (map.get(A[i]) == 1) {

                return A[i];

            }
        }

        return -1;
    }*/
}
