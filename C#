using System; 
class GFG 
{ 
      
    // Function to check the type of the array  
    public static void checkType(int []arr, int n)  
    {  
      
        // If the first two and the last two elements  
        // of the array are in increasing order  
        if (arr[0] <= arr[1] &&  
            arr[n - 2] <= arr[n - 1])  
            Console.Write("Mang dang tang dan");  
      
        // If the first two and the last two elements  
        // of the array are in decreasing order  
        else if (arr[0] >= arr[1] &&  
                 arr[n - 2] >= arr[n - 1])  
            Console.Write("Mang dang giam dan");  
      
        // If the first two elements of the array are in  
        // increasing order and the last two elements  
        // of the array are in decreasing order  
        else if (arr[0] <= arr[1] && 
                 arr[n - 2] >= arr[n - 1])  
            Console.Write("Mang dang tang dan nhung sau do giam dan");  
  
        // If the first two elements of the array are in  
        // decreasing order and the last two elements  
        // of the array are in increasing order  
        else
            Console.Write("Mang dang giam dan nhung sau do tang dan"); 
    } 
  
    // Driver code  
    static public void Main () 
    { 
        int[] arr = new int[]{ 1, 2, 3, 4 }; 
          
        int n = arr.Length; 
  
        checkType(arr, n);  
    } 
} 
