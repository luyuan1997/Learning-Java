package p20190122;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileScanner {

	private static void listFile(File f) throws InterruptedException{
		if(f == null) {
			return;
		}
		if(f.isFile()) {
			System.out.println(f);
			return;
		}
		File[] allFiles = f.listFiles();
		if(Thread.interrupted()) {
			throw new InterruptedException("扫描文件任务被中断");
		}
		for(File file : allFiles) {
			listFile(file);
		}
	}
	
	public static String readFromConsole() {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			return reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
	
	public static void main(String[] args) {
		final Thread fileIteratorThread = new Thread() {
			public void run() {
				try {
					listFile(new File("c:\\"));
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		new Thread() {
			public void run() {
				while(true) {
					if("quit".equalsIgnoreCase(readFromConsole())) {
						if(fileIteratorThread.isAlive()) {
							fileIteratorThread.interrupt();
							return;
						}
					} else {
						System.out.println("输入quit退出文件扫描");
					}
				}
			}
		}.start();
		fileIteratorThread.start();
	}

}
