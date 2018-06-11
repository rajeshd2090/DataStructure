package com.ds.basics.linkedlist;

import javax.print.event.PrintJobAttributeListener;

public class LinkedList1 {
	 Node headNode; 
	static class Node{
		Node next;
		int data;
		Node(int d){
			data = d;
			next = null;
			// Next is always null for new node
		}
		
	}
	
	public  void	printList() {
		Node node = headNode;
		while(node != null) {
			System.out.println(node.data);
			node = node.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Linked List Implementation");
		LinkedList1 linkedList = new LinkedList1();
		linkedList.headNode = new Node(1);
		
		Node second = new Node(2); //Created Second node
		linkedList.headNode.next = second; //Added ref of second node to first node
		
		Node third = new Node(3);  //Created Third node
		second.next = third;       // Added ref of third node to second node
		
		linkedList.printList();
		
	}

}
