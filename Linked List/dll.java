import java.util.*;

class dll{

Node head;
static class Node
{
	int data;
	Node next,prev;
	
	 public Node(int d)
	{
		data=d;
		prev=next=null;
	}
}

public void Display()
{
	Node n=head;
	while(n!=null)
	{
		System.out.print(n.data+"-->");
		n=n.next;
	}
	System.out.println("Null");
}

public void insertfirst(int data)
{
	Node newnode=new Node(data);
	if(head!=null)
	{
		newnode.next=head;
		head.prev=newnode;
	}
	head=newnode;
}
public void insertBetween(int data,int after)
{
	Node n=head;
	Node newnode=new Node(data);
	if(head==null)
	{
		System.out.println("Can't possible");
		return;
	}
	while(n.next!=null)//find/traverse till last node
	{
	if(n.data==after)
	{
		break;
	}
	n=n.next;//move to next node
	}
	newnode.next=n.next;//new node -->link
	newnode.prev=n;		//new node  <--link
	n.next.prev=newnode;//n--> newnode -->[n.next]
	n.next=newnode;
	
	
}

public void insertLast(int data)
{
	Node n=head;
	
	Node newnode=new Node(data);
	if(head==null)//if list is empty the new node is ur first node
	{
		head=newnode;
		return;
	}
	while(n.next!=null)//if list is not emty then traverse to last node and append the new node atLast.
	{
		n=n.next;
	}
	n.next=newnode;
	newnode.prev=n;
}

public void insert()
{
	
	Node newnode=new Node(20);
	head=newnode;
}

public void delete(int key)//all deletion condition in one fun
{
	Node temp=head;
	Node n=null;
	int flag=0;
	
	
	if(temp!=null && temp.data==key)//if only one node in list
	{
		head=null;//head element deleted
		System.out.println("Head is Deleted now DLL is empty");
		return;
	}
	while(temp!=null)//traverse till last 
	{
		if(temp.data==key)
		{
			flag=1;
			break;
		}
		n=temp;
		temp=temp.next;
		
	}
	if(flag==1)//if key found
	{
		if(temp.next==null)//if it is last node?
		{
			n.next=temp.next;
			temp.prev=null;
			System.out.println("LAST node Deleted");
		}
		else{
		System.out.println("Element Found");
		n.next=temp.next;//delete node In Between
		temp.next.prev=n;
		temp.next=null;		//make found node pointers Null
		temp.prev=null;	
			
		}
			
	}
	else//if key Not found to delete
	{
		System.out.println("not found to delete ");
		return;
	}
	
	
	
	
}

public static void main(String args[])
{
	dll l1=new dll();
	//l1.head=new Node(10);
//	System.out.println("Form New list ---Enter first Element --");
	//l1.insert();
	int ch,cont;
		
		Scanner sc=new Scanner(System.in);
		do{
	
	System.out.println("-------MENU --------\n1.Display\n2.Insertfirst\n3.InsertLast\n4.InsertBetween\n5.Delete\nEnter Your Choice :: ");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:l1.Display();	
				
				break;
		case 2:
				System.out.println("Enter New Element to ADD -->");
				l1.insertfirst(sc.nextInt());
				
				
				break;
		case 3:
				System.out.println("Element to ADD Last -->");
				l1.insertLast(sc.nextInt());	
				
				break;
		case 4:
				System.out.println("Element to ADD Between -->");
				int data=sc.nextInt();
				System.out.println("After which ->");
				int after=sc.nextInt();
				l1.insertBetween(data,after);
				
				break;
		case 5:
				System.out.println("Element to Delete -->");
				int key=sc.nextInt();	
				l1.delete(key); 
				l1.Display();
				break;
		
		default:
				System.out.println("Wrong Choice");
				
				
	}
	System.out.println(" Do U Want to continue ? (1/0):");
	cont=sc.nextInt();
}while(cont==1);
	
}
}