package doublyLinkedList;


public class DoublyLinkedList{
	public Node head;
	
	
	public void insertAtHead(int data){
		Node current = new Node(data);
		if(head == null) {
			this.head = current;
		}
		else{
		this.head.setPreviousNode(current);
		current.setNextNode(this.head);
		this.head = current;
		}
//		System.out.println("Created");
	}
	
	public void showList() {
		Node current = this.head;
		if(current == null) {
			System.out.println("No elements present");
			return;
		}
		String result = "List = { ";
		while( current != null) {
			result += current.getData() + " ";
			current = current.getNextNode();
		}
		result += "}";
		System.out.println(result);
		
	}
	
	
	
	
	
}
