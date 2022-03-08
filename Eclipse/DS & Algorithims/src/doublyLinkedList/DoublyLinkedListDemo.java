package doublyLinkedList;
public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.insertAtHead(3);
		dList.insertAtHead(9);
		System.out.println(dList.toString());
	}

}
