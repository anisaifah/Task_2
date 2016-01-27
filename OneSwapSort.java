// 1103130239, 1103132235, 1103134467, IF-38-01

import java.util.Arrays;
public class OneSwapSort{
  
  public int checkSort( int[] A ){
	// write your solution here
	return 0;
  }  
  
  public int checkSwap(int[] A){
	int a = A[0];
	int b = 0;
	
	for(int i = 0 ; i < A.length ; i++){
		if(a > A[i]){
			b++;
		}
		a = A[i];
	}
	if(b > 1){
		return 0;
	}
	else {
		return 1;
	}
  }
  
	public static void main(String[] args){
		OneSwapSort sort = new OneSwapSort();
		OneSwapSort swap = new OneSwapSort();
		int[] A = {1, 5, 3, 3, 7} ;
    
		Arrays.sort(A);
		System.out.println("sort : ");
		for(int i: A){
			
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println();
		int result = swap.checkSwap(A);
		System.out.println("swap : ");
		System.out.println(result + " ");
    }
}
