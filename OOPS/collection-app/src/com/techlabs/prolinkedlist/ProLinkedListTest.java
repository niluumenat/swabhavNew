package com.techlabs.prolinkedlist;

public class ProLinkedListTest {

	public static void main(String[] args) {
		ProLinkedList<Integer> list=new ProLinkedList<Integer>();
		list.add(100);
		list.add(200);
		list.add(300);
		list.add(400);
		
		list.display();	
		
		list.remove(300);
		
		list.display();
	}

}
