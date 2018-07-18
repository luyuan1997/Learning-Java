package easy;

public class Reverse {
	public int reverse(int x) {
        long tmp = x;
        long result = 0;
        while(tmp != 0){
            result = result*10+tmp%10;
            tmp = tmp/10;
        }
        if(result <Integer.MIN_VALUE||result>Integer.MAX_VALUE){
            result = 0;
        }
        return (int)result;
    }
}
