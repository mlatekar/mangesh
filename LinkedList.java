package list;

public class LinkedList {
	Node head;
	
	public void insert(int data)
	{
		
		Node node=new Node();
		node.data=data;
		node.next=null;
		if(head == null)
		{
			head=node;
		}
		else
		{
			Node n = head;
			while(n.next!=null)
			{
				n = n.next;
			}	
			n.next = node;
		}
			
	}
	
	public void insertatstart(int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		node.next=head;
		head=node;
		
		
	}
	
	public void insert_at(int index,int data)
	{
		Node node=new Node();
		node.data=data;
		node.next=null;
		
		if(index==0)
		{
			insertatstart(data);
		}
		else
		{
		 Node n=head;
		  for(int i=0;i<index-1;i++)
		  {
		 	n=n.next;
		  }
		  node.next=n.next;
		  n.next=node;
		}
	}
	
	
	public void deleteat(int index)
	{
		if (index==0)
		{
			head=head.next;
			
		}
		else
		{
			Node n=head;
			for(int i=0;i<index-1;i++)
			{
				n=n.next;
				
			}
			Node n1=null;
			n1=n.next;
			n.next=n1.next;
		//	n1=null;
			
			System.out.println("deleted item is"+n1.data);
		}
		}
	
	public void show()
	{
		Node node = head;
		while(node.next!=null)
		{
			System.out.print(node.data+ " ");
			node= node.next;
		}
		System.out.print(node.data);
	}
}
