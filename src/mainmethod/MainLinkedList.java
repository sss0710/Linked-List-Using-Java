package mainmethod;

import java.util.Arrays;
import java.util.Scanner;

import intf_impl.LinkedListImpl;

public class MainLinkedList 
{
	public static void main(String[] args) 
	{
		try(Scanner sc = new Scanner(System.in)) 
		{
			LinkedListImpl linkedList = new LinkedListImpl();
			
			linkedList.AddAtFront(50);
			linkedList.AddAtFront(590);
			linkedList.AddAtFront(50);
			linkedList.AddAtFront(550);
			linkedList.AddAtRear(63);
			linkedList.AddAtFront(74);
			linkedList.AddAtFront(50);
			linkedList.AddAtRear(98);
			linkedList.AddAtRear(85);
			linkedList.AddAtRear(20);
			linkedList.AddAtFront(50);
			boolean flag = true;
			while(flag)
			{
				try
				{
					System.out.println("\nChoose an option : "
							+ "\n1. Add At Front"
							+ "\n2. Add At Rear"
							+ "\n3. Add Element At Position"
							+ "\n4. Delete At Front"
							+ "\n5. Delete At Rear"
							+ "\n6. Delete Element At Position"
							+ "\n7. Get All Elements"
							+ "\n8. Get All Elements In Reverse"
							+ "\n9. Delete All"
							+ "\n100. Exit");
					switch (sc.nextInt()) 
					{
						case 1:
							System.out.println("Enter the value: ");
							linkedList.AddAtFront(sc.nextInt());
						break;
		
						case 2:
							System.out.println("Enter the value to add : ");	
							linkedList.AddAtRear(sc.nextInt());
						break;
						
						case 3:
							System.out.println("Enter the value and position: ");
							linkedList.AddElementAtPosition(sc.nextInt(), sc.nextInt());
						break;
						
						case 4:
							linkedList.DeleteElementAtFront();
						break;
						
						case 5:
							linkedList.DeleteElementAtRear();
						break;
						
						case 6:
							System.out.println("Enter the value to delete : ");	
							linkedList.DeleteElementAtPosition(sc.nextInt());
						break;
						
						case 7:
							System.out.println("Linked List as Array : " + Arrays.toString(linkedList.GetAllElements()));
						break;
						
						case 8:
							System.out.println("Linked List as Array : " + Arrays.toString(linkedList.GetAllElementsInReverse()));	
						break;

						case 9:
							System.out.println("Enter the value to delete : ");	
							linkedList.DeleteAll(sc.nextInt());
						break;
						
						case 100:
							flag = false;
							System.out.println("OK....Bye!!!!!");
						break;

						default:
							System.out.println("Invalid choice!!!!");
					}	
				}
				catch (Exception e) 
				{
					sc.nextLine();
					e.printStackTrace();
				}
			}
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
