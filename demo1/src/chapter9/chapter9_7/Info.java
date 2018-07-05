package chapter9.chapter9_7;

class Info {
	private String name = "李兴华";
	private String content = "Java讲师";
	public synchronized void set(String name, String content) {
		this.setName(name);
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		this.setContent(content);
	}
	public synchronized void get() {
		try {
			Thread.sleep(300);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(this.getName() + "-->" +this.getContent());
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
