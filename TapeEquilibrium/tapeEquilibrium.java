/**
 * 
 * @author Paul Salmon
 * Codility TapeEquilibrium
 * Score: 75/100
 * Missing some corner cases:
 * 	 small_random elements, small elements, medium_random elements from -1000 to 50.
 *
 */


public class tapeEquilibrium {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = {1, 3, 5, 7};
		System.out.println(solution(input));
	}
	
	 public static int solution(int[] A) {
		 
	        int minVal = 0;
	        int arrayLength = A.length;
	        
	        if (arrayLength == 2){ return Math.abs(A[1]-A[0]); }
	        
	        for (int split = 1; split < arrayLength-1; split++){
	            A[split] = Math.abs(A[split]+ A[split-1]);
	        }
	            
	        int total = Math.abs(A[arrayLength-2] + A[arrayLength-1]);
	        minVal = total;
	        
	        for (int split = 0; split < arrayLength-1; split++){
	        	int rSum = Math.abs(A[split]-total);
	            if(Math.abs(A[split]-rSum) < minVal) { minVal = Math.abs(A[split]-rSum); }
	        }
	               
	        return minVal;

	 }
}
