/**
 * 
 * @author Paul Salmon
 * Codility TapeEquilibrium
 * Score: 75/100
 * Missing some corner cases:
 * 	 small_random elements, small elements, medium_random elements from -1000 to 50.
 *
 A non-empty zero-indexed array A consisting of N integers is given. Array A represents numbers on a tape.
Any integer P, such that 0 < P < N, splits this tape into two non−empty parts: A[0], A[1], ..., A[P − 1] and A[P], A[P + 1], ..., A[N − 1].
The difference between the two parts is the value of: |(A[0] + A[1] + ... + A[P − 1]) − (A[P] + A[P + 1] + ... + A[N − 1])|
In other words, it is the absolute difference between the sum of the first part and the sum of the second part.
For example, consider array A such that:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
We can split this tape in four places:
P = 1, difference = |3 − 10| = 7 
P = 2, difference = |4 − 9| = 5 
P = 3, difference = |6 − 7| = 1 
P = 4, difference = |10 − 3| = 7 
Write a function:
int solution(int A[], int N);
that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
For example, given:
  A[0] = 3
  A[1] = 1
  A[2] = 2
  A[3] = 4
  A[4] = 3
the function should return 1, as explained above.
Assume that:
N is an integer within the range [2..100,000];
each element of array A is an integer within the range [−1,000..1,000].
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 
 
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
