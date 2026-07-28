 /* 
 -prrogram to  remove all element to second    binary trees into  second  binary tree.
 -program to  addall elements of  second binary  tree  into frist  binary tree
 -use  of  method: removeAll ()
 */
 import java.util.TreeSet;
public class TreeDS9{
    public static void main(String[] args) {
        //cratating  frist  binary tree(BST).
       
        TreeSet<Integer> btree1 =new TreeSet <Integer>();
        btree1.add(65);
        btree1.add(77);
        btree1.add(44);
        btree1.add(22);
        btree1.add(66);
        btree1.add(11);
        
        btree1.add(80);
        btree1.add(10);
        btree1.add(17);
        System.out.println(" elements of  frist binary tree are");
        System.out.println(btree1);


                //cratating  second  binary tree(BST).
       
        TreeSet<Integer> btree2 =new TreeSet <Integer>();
        btree2.add(50);
        btree2.add(40);
        btree2.add(45);
        btree2.add(90);
        btree2.add(10);
        btree2.add(30);
        btree2.add(49);
       
        System.out.println(" elements of  second binary tree are");
        System.out.println(btree2);



                //removeAll element of, second binary tree from frist  binary tree
                btree1.removeAll(btree2);
                 System.out.println("\nafter merge /add all elements of  frist binary tree are");
        System.out.println(btree1);
       

        
    }
    
}
 
    

