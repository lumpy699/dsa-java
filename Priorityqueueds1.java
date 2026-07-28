/*
-implemetation of  queue( priority queue ) datastructure using  java
-implementing priority queue data struture using  "priorityQueue class "  class.
-*/


import java.util.PriorityQueue;
import java.util.Queue;

public class Priorityqueueds1 {
    public static void main(String[] args) {
       //creating priority Queue  using  queue  of  integer  value
         //creating   priority Queue  using mim heap  teqniqes  s
         PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
         pq.add(30);
         pq.add(50);
         pq.add(40);  //lowest  value  frist.. sequence  nusar  lavnar  use  min  heap
         pq.add(60);
         pq.add(10);
         pq.add(50);
         System.out.println("priority qoueu of integer  values  ");
         System.out.println(pq);

         //creating linear Queue  using  queue  of  string  value
         //creating linear Queue  using  queue  interface  that  implements  with LinkedList class

          PriorityQueue<String> pq2=new PriorityQueue<String>();
         pq2.add("ram");
         pq2.add("ganesh");
         pq2.add("gayatri");
         pq2.add("abhi");
        pq2.add("raju");
        pq2.add("tom");
        pq2.add("sunil");
         System.out.println("Linear Queue of integer  values  using Arraydeque  class");
         System.out.println(pq2);

    }
}
