package interface_to_be_implemented;

public interface LinkedListIntf 
{
	void AddAtFront(int element);//To add element at front of the list
	
	void AddAtRear(int element);//To add element at end/rear of the list
	
	void AddElementAtPosition(int element, int position);//To add element at user provided position of the list
	
	void DeleteElementAtFront();//To delete element from the front of the list
	
	void DeleteElementAtRear();//To delete element from rear/end of the list
	
	void DeleteElementAtPosition(int position);//To delete element from a user provided position to the list
	
	int[] GetAllElements();//Printing elements in an array
	
	int[] GetAllElementsInReverse();//Printing elements in reverse order
	
	void DeleteAll(int element);//Deleting all the occurances of a particular element
}
