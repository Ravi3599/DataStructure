package com.bridgelabz.queue;

public interface INode<K extends Comparable> {
        K getKey();
        void setKey();

        INode getNext();
        void setNext(INode tempNode);
}
