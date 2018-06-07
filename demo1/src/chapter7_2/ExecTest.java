package chapter7_2;

public class ExecTest {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Runtime rt = Runtime.getRuntime();
		//运行记事本程序
		rt.exec("notepad.exe");
	}

}
