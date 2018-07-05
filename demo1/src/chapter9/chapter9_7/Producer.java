package chapter9.chapter9_7;

class Producer implements Runnable{
	private Info info = null;
	public Producer(Info info) {
		this.info = info;
	}
	public void run() {
		boolean flag = false;
		for(int i=0; i<50; i++) {
			if(flag) {
				this.info.set("李兴华", "Java讲师");
				flag = false;
			}else {
				this.info.set("mldn", "www.mldnjava.cn");
				flag = true;
			}
		}
	}
}
