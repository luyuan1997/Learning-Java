package Lee;

public class BetterPrinter implements Output{
	private String[] printData = new String[MAX_CACHE_LINE*2];
	//���Լ�¼��ǰ��Ҫ��ӡ����ҵ��Ŀ
	private int dataNum = 0;
	public void out() {
		//ֻҪ������ҵ���ͼ�����ӡ
		while (dataNum > 0) {
			System.out.println("���ٴ�ӡ�����ڴ�ӡ��"+printData[0]);
			//����ҵ��������ǰ��һλ������ʣ�µ���ҵ���ȥ1
			System.arraycopy(printData, 1, printData, 0, --dataNum);
		}
	}
	public void getData(String msg) {
		if(dataNum >= MAX_CACHE_LINE * 2) {
			System.out.println("�����������������ʧ��");
		} else {
			//�Ѵ�ӡ���������ڶ�����Ա�������������1
			printData[dataNum++] = msg;
		}
	}
}