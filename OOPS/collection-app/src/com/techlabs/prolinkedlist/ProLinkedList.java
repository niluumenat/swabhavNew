package com.techlabs.prolinkedlist;

public class ProLinkedList<T> {
	private int count;
	private Node<T> head;
	
	public ProLinkedList(){
		
	}
	public void add(T data){
		if(head==null){
			head=new Node<T>(data);
		}
		Node<T> temp=new Node<T>(data);
		Node<T> current =head;
		
		if(current!=null){
			Node<T> node=new Node<T>(data);
			while(node.getNext()!=null){

			}
		}
		
		
		
	}

}
