package com.techlabs.collection.node.test;

import com.techlabs.collection.node.Node;

public class NodeTest {

	public static void main(String[] args) {
		Node<Integer> node1 = new Node<>();
		node1.setData(100);

		Node<Integer> node2 = new Node<>();
		node2.setData(200);

		Node<Integer> node3 = new Node<>();
		node3.setData(300);
		
		node1.setNext(node2);
		node2.setNext(node3);
		node3.setNext(null);

		printDetails(node1);

	}

	private static void printDetails(Node<Integer> node) {
		while (node != null) {
			System.out.println("Data: " + node.getData());
			node = node.getNext();
		}

	}

}
