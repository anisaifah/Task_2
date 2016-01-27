public class MinimumArray{

  public int checkMinimum(int[] A, int[] B){
    // write your solution here
	int minim = 999, x, y = 0, n;
		for(int i=0; i<A.length; i++){
			x = A[i];
			for (int j=0; j<B.length; j++){
				y = B[j];
				if (x == y){
					n = y;
					if (n<minim){
						minim = n;
					}
				}
			}
		}
		if (minim ==999){
			return -1;
		}
		else{
			return minim;
		}
	}
    
		public static void main(String[] args){
		MinimumArray m = new MinimumArray();
    
			int[] A = { 1, 3, 2, 1 };
    int[] B = { 4, 2, 5, 3, 2 };
    
    int result = m.checkMinimum( A, B );
    System.out.println("Hasil dari fungsi minimum array adalah "+result);
  }
}
