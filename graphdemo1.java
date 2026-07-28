/*program for the  implementation  of  graph  deta  structue
program to  construct the  graph  for follwing  graph  
graph  diagram */
import java.util.ArrayList;// vertex store  karnyasathi  array list use kela/linkedlist
import java.util.TreeMap;//edge  value store  karnyasathi /treemap
public class graphdemo1 {
    public static void main(String[] args) {
        //to  store the  vertiese of diected  graph(vertex)
        // character'' ,string use for vertises
        ArrayList<Character> vg=new ArrayList<Character>();
        vg.add('A');
        vg.add('B');
        vg.add('C');
        vg.add('D');
        vg.add('E');
        System.out.println("vertices of  graph");
        System.out.println(vg);

        //creating hashmap to  store the  edges of  graph
        TreeMap<Character,Character> eg=new TreeMap<Character,Character>();
        eg.put('A','B');
        eg.put('A','C');
        eg.put('B','E');
        eg.put('D','E');
        eg.put('D','B');
        eg.put('D','C');

    System.out.println("edges of  graph"); 
    System.out.println(eg);   
    }
    
}
