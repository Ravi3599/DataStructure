package com.bridgelabz.linkedlist;

public class OrderedLinkedList {
	    public static void sortLinkedList(Integer ...args){
	        MyOrderedLinkedList myLinkedList = new MyOrderedLinkedList();
	        for (Integer i:args){
	            MyNode<Integer> myNode = new MyNode<>(i);
	            myLinkedList.addSorted(myNode);
	        }
	        System.out.print("Ordered Linked list is: ");
	        myLinkedList.printMyNodes();
	    }
	    public static void main(String[] args) {
	        MyNode<Integer> myFirstNode = new MyNode<>(56);
	        MyNode<Integer> mySecondNode = new MyNode<>(30);
	        MyNode<Integer> myThirdNode = new MyNode<>(70);
	       MyNode<Integer> myFourthNode = new MyNode<>(40);
	        sortLinkedList(56,30,40,70);

	    }

}
