package com.techlabs.prolinkedlist;

public class Node<T> {
	Node<T> next;
	private T data;
	
	public Node() {
		super();
	}
	public Node(T data) {
		super();
		this.next = null;
		this.data = data;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	
	
	
	
	
	
	
	
	
	

}
