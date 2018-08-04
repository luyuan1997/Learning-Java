package easy;

public class Link {

	class Node{
		private String data;
		private Node next;
		private Node(String data) {
			this.data = data;
		}
		
		public void add(Node newNode) {
			//判断下个节点是否为空，如果为空，那么新节点设置在next位置上，如果不为空，则在下一个位置处增加节点
			if(this.next == null) {
				this.next = newNode;
			}else {
				this.next.add(newNode);
			}
		}
		
		public void print() {
			System.out.print(this.data+"\t");
			if(this.next != null) {
				this.next.print();//输出下一个节点
			}
		}
		public boolean search(String data) {
			//判断当前节点的名字是否和查找的一致，如果一致，返回true，否则继续判断下一个节点，直接找到，如果找不到，返回false
			if(data.equals(this.data)) {
				return true;
			}else {
				if(this.next != null) {
					return this.next.search(data);
				}else {
					return false;
				}
			}
		}
		
		public void delete(Node previous, String data) {
			//删除节点，如果找到了匹配节点，那么空出当前节点，否则继续向下找
			if(data.equals(this.data)) {
				previous.next = this.next;
			}else {
				if(this.next != null) {
					this.next.delete(this, data);
				}
			}
		}
	}
	
	private Node root;//表示根节点
	public void addNode(String data) {
		//建立新的节点，如果没有根节点，将第一个节点设置为根节点，否则添加在合适位置
		Node newNode = new Node(data);
		if(this.root == null) {
			this.root = newNode;
		}else {
			this.root.add(newNode);
		}
	}
	
	public void printNode() {
		if(this.root != null) {
			this.root.print();
		}
	}
	
	public boolean contains(String name) {
		//判断是否包含某元素   
		return this.root.search(name);
	}
	
	public void deleteNode(String data) {
		if(this.contains(data)) {
			if(this.root.data.equals(data)) {
				this.root = this.root.next;
			}else {
				this.root.next.delete(root, data);
			}
		}
	}
}
