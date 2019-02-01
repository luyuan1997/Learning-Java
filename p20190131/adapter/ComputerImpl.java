package p20190131.adapter;

public class ComputerImpl implements Computer {
	CardAdapter cardAdaptor;
	@Override
	public void readFilesFromHardDisk(String diskType, String fileName) {
		if("hardDisk".equals(diskType)) {
			System.out.println("从硬盘放映电影：" + fileName);
		} else if ("TFCard".equals(diskType) || "SDCard".equals(diskType)){
            cardAdaptor = new CardAdapter();
            cardAdaptor.readFilesFromHardDisk(diskType, fileName);
        } else {
            System.out.println("参数非法");
        }
	}
}
