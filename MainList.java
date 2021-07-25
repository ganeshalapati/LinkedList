import java.util.Scanner;
public class MainList {

	//main method
	   public static void main(String[] args) {

		   LinkList linkedList=new LinkList();
			linkedList.insert(56);
			linkedList.insert(30);
			linkedList.insert(70);
			System.out.println("LinkList:");
			linkedList.print();	
			linkedList.popLast();
			linkedList.print();
		}	
	}					

		




