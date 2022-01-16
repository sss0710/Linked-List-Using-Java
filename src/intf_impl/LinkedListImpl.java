package intf_impl;

import interface_to_be_implemented.LinkedListIntf;

public class LinkedListImpl implements LinkedListIntf 
{
	LinkedListNode head, tail;
	
	public LinkedListImpl()
	{
		head = tail = null;
	}
	
	@Override
	public void AddAtFront(int element) 
	{
		LinkedListNode newNode = new LinkedListNode(element);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;	
			return;
		}
		
		if(head == tail)
		{
			head = newNode;
			newNode.next = tail;
			return;
		}
		
		LinkedListNode current = head;
		
		head = newNode;
		newNode.next = current;
	}
	
	@Override
	public void AddAtRear(int element)
	{
		LinkedListNode newNode = new LinkedListNode(element);
		
		if(head == null)
		{
			head = newNode;
			tail = newNode;	
			return;
		}
		
		if(head == tail)
		{
			tail.next = newNode;
			tail = newNode;
			return;
		}
		
		tail.next = newNode;
		tail = newNode;
	}

	@Override
	public void AddElementAtPosition(int element, int position) 
	{
		LinkedListNode newNode = new LinkedListNode(element);
		
		int count = 0;
		LinkedListNode current = head;
		
		if(position == 1)
		{
			head = newNode;
			newNode.next = current;
			return;
		}
		
		if(position == getCount())
		{
			tail.next = newNode;
			tail = newNode;
			return;
		}
		
		LinkedListNode previous = current;
		
		while(current != null)
		{
			++count;
			if(count == position)
			{
				previous.next = newNode;
				newNode.next = current;
				return;
			}
			previous = current;
			current = current.next;
		}	
	}
	
	@Override
	public void DeleteElementAtFront()
	{
		if(head == null)
			return;
		
		if(head == tail)
		{
			head = tail = null;
			return;
		}
		
		head = head.next;
	}
	
	@Override
	public void DeleteElementAtRear()
	{
		if(head == null)
			return;
		
		if(head == tail)
		{
			head = tail = null;
			return;
		}
		
		LinkedListNode current = head;
		LinkedListNode previous = null;
		
		while(current != tail)
		{
			previous = current;
			current = current.next;
		}
		
		tail = previous;
		previous.next = null;
	}
	
	@Override
	public void DeleteElementAtPosition(int position) 
	{
		int count = 1;
		LinkedListNode current = head.next;
		
		if(position == 1)
		{
			head = head.next;
			return;
		}
		
		LinkedListNode previous = current;
		
		while(current != null)
		{
			++count;
			if(count == position)
			{
				previous.next = current.next;
				if(current == tail)
					tail = previous;
				
				return;
			}
			previous = current;
			current = current.next;
		}	
	}

	@Override
	public int[] GetAllElements() 
	{
		int[] arr = new int[getCount()];
		int index = 0;
		
		if(head == null || tail == null)
			return null;
		
		LinkedListNode current = head;
		
		while(current != null)
		{
			arr[index++] = current.data;
			current = current.next;
		}
		return arr;
	}

	@Override
	public int[] GetAllElementsInReverse() 
	{
		int[] rev_arr = new int[getCount()];
		
		if(head == null)
			return null;
		
		LinkedListNode current = head;
		int index = rev_arr.length - 1;
		while(current != null && index >= 0)
		{
			rev_arr[index--] = current.data;
			current = current.next;
		}
		return rev_arr;
	}

	@Override
	public void DeleteAll(int element) 
	{
		if(head == null)
			return;
		
		if(head == tail && element == head.data)
			head = tail = null;
		
		LinkedListNode current = head;
		LinkedListNode previous = head;
		while(current != null)
		{
			if(element == current.data)
			{
				if(current == head)
				{
					head = head.next;
				}
				
				if(current == tail)
				{
					previous.next = null;
					tail = previous;
				}
				
				previous.next = current.next;
			}
			
			previous = current;
			current = current.next;
		}
	}
	
	public int getCount()
	{
		int count = 0;
		
		if(head == null)
			return 0;
		
		if(head == tail)
			return 1;
		
		LinkedListNode current = head;
		
		while(current != null)
		{
			++count;
			current = current.next;
		}
		return count;
	}
}
