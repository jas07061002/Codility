package prac;

public class NumOfPairs {

    public static void main(String[] args) {

        int[] arr = {1,3,5,6,7};
        int sum =10;

        System.out.println(numOfPairs(arr,sum));

    }

    public static int numOfPairs(int[] arr,int sum){

        int count =0;

        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(j!=i && arr[i]+arr[j]<sum){
                    count++;

                }
            }
        }
        return count;
    }
}
