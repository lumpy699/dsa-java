/*
-implemetation of  deque(double ended queue ) datastructure using  java
-implementing deque data struture using  "DeQueue " Interface that implements with "ArrayDeque" class.
-*/

import java.util.ArrayDeque;
//import java.util.ArrayDeque;
import java.util.Queue;

public class Dequeueds1 {
    public static void main(String[] args) {

     //creating Double  ended  Queue  using   of  integer  value
         //creating Double ended Queue  using   interface  that  implements  with ArrayDeque class
         ArrayDeque<Integer> dq=new ArrayDeque<Integer>();
         dq.add(10);
         dq.add(20);
         dq.add(30);
         dq.add(40);
         dq.add(50);
         System.out.println("Double  ended  Queue of integer  values  using Arraydeque  class");
         System.out.println(dq);

         //creating double ended Queue  using  queue  of  string  value
         //creating double ended  using  queue  interface  that  implements  with Arraydique class

          Queue<String> dq2=new ArrayDeque<String>();
         dq2.add("ele");
         dq2.add("sanket");
         dq2.add("gayatri");
         dq2.add("sanika");
         dq2.add("ram");
         System.out.println("Linear Queue of integer  values  using Arraydeque  class");
         System.out.println(dq2);

    }
}
