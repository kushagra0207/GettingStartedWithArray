/*
 * Insertion Operation in arrays :
 * By- Kushagra Gupta 
 * Date - 15 July 2022
 * 
 * Documentation - Arrays in java are of two types
 * 
 * 1) Fixed Size Arrays - int arr[]= new int[N];
 * 2) Dynamic Size Arrays-  ArrayList<Integer> arr = new ArrayList<Integer>();
 * 
 * 
 * In fixed size array we can not insert an element till the array have some vacaent space.
 * For this we consider that it have 1 or 2 space for perticular position of element.
 * Whereas in dynamic size array they have no size , how much you want you can use this array,
 * but its size is increased in double manner.
 * 
 * also its compulsory to give the size of array in fixed size array and for dynamic you can 
 * be choice.
 * 
 * e.g In dynamic size array , consider if we have n size array and if we want to insert
 * n+1 element than its size become double.
 */

import java.util.*;

public class InsertOperation {

    static int insert(int number,int arr[], int position){
        for (int i = arr.length-2; i>=position-1; i--) {
            arr[i+1]=arr[i];

            
        }
        arr[position-1]=number;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            
        }
        return 1;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Size Of Array, Be sure to take an extra space");
        int N = sc.nextInt();
        int arr[] = new int[N];
        System.out.println("Enter The Elements You Want To Insert :");
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]= sc.nextInt();
            
        }
        System.out.println("Enter The Element You Want To Insert :");
        int number = sc.nextInt();
        System.out.println("Enter The Position where you want to insert");
        int position = sc.nextInt();
        System.out.println("Your Array Initially :");
        //System.out.println(Arrays.toString(arr));
        insert(number, arr, position);
        System.out.println("Your Updated array :");
        //System.out.println(Arrays.toString(arr));
        sc.close();

        
    }
    
}
