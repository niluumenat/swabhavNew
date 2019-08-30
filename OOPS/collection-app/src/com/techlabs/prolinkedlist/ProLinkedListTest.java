package com.techlabs.prolinkedlist;

public class ProLinkedListTest {

	public static void main(String[] args) {
		ProLinkedList<Integer> list=new ProLinkedList<Integer>();
		list.insert(10);
		list.insert(15);
		list.insert(30);
		list.insert(19);
		list.insert(40);
		
		list.display();
		
		list.removeAt(4);
		
		list.display();
		
		list.countNoOfNodes();
		
		ProLinkedList<String> list1=new ProLinkedList<>();
		list1.insert("nil");
		list1.insert("hellooo");
		
		list1.display();
		
		list1.removeAt(0);
		
		list1.display();
		
		list1.countNoOfNodes();
	}

}
