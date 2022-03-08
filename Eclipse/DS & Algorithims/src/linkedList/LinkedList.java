package linkedList;

public class LinkedList {
	private Node head;
	
	public void insertAtHead(int data) {
		Node node = new Node(data);
		node.setNextNode(this.head);
		this.head = node;
	}
	
	public void insertAtLast(int data) {  // This makes the List, DoublyEnded Linked List
		Node current = head;
		while(current.getNextNode() != null) {
			current = current.getNextNode();
		}
		Node newNode = new Node(data);
		current.setNextNode(newNode); 
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
	
	public int find(int data) {
		Node current = this.head;
		int index = 0;
		while(current != null) {
			if(current.getData() == data) {
				return index;
			}
			index++;
			current = current.getNextNode();
		}
		return -1; 
	}
	
	public void deleteAtHead() {
		this.head = this.head.getNextNode();
	}
	
	public int length() {
		int length = 0;
		Node current = this.head;
		while(current != null) {
			length++;
			current = current.getNextNode();
		}
		return length;
	}
}
