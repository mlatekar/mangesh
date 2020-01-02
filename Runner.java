package list;

public class Runner {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.insert(12);
		list.insert(5);
		list.insert(45);
		list.insert(77);
		
		list.insertatstart(55);
		list.insertatstart(4);
		list.insertatstart(1);
		
		list.insert_at(0, 100);
		list.insert_at(2, 200);
		list.insert_at(4, 00);

		list.deleteat(1);
		list.deleteat(2);
		list.deleteat(5);
		
		list.show();

	}

}
