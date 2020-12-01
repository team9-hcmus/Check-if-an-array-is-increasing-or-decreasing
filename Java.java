import java.math.*; 
  
class GFG 
{ 
    public static void checkType(int arr[], int n)  
    {  
        if (arr[0] <= arr[1] &&  
            arr[n - 2] <= arr[n - 1])  
            System.out.println("Mang dang tang dan");   
            
        else if (arr[0] >= arr[1] &&  
                 arr[n - 2] >= arr[n - 1])  
            System.out.println("Mang dang giam dan");  
      
        else if (arr[0] <= arr[1] && 
                 arr[n - 2] >= arr[n - 1])  
            System.out.println("Mang dang tang dan nhung sau do giam dan");  

        else
            System.out.println("Mang dang giam dan nhung sau do tang dan"); 
    } 
          
   // Driver Code
    public static void main(String[] args)  
    {  
        int[] arr = new int[]{ 1, 2, 3, 4 }; 
        int n = arr.length; 
        checkType(arr, n);  
    } 
} 
