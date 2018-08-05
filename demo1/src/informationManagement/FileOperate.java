package informationManagement;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//用于专门保存和读取数据
public class FileOperate {

	private File file=null;
	//通过构造方法传递文件路径
	public FileOperate(String pathName) {
		this.file = new File(pathName);
	}
	
	public boolean save(Object obj) throws Exception{
		ObjectOutputStream oos = null;//对象输出流
		boolean flag = false;
		try {
			oos=new ObjectOutputStream(new FileOutputStream(this.file));//实例化对象输出流
			oos.writeObject(obj);
			flag = true;
		}catch(Exception e) {
			throw e;
		}finally {
			if(oos != null) {
				oos.close();
			}
		}
		return flag;
		
	}
	public Object load() throws Exception{
		Object obj = null;
		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream(this.file));
			obj = ois.readObject();
		}catch(Exception e) {
			throw e;
		}finally {
			if(ois!= null) {
				ois.close();
			}
		}
		return obj;
		
	}
}
