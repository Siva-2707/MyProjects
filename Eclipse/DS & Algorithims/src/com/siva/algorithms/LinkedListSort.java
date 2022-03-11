package com.siva.algorithms;

import doublyLinkedList.*;
public class LinkedListSort {
	
	public static DoublyLinkedList insersionSort(DoublyLinkedList list) {
		
		 
		 Node current = list.head.getNextNode();
		 
		 
		 while(current != null) {
			 Node currentNext = current.getNextNode();
			 Node pointer = current.getPreviousNode();
			 
			 while(pointer != null) {
				 
				 if(current.getData()> current.getPreviousNode().getData()) {
					 break;
				 }
				 
				 if(pointer.getPreviousNode() == null || current.getData()> pointer.getData()) {
					 current.getPreviousNode().setNextNode(current.getNextNode());
					 current.getNextNode().setPreviousNode(current.getPreviousNode());
					 current.setNextNode(pointer.getNextNode());
					 current.setPreviousNode(pointer);
					 if(pointer.getPreviousNode() == null )
					 current.getNextNode().setPreviousNode(current);
				 }
				 else
				 {
//					 current.getPreviousNode().setNextNode(current.getNextNode());
//					 current.getNextNode().setPreviousNode(current.getPreviousNode());
//					 current.setNextNode(current.getPreviousNode());
//					 current.setPreviousNode(current.getNextNode().getPreviousNode());
//					 current.getNextNode().setPreviousNode(current);
				 }
				 
				 pointer = pointer.getPreviousNode();
			 }
			 list.showList();
			 
			 current = currentNext;
			 
		 }
		
		
		return list;
	}
	
	
}
