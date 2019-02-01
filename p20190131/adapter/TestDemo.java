package p20190131.adapter;

public class TestDemo {
	public static void main(String[] args) {
		ComputerImpl computer = new ComputerImpl();
		computer.readFilesFromHardDisk("hardDisk", "《乱世佳人》");
		computer.readFilesFromHardDisk("TFDisk", "《肖申克救赎》");
		computer.readFilesFromHardDisk("SDDisk", "《教父》");
	}
}
