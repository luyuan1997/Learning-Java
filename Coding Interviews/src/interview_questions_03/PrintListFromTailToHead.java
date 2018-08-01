package interview_questions_03;

public class PrintListFromTailToHead {

	public void printListFromTailToHead(ListNode listNode) {
		if(listNode != null) {
			if(listNode.next != null) {
				printListFromTailToHead(listNode.next);
			}
			System.out.println(""+listNode.val);
		}
	}
	
	public class ListNode{
		int val;
		ListNode next = null;
		ListNode(int val){
			this.val = val;
		}
	}
}
