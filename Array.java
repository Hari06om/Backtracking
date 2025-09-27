import java.util.*;
public class Array{

        public static void changeArray(int arr[], int i , int va){

            if(i==arr.length){
                printarray(arr);
                return;
            }

            arr[i] = va;
            changeArray(arr,i+1,va+1);
            arr[i] = arr[i]-2;

            
            }

    public static void printarray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }


    public static void main(String args[]){
        int arr[] = new int[5];
        changeArray(arr,0,1);
        printarray(arr);
    }
}