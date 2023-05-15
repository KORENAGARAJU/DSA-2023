package Sorting;
import java.util.* ;
public class MergeSortAlgo {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int N = scn.nextInt() ;
        int [] arr = new int[N] ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt() ;
        }
        int st = 0 ;
        int en = arr.length-1 ;
        divide(arr , st , en );
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void divide(int[] arr , int start , int end){
        if(start >= end) {
            return ;
        }
        int mid = start + (end - start)/2 ;
        divide(arr,start,mid);
        divide(arr,mid+1,end);
        conquer(arr,start,mid,end) ;
    }
    public static void conquer(int[] arr , int start , int mid , int end){
        int p1 = start ;
        int p2 = mid+1 ;
        int[] nums = new int[end-start+1] ;
        int iter = 0 ;
        while(p1<=mid && p2 <= end){
            if(arr[p1] < arr[p2]){
                nums[iter] = arr[p1] ;
                p1++ ;
                iter++ ;
            }
            else {
                nums[iter] = arr[p2] ;
                p2++ ;
                iter++ ;
            }
        }
        while(p1 <= mid){
            nums[iter] = arr[p1] ;
            p1++ ;
            iter++ ;
        }
        while(p2 <= end){
            nums[iter] = arr[p2] ;
            p2++ ;
            iter++ ;
        }
        for(int i= start ; i <= end ;i++){
            arr[i] = nums[i-start] ;
        }
    }
}
