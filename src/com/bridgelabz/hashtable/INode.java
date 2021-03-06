package com.bridgelabz.hashtable;


public interface INode<K> {
    K getKey();
    void setKey();

    INode getNext();
    void setNext(INode<K> tempNode);
}