package easy;

public class IsPalindrome {
	public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x/10 == 0){
            return true;
        }
        int result = 0;
        int remaining = x;
        int tail = 0;
        while(remaining != 0){
            tail = remaining % 10;
            remaining = remaining / 10;
            result = result *10 + tail;
        }
        if(result == x){
            return true;
        }else{
            return false;
        }
    }
}
