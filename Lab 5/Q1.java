public class Q1{
    public static void main(String[] args){    
        int a[] = {4,3,5,1,1,0,0,2,3};
        int R = 6;
        int N = a.length;
        int count[] = new int[R+1];
        int [] aux = new int[N];

       // Compute frequency counts.
         for (int i = 0; i < N; i++){
            count[a[i] + 1]++;
         }
         
           // Transform counts to indices.
         for (int r = 0; r < R; r++){
            count[r+1] += count[r];
         }
         
         // Distribute the records.
         for (int i = 0; i < N; i++){
            aux[count[a[i]]++] = a[i];
         }
    
         // Copy back.
         for (int i = 0; i < N; i++){
             a[i] = aux[i];
         }
         for (int i = 0; i<N; i++){
            System.out.print(" "+a[i]);
         }
         System.out.println(" ");
    }
}
        
