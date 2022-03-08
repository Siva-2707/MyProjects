package doublyLinkedList;

public class Node {
	
	private int data;
	private Node nextNode, previousNode;
	
	
	
	public Node(int data) {
		super();
		this.data = data;
		
	}
	
	
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	public Node getPreviousNode() {
		return previousNode;
	}
	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	
	
	
}
