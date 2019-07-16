package com.bob.hms.admin.common.pract;

public class LinkedListInsert {
	
	Node head; //Header Node
	
	//Node class with int data and address of next node
	class Node {
		int data;
		Node next;
		
		//consutructor of Node class
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	//Insert and sort the Node
	void sortInserted(Node newNode) {
		Node current;
		
		//checking newnode is bigger than head, if so making new node itself as head
		if (head == null || head.data >= newNode.data) {
			newNode.next = head;
			head  = newNode;
		} else {
			//checking for current node with new node, if new node data is less than current
			//then current node will be assigned to next of current and 
			// assigning newNode next to current next and assigning current node to newnode
			current = head;
			while(current.next != null && 
					current.next.data < newNode.data)
				current  = current.next;
			
			newNode.next = current.next;
			current.next = newNode;
		}
	}
	
	//Utility functions
	
	//Create a new Node
	public Node  newNode(int n) {
		Node x = new Node(n);
		return x;
	}
	
	//Print List
	void  printList() {
		Node temp = head;
		while (temp  !=  null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
	}

	public static void main(String[] args) {
		LinkedListInsert  list = new LinkedListInsert();
		Node new_node;
		new_node = list.newNode(5);
		list.sortInserted(new_node);
		
		new_node = list.newNode(1);
		list.sortInserted(new_node);
		
		new_node = list.newNode(6);
		list.sortInserted(new_node);
		
		new_node = list.newNode(2);
		list.sortInserted(new_node);
		
		new_node = list.newNode(3);
		list.sortInserted(new_node);
		
		new_node = list.newNode(4);
		list.sortInserted(new_node);
		
		System.out.println("Created Linked List");
		
		list.printList();
	}

}
/*
*Output:
*Created Linked List
1 
2 
3 
4 
5 
6 
*/