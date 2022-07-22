
public class CH12_Stack_main {
	public static void main(String[] args) {
		CH12_Stack mystack = new CH12_Stack();
		mystack.Push("One");
		mystack.Push("Two");
		mystack.Push("Three");
		
		mystack.showData();
		
		System.out.println("\n\n Pop() called.\n\n");
		mystack.Pop();
		mystack.showData();
		
		System.out.println("\n\n Pop() called.\n\n");
		mystack.Pop();
		mystack.showData();
		
		System.out.println("\n\n Pop() called.\n\n");
		mystack.Pop();
		mystack.showData();
	}
}
