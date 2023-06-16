package com.justin.algoexpert.dsalgo.linkedlist;

/**
 * @author Justin Mathew @dev_io
 * Program to detect a circular linked list
 */
public class RabbitAndHare {

    static class Node{

    private Node next;
    private int data;
    Node(int data){
        this.data = data;
    }

    }

    public static void main(String[] args) {
        //Create a circular linked list
        Node head = new Node(2);
        Node node1 = new Node(3);
        Node node2 = new Node(4);
        Node node3 = new Node(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = head;

        System.out.println(isCircular(head));
    }

    private static boolean isCircular(Node head) {

        Node rabbit = head;
        Node hare = head;

        while(rabbit != null && hare != null && hare.next != null){
            rabbit = rabbit.next;
            hare = hare.next.next;
            if(rabbit == hare){
                return true;
            }
        }
        return false;

    }
}
