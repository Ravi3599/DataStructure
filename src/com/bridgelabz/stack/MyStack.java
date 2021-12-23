package com.bridgelabz.stack;

public class MyStack {
	private final MyLinkedList myLinkedList;
	
	public MyStack() {
		this.myLinkedList = new MyLinkedList();
	}
	public void push(INode newNode) {
		myLinkedList.add(newNode);
	}
	public void printStack() {
		myLinkedList.printMyNodes();
	}
}
