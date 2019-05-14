package com.frankie.computerscience.datastructures.singlylinkedlist;

public class LinkedListMain {
    public static void main(String[] args){
        LinkedList myList = new LinkedList();
        myList.append(1);
        myList.append(3);
        myList.append(7);
        myList.append(3);
        System.out.println("---------[1,3,7,3]---------");
        myList.printList();
        myList.deleteValue(3);
        System.out.println("---------removed 3----------");
        myList.printList();
        myList.reverse();
        System.out.println("----------reversed-----------");
        myList.printList();
    }
}
