package easy;

public class PrimeNumber {

	public void IsPrimeNumber(int num) {
		boolean result = true;
		for(int i=2; i*i <= num; i++) {
			if(num % i == 0) {
				result = false;
				break;
			}
		}
		if(result) {
			System.out.println(num+"是素数");
		}else {
			System.out.println(num+"不是素数");
		}
	}
	
}
