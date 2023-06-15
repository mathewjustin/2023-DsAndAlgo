package com.justin.algoexpert.dsalgo.trees;

/**
 * @author Justin Mathew @dev_io
 * Implementation of Binary Search Tree
 */
public class BinarySearchTree {

    Node root;
    class Node{
        int data;
        Node left;
        Node right;
        Node(int data,Node left,Node right)
            {
                this.data=data;
                this.left=left;
                this.right=right;
            }
    }

    public Node insert(Node root,int data)
    {
        if(root==null)
        {
           return new Node(data,null,null);
        }

        if(root.data<data)
        {
            root.left= insert(root.left,data);
        }
        if(root.data>data)
        {
            root.right= insert(root.right,data);
        }

        return root;
    }
    public Node searchNode(Node root,int key)
    {
        if(root==null|| root.data==key)
        {
            return root;
        }

        if(root.data<key)
        {
            return  searchNode(root.left,key);
        }

            return searchNode(root.right,key);
    }
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Inserting nodes
        tree.root = tree.insert(tree.root, 50);
        tree.insert(tree.root, 30);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 60);
        tree.insert(tree.root, 80);

        // Key to be found
        int key = 6;

        // Searching in a BST
        if (tree.searchNode(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");

        key = 60;

        // Searching in a BST
        if (tree.searchNode(tree.root, key) == null)
            System.out.println(key + " not found");
        else
            System.out.println(key + " found");
    }




}
