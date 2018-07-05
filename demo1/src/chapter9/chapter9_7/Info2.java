package chapter9.chapter9_7;

class Info2 {
	private String name = "李兴华";
	private String content = "Java讲师";
	private boolean flag = false;
	public synchronized void set(String name, String content) {
		if(!flag) {
			try {
				super.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.setName(name);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
		flag = false;
		super.notify();
	}
	public synchronized void get() {
		if(!flag) {
			try {
				super.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "-->" +this.getContent());
		flag = false;
		super.notify();	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
}
