package interview_questions_03;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead1 {

	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		if(listNode == null) {
			ArrayList<Integer> list = new ArrayList<Integer>();
			return list;
		}
		Stack<Integer> stk = new Stack<Integer>();
		while(listNode != null) {
			stk.push(listNode.val);
			listNode = listNode.next;
		}
		ArrayList<Integer> arr = new ArrayList<Integer>();
		while(!stk.isEmpty()) {
			arr.add(stk.pop());
		}
		return arr;
		
	}
	
	
	public class ListNode{
		int val;
		ListNode next = null;
		ListNode(int val ){
			this.val = val;
		}
	}
}
