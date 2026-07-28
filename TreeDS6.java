
import java.util.TreeSet;
public class TreeDS6{
    public static void main(String[] args) {
        //cratating  frist binary tree(BST)of  Integer  nodes
        
        TreeSet<Integer> btree =new TreeSet <Integer>();
        btree.add(50);
        btree.add(70);
        btree.add(40);
        btree.add(45);
        btree.add(60);
        btree.add(90);
        btree.add(95);
        btree.add(92);
        btree.add(30);
        btree.add(49);
        System.out.println("element of frist binary  tree are :");
        System.out.println(btree);


          //cratating  new binary tree(BST)from above binary tree
           //copy  frist  binary tree into  second/new  binary  tree

        TreeSet<Integer> btree2 =new TreeSet <Integer>(btree);
       
       //he  btree madhale  element btree2 madhye  copy  kele
        System.out.println("\nelement of copied  binary  tree are :");
        System.out.println(btree2);




        

      
        
    }
    
}
