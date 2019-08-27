package com.techlabs.prolinkedlist;

public class Node<T> {
	private Node<T> next;
	private T data;
	public Node( T data) {
		super();
		next = null;
		data = data;
	}
	public Node(Node<T> next, T data) {
		super();
		next = next;
		data = data;
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
