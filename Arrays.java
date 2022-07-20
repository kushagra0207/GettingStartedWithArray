/** Getting Started with Java Arrays
Date - 15 July 2022 by- Kushagra Gupta

Arrays are Linear type data structures allocate memory in a continuous space.(Homogeneous)
Arrays store same datatype elements.
Arrays are used to store collections of data
In Java Arrays are objects.
We can find length of array by - array_name.length;

*/

/*
 Printing the array by user
 and initializing the array

 */

 //leetcode problem to reverse the number in an array and modified the array.
 // for e.g. 639 to 936 and so on...


import java.util.*;
public class Arrays{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);// creating object of scanner class
        System.out.println("Enter The Size of array");
        int N = sc.nextInt();// creating the integer type variable and initializing
        System.out.println("Enter the arrays elements :");
        int[] arr = new int[N];//Initializing the array and creating
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();

            
        }
        for (int i = 0; i < arr.length; i++) {
            int result=0;
            int remainder =0;


            while(arr[i]!=0){
                remainder = arr[i]%10;
                result = result*10 + remainder;
                arr[i]=arr[i]/10;
            }
            System.out.println("Your result is at position:" + (i+1) + " " + result );
            
        }
        sc.close(); 
        
        

        
    }
}
