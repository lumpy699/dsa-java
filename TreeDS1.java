import java.util.TreeSet;
public class TreeDS1 {
    public static void main(String[] args) {
        //cratating  binary tree(BST)of  Integer  nodes
        //using TreeSet collection class
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
        System.out.println("binary tree in   inorder  format");
        System.out.println(btree);
        

        //cratating  binary tree(BST)of Single  characters 
        //using TreeSet collection class
        TreeSet<Character> btree2 =new TreeSet <Character>();
        btree2.add('H');
        btree2.add('K');
        btree2.add('C');
        btree2.add('J');
        btree2.add('E');
        btree2.add('A');
        btree2.add('M');
        btree2.add('B');
        btree2.add('X');
        btree2.add('S');
        System.out.println("binary tree in   inorder  format");
        System.out.println(btree2);


          //cratating  binary tree(BST)of STRINGS 
        //using TreeSet collection class
        TreeSet<String> btree3 =new TreeSet <String>();
        btree3.add("ram");
        btree3.add("ganesh");
        btree3.add("tom");
        btree3.add("bantee");
        btree3.add("ganpati");
        btree3.add("shyam");
        btree3.add("waman");
        btree3.add("chotu");
        btree3.add("shivam");
        btree3.add("sanket");
        System.out.println("binary tree in   inorder  format");
        System.out.println(btree3);
        
    }
    
}
