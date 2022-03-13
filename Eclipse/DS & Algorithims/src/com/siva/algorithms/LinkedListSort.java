package com.siva.algorithms;

import doublyLinkedList.*;
public class LinkedListSort {
	
	public static DoublyLinkedList insersionSort(DoublyLinkedList list) {
		
		 
		 Node current = list.head.getNextNode();
		 
		 
		 while(current != null) {
			 Node currentNext = current.getNextNode();
			 Node pointer = current.getPreviousNode();
			 int flag = 0;
			 while(pointer != null) {
				 
				 if(current.getData()> current.getPreviousNode().getData()) {
					 break;
				 }
				 
				 if(current.getData()> pointer.getData()) {
					 current.getPreviousNode().setNextNode(current.getNextNode());
					 current.getNextNode().setPreviousNode(current.getPreviousNode());
					 current.setNextNode(pointer.getNextNode());
					 current.setPreviousNode(pointer);
					 if(pointer.getPreviousNode() == null )
					 current.getNextNode().setPreviousNode(current);
					 flag = 1;
					 break;
				 }
				
				 
				 pointer = pointer.getPreviousNode();
			 }
			 if(flag == 0) {
				 current.getPreviousNode().setNextNode(current.getNextNode());
				 if(current.getNextNode() != null)
				 current.getNextNode().setPreviousNode(current.getPreviousNode());
				 current.setPreviousNode(null);
				 current.setNextNode(list.head);
				 list.head.setPreviousNode(current);
				 list.head = current;
			 }
//			 list.showList();
			 
			 current = currentNext;
			 
		 }
		
		
		return list;
	}
	
	
}
