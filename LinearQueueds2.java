/*
-implemetation of  queue(linear queue ) datastructure using  java
-implementing linear queue data struture using  "Queue " Interface that implements with "ArrayDeque" class.
-*/

import java.util.ArrayDeque;
import java.util.ArrayDeque;
import java.util.Queue;

public class LinearQueueds2 {
    public static void main(String[] args) {

     //creating linear Queue  using  queue  of  integer  value
         //creating linear Queue  using  queue  interface  that  implements  with ArrayDeque class
         Queue<Integer> queue=new ArrayDeque<Integer>();
         queue.add(10);
         queue.add(20);
         queue.add(30);
         queue.add(40);
         queue.add(50);
         System.out.println("Linear Queue of integer  values  using Arraydeque  class");
         System.out.println(queue);

         //creating linear Queue  using  queue  of  string  value
         //creating linear Queue  using  queue  interface  that  implements  with LinkedList class

          Queue<String> lq2=new ArrayDeque<String>();
         lq2.add("ele");
         lq2.add("sanket");
         lq2.add("gayatri");
         lq2.add("sanika");
         lq2.add("ram");
         System.out.println("Linear Queue of integer  values  using Arraydeque  class");
         System.out.println(lq2);

    }
}
