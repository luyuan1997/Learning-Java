package p20190131.adapter;

public class CardAdapter implements Computer {
	Card card;
	@Override
	public void readFilesFromHardDisk(String diskType, String fileName) {
		if("SDCard".equals(diskType)) {
			card = new SDCard();
		} else {
			card = new TFCard();
		}
		card.readFilesFromFlashMemory(diskType, fileName);
	}
}
