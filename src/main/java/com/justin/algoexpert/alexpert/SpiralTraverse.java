package com.justin.algoexpert.alexpert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author Justin Mathew @dev_io
 *
 * Write a function that takes in an n X m two - dimensional array and returns a one - dimenstionsl array of all the
 * array's elements in spiral order.
 *
 * Spiral order starts at the top left corner of the two-dimensional array, goes to the right, and proceeds in a spiral pattern
 * all the way until every element has been visited.
 *
 */
public class SpiralTraverse {

    /**
     *
     * Its all about traversing the outer perimeter of the array.
     * We have all the information we need to traverse the perimeter.
     * Starting Raw  , Ending Rqw, Starting Column, Ending Column // Initialize this variables.
     * This is a simple problem but this is a good candidate to test the ability to convert logic into code.
     * No fancy algos here.
     * @param args
     */
    public static void main(String[] args) {

        int array[][]=new int[][]{{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        System.err.println(spiralTraversal(array));
    }



    public static  List<Integer> spiralTraversal(int [][] array)
    {

        if(array.length==0)
        {
            return  Collections.emptyList();
        }

        List result=new ArrayList<Integer>();
        int startRow=0;
        int endRow=array.length-1;
        int startCol=0;
        int endCol=array[0].length-1;

        while(startRow<=endRow&&startCol<=endCol){

            for(int col=startCol;col<=endCol;col++)
            {
                result.add(array[startRow][col]);
            }
            for(int row=startRow+1;row<=endRow;row++)
            {
                result.add(array[row][endCol]);
            }
            for(int col=endCol-1;col>=startCol;col--)
            {
                //Single row in the middle of the matrix.
                if(startRow==endRow)
                {
                    break;
                }
                result.add(array[endRow][col]);
            }
            for(int row=endRow-1;row>startRow;row--)
            {
                //Single column in the middle of the matrix.
                if(startCol==endCol)
                {
                    break;
                }
                result.add(array[row][startCol]);
            }
            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }
        return result;

    }
}
