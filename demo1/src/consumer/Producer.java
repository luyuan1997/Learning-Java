package consumer;

public class Producer implements Runnable{

	private Info info = null;
	public Producer(Info info) {
		this.info = info;
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		boolean flag = false;
		for(int i=0; i<50; i++) {
			if(flag) {
				this.info.setName("Winston");
				try {
					Thread.sleep(90);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setJob("cook");
				flag = false;
			}else {
				this.info.setName("lili");
				try {
					Thread.sleep(90);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}
				this.info.setJob("butler");
				flag=true;
			}
		}
	}

}
