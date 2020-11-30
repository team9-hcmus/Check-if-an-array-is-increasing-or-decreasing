def checkType(arr, n):  
  
    # If the first two and the last two elements  
    # of the array are in increasing order  
    if (arr[0] <= arr[1] and 
        arr[n - 2] <= arr[n - 1]) : 
        print("Mang dang tang dan");  
  
    # If the first two and the last two elements  
    # of the array are in decreasing order  
    elif (arr[0] >= arr[1] and 
          arr[n - 2] >= arr[n - 1]) : 
        print("Mang dang giam dan");  
  
    # If the first two elements of the array are in  
    # increasing order and the last two elements  
    # of the array are in decreasing order  
    elif (arr[0] <= arr[1] and 
          arr[n - 2] >= arr[n - 1]) :  
        print("Mang dang tang dan nhung sau do giam dan");  
  
    # If the first two elements of the array are in  
    # decreasing order and the last two elements  
    # of the array are in increasing order  
    else : 
        print("Mang dang giam dan nhung sau do tang dan");  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4 ];  
    n = len(arr);  
  
    checkType(arr, n);  
