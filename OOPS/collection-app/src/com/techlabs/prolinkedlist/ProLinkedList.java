package com.techlabs.prolinkedlist;

public class ProLinkedList<T> {
	private Node<T> head;
	private int count;
	
	public void insert(T data){
		Node<T> node=new Node<T>();
		node.data=data;
		
		if(head==null){
			head=node;
		}
		else{
			Node<T> n=head;
			while(n.next!=null){
				n=n.next;
			}
			n.next=node;
		}
		count++;
		
	}
	
	public void removeAt(int index){
		if(index==0){
			head=head.next;
		}
		else{
			Node<T> n=head;
			Node<T> prev=null;
			for(int i=0;i<index-1;i++){
				n=n.next;
			}
			prev=n.next;
			n.next=prev.next;
			System.out.println("removing "+ prev.data);
		}
		count--;
	}
	
	public void display(){
		Node<T> node=head;
		while(node.next!=null){
			System.out.println(node.data);
			node=node.next;
		}
		System.out.println(node.data);
	}
	
	public void countNoOfNodes(){
		System.out.println("No of nodes: "+count);
	}


}