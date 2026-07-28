//package LinkedList;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlistds5 {
    static void main() {

        LinkedList <Integer> x= new LinkedList<Integer>();
        x.add(10);
        x.add(20);
        x.add(70);
        x.add(60);
        x.add(10);
        x.add(30);
        System.out.println("Linkedinlist of interger numbers "+x);

//creating ll of Strings
        LinkedList <String> y = new LinkedList <String>();
        y.add("ram");
        y.add("Ganesh");
        y.add("suresh");
        y.add("sham");
        y.add("suresh");
        y.add("raj");
        y.add("muskesh");
        System.out.println("\n Linkedinlist of Strings numbers "+y);

        //sort both linkedlists in ascending order
        //sort using list interface sort() method
        x.sort(null);
        y.sort(null);
        System.out.println("\n Linkedinlist of Integer numbers in sorted order(ascending order) "+y);
        System.out.println("ll of strings in sorted order(descending order) "+x);

        //sort both linkedlists in descending order
        //sort using list interface sort() method
        x.sort(Collections.reverseOrder());
        y.sort(Collections.reverseOrder());
        System.out.println("\n Linkedinlist of Integer numbers in sorted order(ascending order) "+y);
        System.out.println("ll of strings in sorted order(descending order) "+x);

        //Logic 1 (sorting using list interface )

        LinkedList <Integer> x= new LinkedList<Integer>();
        x.add(10);
        x.add(20);
        x.add(70);
        x.add(60);
        x.add(10);
        x.add(30);
        System.out.println("Linkedinlist of interger numbers "+x);

//creating ll of Strings
        LinkedList <String>y = new LinkedList <String>();
        y.add("ram");
        y.add("Ganesh");
        y.add("suresh");
        y.add("sham");
        y.add("suresh");
        y.add("raj");
        y.add("muskesh");
        System.out.println("\n Linkedinlist of Strings numbers "+y);

        //sort both linkedlists in ascending order
        //sort using list interface sort() method
        x.sort(Collection.sort(x,Collection.reverseOrder()));
        y.sort(Collection.sort(y,Collection.reverseOrder()));
        System.out.println("\n Linkedinlist of Integer numbers in sorted order(ascending order) "+y);
        System.out.println("ll of strings in sorted order(descending order) "+x);

        //sort both linkedlists in descending order
        //sort using list interface sort() method
        x.sort(Collections.reverseOrder());
        y.sort(Collections.reverseOrder());
        System.out.println("\n Linkedinlist of Integer numbers in sorted order(ascending order) "+y);
        System.out.println("ll of strings in sorted order(descending order) "+x);

        //Logic 2 (sorting using Collection Interface)






    }








}