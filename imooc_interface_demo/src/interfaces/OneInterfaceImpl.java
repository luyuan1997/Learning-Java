package interfaces;

public class OneInterfaceImpl implements OneInterface{
	
	@Override
	public String hello(String word) {
		return "Word from interface \"OneInterface\":"+word;
	}
}
