import java.util.*;
class list{

Node head;
static class Node
{
	int data;
	Node next;
	
	 public Node(int d)
	{
		data=d;
		next=null;
	}
}

public void display()
{
	Node n=head;
	while(n!=null)
	{
		System.out.println(n.data+"-->");
		n=n.next;
	}
	System.out.println("Null");
}

public void insertfirst(int data)
{
	Node newnode=new Node(data);
	newnode.next=head;
	head=newnode;
}
public void insertBetween(int data,int after)
{
	Node n=head;
	int flag=0;
	while(n.next!=null)
	{
	if(n.data==after)
	{
		flag=1;
		break;
		
	}
	n=n.next;
	}
	if(flag==1)
	{
		Node newnode=new Node(data);
		newnode.next=n.next;
		n.next=newnode;
	}
	else{System.out.println("Can't Insert");}
	
	
	
}

public void insertLast(int data)
{
	Node n=head;
	if(head==null)//if list is empty the new node is ur first node
	{
		head=new Node(data);
		return;
	}
	while(n.next!=null)//if list is not emty then traverse to last node and append the new node atLast.
	{
		n=n.next;
	}
	n.next=new Node(data);
	
}

public void insert()
{
	
	Node newnode=new Node(20);
	head=newnode;
}

public void delete(int key)//all dletion condition in one fun
{
	Node temp=head;
	Node prev=null;
	if(temp!=null && temp.data==key)//if only one node in list
	{
		head=temp.next;
		return;
	}
	while(temp!=null&&temp.data!=key)//traverse till desired key not found
	{
		prev=temp;
		temp=temp.next;
		
	}
	if(temp==null)//if key Not found to delete
	{
		
		return;
	}
	prev.next=temp.next;//delete node In Between
	temp.next=null;		//make found node pointer Null so it will point to nowhere(null)
	
	
}

public static void main(String args[])
{
	list l1=new list();
	//l1.head=new Node(10);
	System.out.println("Form New list ---Enter first Element --");
	//l1.insert();
	int ch,cont;
		
		Scanner sc=new Scanner(System.in);
		do{
	
	System.out.println("-------MENU --------\n1.Display\n2.Insertfirst\n3.InsertLast\n4.InsertBetween\n5.Delete\nEnter Your Choice :: ");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1:l1.display();	
				
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
				break;
		
		default:
				System.out.println("Wrong Choice");
				
				
	}
	System.out.println(" Do U Want to continue ? (1/0):");
	cont=sc.nextInt();
}while(cont==1);
	
}
}