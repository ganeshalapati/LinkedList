import java.util.Scanner;
public class MainList {

	//main method
	   public static void main(String[] args) {

			LinkList linkedList=new LinkList();
			Scanner sc=new Scanner(System.in);
			while(true) {
					
				System.out.println("Enter your choice\n1)Insert at lastPosition(append)\n"
						+ "2)Insert at first(push)\n"
						+ "3)insert at particular index\n"
						+ "4)Delete at last\n"
						+ "5)Delete at first\n"
						+ "6)Print list\n"
						+ "7)Search element\n");
				 int choice =sc.nextInt();
			
				switch(choice) {
				case 1:
					System.out.println("enter data to insert(append)");
					int append=sc.nextInt();
					linkedList.insert(append);
					linkedList.print();
					break;
				case 2:
					System.out.println("enter data to insert(push)");
					int insertlast=sc.nextInt();
					linkedList.push(insertlast);
					linkedList.print();
					break;
					
				case 3:
					System.out.println("enter data to insert");
					int insertBetween=sc.nextInt();
					System.out.println("enter the index after which you have to enter data");
					int position=sc.nextInt();
					linkedList.addAtIndex(insertBetween, position);
					linkedList.print();
					break;
				
				case 4:
					System.out.println(" Removing the last element of list");
					linkedList.popLast();
					linkedList.print();
					break;
				
				case 5:
					System.out.println("Removing the first element of list");
					linkedList.pop();
					linkedList.print();
					break;
					
				case 6:
					linkedList.print();
					break;
			
				case 7:
					System.out.println("Enter the element  you want to search");
					int a=sc.nextInt();
					int searched=linkedList.search(a);
					System.out.println(searched);	
					break;
					
				case 8:
					System.out.println("enter element to insert");
					int insertAfter=sc.nextInt();
					System.out.println("enter the index after which you have to enter data");
					int position1=sc.nextInt();
					linkedList.addAtIndex(insertAfter, position1);
					linkedList.print();
					break;
				
				
				case 9:
					System.exit(0);
			
				default:
					System.out.println("Invalid choice");
					break;
				}
				
				}
				
		
		}		

		


}


