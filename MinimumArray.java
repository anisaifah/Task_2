public class MinimumArray{

  public int checkMinimum(int[] A, int[] B){
    // write your solution here
    int minim = 999, x, y = 0, bdg;
		for(int i=0; i<A.length; i++){
			x = A[i];
			for (int j=0; j<B.length; j++){
				y = B[j];
				if (x = y){
					bdg = y;
					if (bdg<minim){
						minim = bdg;
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
    MimimumArray m = new MinimumArray();
    
    int[] A = { 1, 3, 2, 1 };
    int[] B = { 4, 2, 5, 3, 2 };
    
    int result = m.checkMinimum( A, B );
    
  }
}
