
public class MainList {

	public static void main(String[] args) {
		LinkList linkedList=new LinkList();
		linkedList.insert(56);
		linkedList.insert(30);
		linkedList.insert(70);
		System.out.println("LinkList:");
		linkedList.print();
		//insert between index 2  and 3
				linkedList.addAtIndex(78,2);
				linkedList.print();
				linkedList.addAtIndex(90,3);
				linkedList.print();


	}

}
