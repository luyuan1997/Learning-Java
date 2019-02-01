package p20190131.adapter;

public class SDCard implements Card {
	@Override
	public void readFilesFromFlashMemory(String diskType, String fileName) {
		System.out.println("从SD卡放映电影：" + fileName);
	}
}
