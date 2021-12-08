
public class RecursionCh12 {
	public static int sum(int target) {
		if (target <= 0) {
			return 0;
		} else {
			return target + sum(target - 1);
		}	
	}
	
	public static int product(int target) {
		if (target <= 0) {
			return 1;
		} else {
			return target * product(target - 1);
		}	
	}
	
	public static void main(String[] args) {
		int n = 3;
		int result = product(n);
		System.out.println(result);
	}
}
