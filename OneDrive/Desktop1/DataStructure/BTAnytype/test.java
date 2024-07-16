/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lec20.BTAnytype;

public class test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //  BinaryTree T = new BinaryTree(); // Empty tree

        // BinaryNode myNode = new BinaryNode(100);
        // BinaryTree T = new BinaryTree(myNode);
        
        
        // BinaryNode x = T.getRoot();
        // System.out.println(x.getElement());

        BinaryTree T = new BinaryTree(19); // create a BinaryNode (Root) while creating the BT
        
        BinaryNode n1 = new BinaryNode(20);
        T.getRoot().setLeft(n1);
        
        BinaryNode n2 = new BinaryNode(21);
        T.getRoot().setRight(n2);
        
        BinaryNode n3 = new BinaryNode(100);
        BinaryNode n4 = new BinaryNode(200);

        n1.setLeft(n3);
        n2.setRight(n4);
        
        int NBofNodes = T.Size();
        System.out.println(NBofNodes);
    }

}
