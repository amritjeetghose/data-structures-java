package com.amritjeet.linkedlist;

public class LinkedList {

    // head of list
    Node head;

    // Linked list Node
    // inner class is made static
    // so that main() can access it
    static class Node{
        int data;
        Node next;
        Node(int i){
            data=i;
            next=null;
        }
    }
    // Method to insert a new node
    public static LinkedList insert(LinkedList list, int data){
        // Create a new node with given data
        Node node= new Node(data);
        // If the Linked List is empty,
        // then make the new node as head
        if(list.head == null){
            list.head=node;
        }else{
            Node last = list.head;
            //traverse till last node encountered
            while(last.next != null){
                last = last.next;
            }
            //assign new node to last node
            last.next=node;
        }
        // Return the list by head
        return list;
    }
    public static void printList(LinkedList list){
        Node currentNode=list.head;
        System.out.println("LinkedList is:");
        while(currentNode.next != null){
            System.out.println(currentNode.data+" ");
            currentNode=currentNode.next;
        }
    }
}
