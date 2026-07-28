import java.util.TreeSet;
import java.util.Set;
public class TreeDS2 {
    public static void main(String[] args) 
    {
     // creating binary tree(BST) of integer nodes 
     //  using set interface, that implements with  Using TreeSet Collection class   
    Set <Integer> btree=new TreeSet<Integer>();
    btree.add(50);
    btree.add(70);
    btree.add(40);
    btree.add(45);
    btree.add(60);
    btree.add(20);
    btree.add(90);
    btree.add(95);
    btree.add(80);
    btree.add(10);
    btree.add(30);
    btree.add(65);
    btree.add(49);
    System.out.println("Binary tree in inorder format "+btree);
     
    // creating binary tree(BST) of single charachters  nodes 
     //  using set interface, that implements with  Using TreeSet Collection class   
    Set <Character> btree2=new TreeSet<Character>();
    btree2.add('H');
    btree2.add('K');
    btree2.add('C');
    btree2.add('J');
    btree2.add('E');
    btree2.add('A');
    btree2.add('M');
    btree2.add('B');
    btree2.add('X');
    System.out.println("\nBinary tree in inorder format "+btree2);

         // creating binary tree(BST) of Strings nodes 
     //  using set interface, that implements with  Using TreeSet Collection class   
    Set <String> btree3=new TreeSet<String>();
    btree3.add("ram");
    btree3.add("ganesh");
    btree3.add("tom");
    btree3.add("bantee");
    btree3.add("ganpati");
    btree3.add("sham");
    btree3.add("waman");
    btree3.add("chotu");
    btree3.add("shivam");
    System.out.println("\nBinary tree in inorder format "+btree3);
    }
} 