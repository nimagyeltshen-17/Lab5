public class Q3{
    
    public static void search(int a[], int target){
        for(int i = 0; i < a.length; i++){
            if(target == a[i]){
                System.out.println("Target " + target + " is found at index "+i );
            }
            else{
                System.out.println("The Target " + target +" is not found " +  " at index " + i);
            }
        }
    }
        // Driver code
        public static void main(String[] args) {
        int a[] = {17,14,13,16,18,19,7};
        int target = 13;
        // Function call
        search(a,target);
    }
}
