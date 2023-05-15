package Sorting;
import java.util.* ;
public class QuickSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in) ;
        int N = scn.nextInt() ;
        int [] arr = new int[N] ;
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        QuickSortAlgo(arr,0,arr.length-1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ") ;
        }

    }
    public static void QuickSortAlgo(int[] arr , int low , int high){

        //base condition
        if(low >= high){
            return ;
        }
        //parition or work done
        int parition = parition(arr,low,high) ;
        //faith
        QuickSortAlgo(arr, low , parition-1);
        QuickSortAlgo(arr,parition+1,high);
    }
    public static int parition(int[] arr , int low , int high){
        int pivot = arr[high] ;
        int i = low-1 ;
        for(int j = low ;  j <= high-1 ; j++){
            if(arr[j] < pivot){
                i++ ;
                Swap(arr,i,j);
            }
        }
        Swap(arr,i+1,high);
        return i+1 ;
    }
    public static void Swap(int[]arr , int i , int j){
        int temp = arr[i] ;
        arr[i] = arr[j] ;
        arr[j] = temp ;
    }
}
