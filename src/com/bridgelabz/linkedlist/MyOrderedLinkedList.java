package com.bridgelabz.linkedlist;

public class MyOrderedLinkedList {
    public   INode head;
    public   INode tail;

    public MyOrderedLinkedList(){
            this.head = null;
            this.tail = null;
        }
    public void add(INode newNode) {
        if(this.tail == null){
            this.tail=newNode;
        }
        if(this.head== null){
            this.head=newNode;

        }else{
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
         }
    }
    public  void addSorted(INode newNode) {
        if (this.head == null) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            INode tempNode = this.head;
            if ((tempNode.getKey()).compareTo(newNode.getKey()) > 0) {
                this.head = newNode;
                newNode.setNext(tempNode);
            }
            INode tempNodeT = this.tail;
            if ((tempNodeT.getKey()).compareTo(newNode.getKey()) < 0) {
                tempNodeT.setNext(newNode);
                this.tail = newNode;
            }
            while (tempNode.getNext() != null) {
                if (((tempNode.getKey()).compareTo(newNode.getKey()) < 0) &&
                        (tempNode.getNext().getKey().compareTo(newNode.getKey()) > 0)) {
                    INode tempNode1 = tempNode.getNext();
                    tempNode.setNext(newNode);
                    newNode.setNext(tempNode1);
                }
                tempNode = tempNode.getNext();
            }
        }
    }
    public  void printMyNodes(){
        StringBuffer myNodes = new StringBuffer("My Nodes:");
        INode tempNode = head;
        while(tempNode.getNext()!= null){
            myNodes.append(tempNode.getKey());
            if(!tempNode.equals(tail))
                myNodes.append("->");
                tempNode=tempNode.getNext();
        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }
}


       