import java.util.*;

public class BinarySearch {

    static int numberK(int arr[], int N, int X){
        
        int low=0;
        int high=N-1;
        while(low<=high){
             int mid=(low+high)/2;
            if(arr[mid]==X){
                return mid;
            }
            else if(arr[mid]>X){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return -1;
    }

    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size Of the Array :");
        int N = sc.nextInt();
        int arr[]= new int[N];
        System.out.println("Enter the elements present in the array");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }
        System.out.println("Enter The Element You Want to Search In array:");
        int X= sc.nextInt();
    
        sc.close();
        int ce=numberK(arr, N, X);
        if(ce!=-1){
            System.out.println("Your element position is  : " + (ce+1));
        }
        else{
            System.out.println("Bash: Resut Not Found:");
        }


    }
    
}
