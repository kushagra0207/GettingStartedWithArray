/*
 * Created By - Kushagra Gupta
 * Date- 15 July 2022
 * 
 * Linear Search , search element in an sequential way and hence provide O(n) time coplexity.
 * 
 * 
 * 
 */
import java.util.*;
public class LinearSearch{

    static int linearSearch(int arr[],int X){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==X){
                return i;
                
            }
        }
        return -1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of The Array :");
        int N = sc.nextInt();
        int[] arr = new int[N];
        System.out.println("Enter The Element want to search in array");
        int X = sc.nextInt();
        System.out.println("Enter the elements in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        int b = linearSearch(arr, X);
        if(b==-1){
            System.out.println("Sorry , Element is not present in this array.");
            
        }
        else{
            System.out.println("Element is present at position  " + (b+1));
        }
        sc.close();

        
    }
}
