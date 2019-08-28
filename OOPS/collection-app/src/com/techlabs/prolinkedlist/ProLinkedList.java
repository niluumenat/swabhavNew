package com.techlabs.prolinkedlist;

public class ProLinkedList<T> {
	private Node<T> head;
	private Node<T> next;

	public void add(T data) {
		Node<T> temp = new Node<T>();
		temp.setData(data);
		if (head == null) {
			head = temp;
			next = temp;
		} else {
			next.setNext(temp);
			next = temp;
		}
	}

	public void display() {
		Node<T> tmp = head;
		while (tmp != null) {
			System.out.println("Data: " + tmp.getData());
			tmp = tmp.getNext();
		}
	}

	public void remove(T remove) {
		Node<T> current = head;
		
		if(current!=null && current.getData()==remove){
			head=current.getNext();
		}
		
		Node<T> temp = head,prev = null;
		
		while(temp.getNext()!=null ){
			if(temp.getNext().getData()==remove){
				prev=temp.getNext();
				next=prev.getNext();
			
			}
			temp=temp.getNext();	
		}
	}

}
