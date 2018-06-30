package chapter11.chapter11_8;

import javax.imageio.ImageIO;

public class ImageIOTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] readFormat = ImageIO.getReaderFormatNames();
		System.out.println("-----Image能读的所有图形文件格式-----");
		for(String tmp : readFormat) {
			System.out.println(tmp);
		}
		String[] writeFormat = ImageIO.getWriterFormatNames();
		System.out.println("-----Image能写的所有图形文件格式-----");
		for(String tmp : writeFormat) {
			System.out.println(tmp);
		}
	}

}
