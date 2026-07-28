 /* 
 -prrogram to  compare two  binary trees.
 -program to  check  wheather two binary  tree =/same
 -use  of  method: equal()
 */
 import java.util.TreeSet;
public class TreeDS7 {
    public static void main(String[] args) {
        //cratating  frist  binary tree(BST).
       
        TreeSet<Integer> btree1 =new TreeSet <Integer>();
        btree1.add(65);
        btree1.add(70);
        btree1.add(40);
        btree1.add(44);
        btree1.add(66);
        btree1.add(90);
        btree1.add(95);
        btree1.add(92);
        btree1.add(30);
        btree1.add(49);
        System.out.println(" elements of  frist binary tree are");
        System.out.println(btree1);


                //cratating  second  binary tree(BST).
       
        TreeSet<Integer> btree2 =new TreeSet <Integer>();
        btree2.add(50);
        btree2.add(50);
        btree2.add(50);
        btree2.add(70);
        btree2.add(40);
        btree2.add(45);
        btree2.add(60);
        btree2.add(90);
        btree2.add(95);
        btree2.add(92);
        btree2.add(30);
        btree2.add(49);
        System.out.println(" elements of  second binary tree are");
        System.out.println(btree2);



                //cratating  third binary tree(BST).
       
        TreeSet<Integer> btree3 =new TreeSet <Integer>();
        btree3.add(50);
        btree3.add(70);
        btree3.add(40);
        btree3.add(45);
        btree3.add(60);
        btree3.add(90);
        btree3.add(95);
        btree3.add(92);
        btree3.add(30);
        btree3.add(49);
        System.out.println(" elements of  third binary tree are");
        System.out.println(btree3);

        //comparing frist and second  binary  tree, checking equal /same?
         if(btree1.=(btree2))
            System.out.println("\n frist and  second  binary tree are  same / equal");
        else
             System.out.println("\n frist and  second  binary tree are  same / equal");



           //comparing frist and second  binary  tree, checking equal /same?
         if(btree2.=(btree3))
            System.out.println("\n  second and  third binary tree are  same / equal");
        else
             System.out.println("\n  second and  third binary tree are  same / equal");
        
        

        
    }
    
}
 
    

