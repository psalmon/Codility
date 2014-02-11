/**
 * Codility Challenge: FrogJmp
 * 
 * @author Paul Salmon
 * 
 * www.github.com/psalmon
 * Score: 100/100
 * Time Complexity: O(1)
 * 
 */


public class frogJmp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution(10, 85, 30));
	}
	
	public static int solution(int X, int Y, int D){
		int jumps = (Y-X)/D;
		
		if (jumps*D != (Y-X)){
			return jumps+1;
		}else{
			return jumps;
		}
	}

}
