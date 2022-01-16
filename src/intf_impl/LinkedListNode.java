package intf_impl;

public class LinkedListNode 
{
	public int data;//Store the data of the node
	public LinkedListNode next;//Store the pointer to the next node
	
	public LinkedListNode(int data)
	{//Everytime a new node is created it will get initiatlized with the user provided data and it's next will be pointing to null
		this.data = data;
		this.next = null;
	}
}
