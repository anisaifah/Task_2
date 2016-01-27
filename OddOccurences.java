// 1103130239, 1103132235, 1103134467 IF-38-01
public class OddOccurences{

	public int checkOddOccurences( int[] A ){
    // write your solution here
		int a;
		int b;
		b =0;
	
		for (int i=0; i<A.length; i++){
			a = A[i];
			for (int j= i+1; j<A.length; j++){
				if(a==A[j]){
				A[j]=0;
				}
				else{
				b=A[i];
				}
			}
			a=0;
		}
		return b; 
	}
		public static void main(String[] args){
		OddOccurences odd = new OddOccurences();
    
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		int result = odd.checkOddOccurences( A );
		System.out.println("Hasilnya adalah :  "+result);
	}
}

