package com.justin.algoexpert.alexpert;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Justin Mathew @dev_io
 * A two pointer problem.
 * Given an array and a number.
 * Objective is to move the occurance of the given element to the end of the array.
 */
public class MoveElementsToTheEndOfArray {


    public static void main(String[] args) {

        List<Integer>arrayOfInteger=new ArrayList<>();
        arrayOfInteger.add(2);
        arrayOfInteger.add(1);
        arrayOfInteger.add(2);
        arrayOfInteger.add(2);
        arrayOfInteger.add(2);
        arrayOfInteger.add(3);
        arrayOfInteger.add(4);
        arrayOfInteger.add(2);
        System.err.println(moveElementToEnd(arrayOfInteger,2));
    }
    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        int leftPointer=0;
        int rightPointer=array.size()-1;


        while (leftPointer<rightPointer)
        {


            if(array.get(leftPointer)==toMove)
            {
                //if both left element and right element are equal then decrement rightpointer and return

                if(array.get(leftPointer)==array.get(rightPointer))
                {
                    rightPointer--;
                    continue ;
                }

                swapLocations(leftPointer,rightPointer,array);
                rightPointer--;
            }
              leftPointer++;

        }
        return array;
    }

    private static void swapLocations(int leftPointer, int rightPointer, List<Integer> array) {

        int temp=array.get(rightPointer);
        array.set(rightPointer,array.get(leftPointer));
        array.set(leftPointer,temp);
    }
}
