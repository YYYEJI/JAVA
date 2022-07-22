
public class CH12_Stack {
	private ListNode head;
	private ListNode current;
	private ListNode preprevious;
	private ListNode previous;
	
	private class ListNode{
		private String data;
		private ListNode link;
		
		public ListNode() {
			link = null;
			data = null;
		}
		public ListNode(String newData, ListNode linkValue) {
			data = newData;
			link = linkValue;
		}
		public ListNode(String newData) {
			data = newData;
			link = null;
		}
		
	}
	public CH12_Stack() {
		head = null;
		current = null;
		previous = null;
	}
	public boolean moreTolterate() {
		return current != null;
	}
	public void goTpNext() {
		if(current!=null) {
			previous = current;
			current = current.link;
		} else if(head != null) {
			System.out.println("Iterated too many times or uninitialized iteration");
		} else {
			System.out.println("Iterating with an empty list.");
			System.exit(0);
		}
	}
	public void resetIteration() {
		current = head;
		previous = null;
	}
	public String getDataAtCurrent() {
		String result = null;
		if(current!=null) return current.data;
		else {
			System.out.println("Getting data when current is not at any node.");
			System.exit(0);
		}
		return result;
	}
	public void setDataAtCurrent(String newData) {
		if(current!=null) current.data=newData;
		else {
			System.out.println("Setting data when current is not at any node.");
			System.exit(0);
		}
	}
	public void Push(String addData) {
		head = new ListNode (addData, head);
		preprevious = previous;
		previous = head;
	}
	public void Pop() {
		String item = head.data;
		head = head.link;
	}
	public void showData() {
		ListNode position;
		position = head;
		System.out.println("============");
		System.out.println("Stack Status");
		System.out.println("============");
		while(position!=null) {
			System.out.println(position.data);
			System.out.println("------------");
			position = position.link;
		}
	}
	
}
