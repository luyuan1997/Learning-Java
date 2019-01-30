package p20190128;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DataStreamDemo {
	public static void main(String[] args) throws Exception {
		Student[] students = {new Student("Justin",90),new Student("momor",95),new Student("Bush",88)};
		try {
			DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(args[0]));
			for(Student student : students) {
				//写入UTF字符串
				dataOutputStream.writeUTF(student.getName());
				//写入int数据
				dataOutputStream.writeInt(student.getAge());
			}
			//所有数据至目的地
			dataOutputStream.flush();
			//关闭流
			dataOutputStream.close();
			
			DataInputStream dataInputStream = new DataInputStream(new FileInputStream(args[0]));
			//读出数据并还原为对象
			for(int i = 0; i < students.length; i++) {
				//读出UTF字符串
				String name = dataInputStream.readUTF();
				//读出int数据
				int age = dataInputStream.readInt();
				students[i] = new Student(name, age);
			}
			//关闭流
			dataInputStream.close();
			
			//显示还原后的数据
			for(Student student : students) {
				System.out.printf("%s\t%d%n",student.getName(),student.getAge());
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
