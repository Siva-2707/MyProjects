package com.siva.algorithms;

import doublyLinkedList.*;
public class LinkedListSort {
	
	public static DoublyLinkedList insersionSort(DoublyLinkedList list) {
		
		 
		 Node pointer = list.head.getNextNode();
		 
		 
		 while(pointer != null) {
			 Node current = pointer;
			 
			 while(current != null) {
				 
				 if(current.getData()<current.getPreviousNode().getData()) {
					 
					 current.getPreviousNode().setNextNode(current.getNextNode());
					 current.getNextNode().setPreviousNode(current.getPreviousNode());
					 current.setNextNode(current.getPreviousNode());
					 current.setPreviousNode(current.getNextNode().getPreviousNode());
					 current.getNextNode().setPreviousNode(current);
				 }
				 
				 current = current.getPreviousNode();
			 }
			 list.showList();
			 
			 
			 pointer = pointer.getNextNode();
		 }
		
		
		return list;
	}
	
	
}
