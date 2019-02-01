package p20190131.adapter;

public class TFCard implements Card {
	@Override
	public void readFilesFromFlashMemory(String diskType, String fileName) {
		System.out.println("从TF卡放映电影：" + fileName);
	}
}
