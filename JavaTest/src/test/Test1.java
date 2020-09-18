package test;

public class Test1 {
	public static void main(String[] args) {
		ListNode n1 = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(3);
		ListNode n4 = new ListNode(4);
		ListNode n5 = new ListNode(5);
		n1.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n1;
		long start = System.currentTimeMillis();
		boolean flag = hasCycle(n1);
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		System.out.println(flag);
	}
	
	public static boolean hasCycle(ListNode head) {
	       if(head == null || head.next == null){
	           return false;
	       }
	     
	       ListNode first = head;
	       while(first != null){
	           if(first.next == head){
	               return true;
	           }else{
	               first = first.next;
	           }
	       }
	        
	        return false;
	    }
}
