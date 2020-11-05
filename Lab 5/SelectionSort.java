public class SelectionSort {  
    public static void Sort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int smallest = i;  
            for (int j = i + 1; j < arr.length; j++){  
                if (arr[j] < arr[smallest]){  
                    smallest = j;  
                }  
            }  
            int smallerNumber = arr[smallest];   
            arr[smallest] = arr[i];  
            arr[i] = smallerNumber;  

        }  
    }
}    