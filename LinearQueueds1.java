/*
-implemetation of  queue(linear queue ) datastructure using  java
-implementing linear queue data struture using  "Queue " Interface that implements with "LinkedList" class.
-*/

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class LinearQueueds1 {
    public static void main(String[] args) {
      /*   ram class
        shyam  Interface
        ram obj=new ram(); this  statemet creat obj  of  class--eszly  run 
        shyam ref=new shyam();  interface asel tr tyacha   obj  create  karu   shakat  nahii tyala  implement  kel  jat 
        shyam ref; this  is  correct  way  to instanciate ---referace  throw  class  implement karava lagato
        
        ref= new ram (); shyam cha interface  ha  ram class  sobat  implemet kela
         
        method 2 or
        shyam  ref=new ram(); dhoni ch  function  akach  aahe  te  je  work  kart he pn  tech  karta */


        //creating linear Queue  using  queue  of  integer  value
         //creating linear Queue  using  queue  interface  that  implements  with LinkedList class
         Queue<Integer> queue=new LinkedList<Integer>();
          //interface  //referace     class
           queue.add(10);
         queue.add(20);
         queue.add(30);
         queue.add(40);
         queue.add(50);
         System.out.println("Linear Queue of integer  values  using linkedlist class");
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
