import java.util.TreeSet;
import java.util.ArrayList;
public class Treeds4{
    public static void main(String[] args) {
        //cratating array of integer  value using  array list  collection 
      
        ArrayList<Integer> arr1 =new ArrayList<Integer>();
        arr1.add(50);
        arr1.add(70);
        arr1.add(40);
        arr1.add(45);
        arr1.add(60);
        arr1.add(90);
        arr1.add(95);
        arr1.add(92);
        arr1.add(30);
        arr1.add(49);
        System.out.println("array  of integer");
        System.out.println(arr1);
        

      


          //cratating dynamic array of STRINGS  using arraylist
        //using TreeSet collection class
         ArrayList<String> arr2 =new  ArrayList <String>();
        arr2.add("ram");
        arr2.add("ganesh");
        arr2.add("tom");
        arr2.add("bantee");
        arr2.add("ganpati");
        arr2.add("shyam");
        arr2.add("waman");
       arr2.add("chotu");
        arr2.add("shivam");
       arr2.add("sanket");
        System.out.println("array of  strings");
        System.out.println(arr2);

        //creating binary tree (BST)from an  array  arr1 (ArrayList collections)
        TreeSet<Integer>btree1=new TreeSet<Integer>(arr1);
         System.out.println("\n binary tree element(created from frist array )");
        System.out.println(btree1);

         //creating binary tree (BST)from an  array  arr2 (ArrayList collections)

         TreeSet<String>btree2=new TreeSet<String>(arr2);
         System.out.println("\n binary tree element(created from second array )");
        System.out.println(btree2);

        
    }
    
}
 
    

