/**
 * Codility Challenge: PermMissingElem
 * 
 * @author Paul Salmon
 * www.github.com/psalmon
 * 
 * Score: 100/100
 * Desired Time Complexity: O(N)
 * Detected Time Complexity: O(N) or O(N * log(N))
 *
 */
public class PermMissingElem {

	public static void main(String[] args) {
		int[] input = {2, 3, 1, 5};
		System.out.println(solution(input));

	}
	
	public static long solution(int[] A){ //o(n) + c. change to int and cast the return on codility.
		long sum = getSum(A); //O(n)
		long length = A.length+1; //+1 for the element that is missing
		long desired = ((length * (length+1)) / 2);
		
		return (desired-sum);
		
	}
	
	public static long getSum(int[] A){ //o(n)
		long sum = 0;					//Large input array breaks max int. Use long.
		for (int i : A){
			sum += i;
		}
		return sum;
	}

}
