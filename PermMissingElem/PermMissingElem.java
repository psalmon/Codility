/**
 * Codility Challenge: PermMissingElem
 * 
 * @author Paul Salmon
 * www.github.com/psalmon
 * 
 * Score: 100/100
 * Desired Time Complexity: O(N)
 * Detected Time Complexity: O(N) or O(N * log(N))
 PermMissingElem
===============

Codility Challenge: PermMissingElem

A zero-indexed array A consisting of N different integers is given. The array contains integers in the range [1..(N + 1)], which means that exactly one element is missing.
Your goal is to find that missing element.
Write a function:
int solution(int A[], int N);
that, given a zero-indexed array A, returns the value of the missing element.
For example, given array A such that:
  A[0] = 2
  A[1] = 3
  A[2] = 1
  A[3] = 5
the function should return 4, as it is the missing element.
Assume that:
N is an integer within the range [0..100,000];
the elements of A are all distinct;
each element of array A is an integer within the range [1..(N + 1)].
Complexity:
expected worst-case time complexity is O(N);
expected worst-case space complexity is O(1), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.
 
 
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
