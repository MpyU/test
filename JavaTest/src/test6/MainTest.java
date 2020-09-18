package test6;

public class MainTest {
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
		
		showList(n1);
		System.out.println("---------------");
		ListNode reverseList = reverse(n1);
		showList(reverseList);
	}
	
	public static ListNode reverse(ListNode head) {
		
		if(head.next == null) {
			return head;
		}
		
		ListNode p1 = head;
        ListNode p2 = head.next;
        p1.next = null;
        ListNode p3 = p2.next;
        while(p2.next != null){
            p2.next = p1;
            p1 = p2;
            p2 = p3;
            p3 = p3.next;
        }
        
        p2.next = p1;
		
		return p2;
	}
	
	public static void showList(ListNode head) {
    	while(head != null) {
    		System.out.println(head.val);
    		head = head.next;
    	}
    }
}
