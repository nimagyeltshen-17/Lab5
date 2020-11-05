public class Q2{
	public static void sort(String[] a, int W){
		//Sort a[] on leading W charchters
		int N = a.length;
		int R = 255;
		String[] aux = new String[N];
		for(int d = W-1; d >= 0; d--){
			//Sort by key-indexed counting on dth char
			int [] count = new int [R + 1];
			//Compute frequency counts
			for(int i = 0; i < N; i++){
				count[a[i].charAt(d) + 1]++;
			}
			//Tranform counts to indices
			for(int r = 0; r < R; r++){
				count[r + 1] += count[r];
			}
			//Distribute the data
			for(int i = 0; i < N; i++){
				aux[count[a[i].charAt(d)]++] = a[i];
			}
			//copy the data
			for(int i = 0; i < N; i++){
				a[i] = aux[i];
			}
		}
		for(int i = 0; i < N; i++){
			System.out.println(a[i] + " ");
		}
	}
	public static void main(String[] args) {
		String a[] = {"Kinley","Kentsho","Karma","Kevin","Kuenden"};
		int W = 5;
		sort(a, W);
	}
}