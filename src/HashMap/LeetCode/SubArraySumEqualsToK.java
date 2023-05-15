package HashMap.LeetCode;
import java.util.* ;
public class SubArraySumEqualsToK {
    /*
        subArray is continues example [1 , 2, 3] -> {1},{2},{3},{1,2},{2,3},{1,2,3} sum equals to k
        Input : [1,2,3] , K=3
        Output : 2 ;
        Explaination : [3],[1,2]

     */
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int N = scn.nextInt();
        int K = scn.nextInt() ;
        int[] arr = new int[N] ;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int ans = subArraySum(arr ,K) ;
        System.out.println(ans);
    }
    public static int subArraySum(int[]arr ,int k) {
        int count = 0 ;
        //to find prefix sum :
        for (int i = 1; i < arr.length ; i++) {
             arr[i] = arr[i-1]+arr[i] ;
        }


        return count ;
    }
}
