package doublyLinkedList;
import com.siva.algorithms.LinkedListSort;
public class DoublyLinkedListDemo {
	
	public static void main(String[] args) {
		DoublyLinkedList dList = new DoublyLinkedList();
		dList.insertAtHead(3);
		dList.insertAtHead(9);
		dList.insertAtHead(2);
		dList.insertAtHead(8);
		dList.insertAtHead(23);
		dList.insertAtHead(98);
		dList.showList();
		System.out.println();
		LinkedListSort.insersionSort(dList);
		dList.showList();
		System.out.println();
	}

}
