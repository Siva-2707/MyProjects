package linkedList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ls = new LinkedList();
		ls.insertAtHead(5);
		ls.insertAtLast(3);
		ls.insertAtLast(7);
		

		ls.showList();
		System.out.println("Length of the List: "+ ls.length());
		
		ls.deleteAtHead();
		ls.showList();
		int result = ls.find(7);
		if(result == -1)
			System.out.println("Not found");
		else
			System.out.println("Found at index: "+ result);
		
	}

}
