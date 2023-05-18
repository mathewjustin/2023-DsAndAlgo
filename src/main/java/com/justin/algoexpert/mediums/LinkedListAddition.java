package com.justin.algoexpert.mediums;

import java.util.LinkedList;
import java.util.List;

/**
 * @author Justin Mathew @dev_io
 */
public class LinkedListAddition {


    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int carry=0;
        ListNode tempNode=new ListNode(0);
        ListNode linkedListToReturn=tempNode;
        while( l1 !=null || l2!=null )
        {
          int v1= l1!=null ? l1.val : 0;
          int v2=  l2 !=null ? l2.val : 0;
          int sum=v1+v2+carry;

          carry=sum/10;

          ListNode node = new ListNode(sum%10);

            linkedListToReturn.next=node;
            linkedListToReturn=linkedListToReturn.next;




            if( l1 !=null) l1=l1.next;
            if( l2 !=null) l2=l2.next;
        }

        if( carry !=0)
        {
            ListNode carryNode=new ListNode(carry);
            linkedListToReturn.next=carryNode;
        }
        return tempNode.next;

    }

    public static void main(String[] args) {

        ListNode l1Node1=new ListNode(9);
        ListNode l1Node2=new ListNode(9);
        ListNode l1Node3=new ListNode(9);

        l1Node1.next=l1Node2;
        l1Node2.next=l1Node3;


        ListNode l2Node1=new ListNode(9);
        ListNode l2Node2=new ListNode(9);


        l2Node1.next=l2Node2;

        addTwoNumbers(l1Node1,l2Node1);
    }
}
