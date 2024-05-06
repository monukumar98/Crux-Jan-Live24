package Lec38;

public class LinkedList_Clinet {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.AddFirst(10);
		ll.AddFirst(20);
		ll.AddFirst(30);
		ll.AddLast(4);
		ll.AddLast(5);
		ll.display();
		ll.AddIndex(3, 8);// index , element
		ll.display();
		//System.out.println(ll.size());
		System.out.println(ll.getfirst());
		System.out.println(ll.getlast());
		System.out.println(ll.getindex(2));
		//System.out.println(ll.removefirst());
		//System.out.println(ll.removeLast());
		System.out.println(ll.removeindex(2));
		ll.display();

	}

}
