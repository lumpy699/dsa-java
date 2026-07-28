public  /* 
 -prrogram to  check all element  weather  frist  ball elment to second    binary trees  are exist tointo  second  binary tree.
 - -prrogram to  check all element  weather  frist  b binary tree is  super  set  of  second  binary  tree
 -prrogram to  check all element  weather  second b binary tree is  subset  of  frist  binary  tree
 -use  of  method: containsAll ()
 */
import java.util.TreeSet;
public class TreeDS10{
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



                //checking Superset ? cheking subset
                //checking  wheather all element of  second  binary  tree  are  exist  into  frist  binary  tree
                if(btree1.containsAll(btree2))
                {
                    System.out.println("\n yes, all elements of second  binary tree /found in frist binary tree"); 
                      System.out.println("\n yes, all elements of second  binary tree /found in frist binary tree"); 
                
                
                     System.out.println("\n yes,  scond  binary tree is subset of  frist  binary treeinary tree ");
                else
                    System.out.println("\n yes, all elements of second  binary tree /found in frist binary tree"); 
                      System.out.println("\n  yes,  second  binary tree is not subset of  frist  binary tree tree"); 
                
                
                     System.out.println("\n yes,  second  binary tree is not subset of  frist  binary tree tree ");




                      //cratating  second  binary tree(BST).
       
        TreeSet<Integer> btree3 =new TreeSet <Integer>();
        btree3.add(50);
        btree3.add(40);
        btree3.add(45);
        btree3.add(9);
        btree3.add(10);
        btree3.add(30);
        btree3.add(49);
       
        System.out.println(" elements of  second binary tree are");
        System.out.println(btree3);



                //checking Superset ? cheking subset
                //checking  wheather all element of  third  binary  tree  are  exist  into  frist  binary  tree
                if(btree1.containsAll(btree3))
                {
                    System.out.println("\n yes, all elements of third  binary tree /found in frist binary tree"); 
                      System.out.println("\n yes, all elements of third  binary tree /found in frist binary tree"); 
                     System.out.println("\n yes,  third  binary tree is subset of  frist  binary treeinary tree ");
                else
                    System.out.println("\n yes, all elements of third binary tree /found in frist binary tree"); 
                      System.out.println("\n  yes,  third binary tree is not subset of  frist  binary tree tree"); 
                
                
                     System.out.println("\n yes,  third  binary tree is not subset of  frist  binary tree tree ");




                }
               
       

        
    }
    
}
 
    

 
    

