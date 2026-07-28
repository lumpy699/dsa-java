public //package LinkedList;

//import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class linkedlistds7{
    static void main() {

        LinkedList <Integer> x= new LinkedList<Integer>();
        x.add(45);
        x.add(20);
        x.add(70);
        x.add(40);
        x.add(10);
        x.add(40);
         x.add(30);
        System.out.println("Linkedinlist of interger numbers "+x);

//creating ll of Strings
        LinkedList <String> y = new LinkedList <String>();
        y.add("ram");
        y.add("Ganesh");
        y.add("suresh");
        y.add("sham");
        y.add("suresh");
        y.add("raj;");
        y.add("ganesh;");
        y.add("ganesh");
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

       //searching 40 in  linkedlist  of  integer  number
       int c1; 
       for(int i=0; i<x.size();i++)
         {
            if x.get(i)
            c1++;
            if(c1==0)
            {
                System.out.println("element  40  is  not  found/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of 40: " +c1);
            }    
            else{
            if x.get(i)
            c1++;
            if(c1==0)
            {
                System.out.println("element  40  is    found/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of 40: " +c1);






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

       //searching 50 in  linkedlist  of  integer  number
       int c2; 
       for(int i=0; i<x.size();i++)
         {
            if( x.get(i))
            c2++;
            if(c2==0)
            {
                System.out.println("element  50  is  not  found/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of 50: " +c2);
            }    
            else{
            if x.get(i)
            c2++;
            if(c2==0)
            {
                System.out.println("element  50  is    found/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of 50: " +c2);


                 //searching ganesh in  linkedlist  of strings
       int c3; 
       for(int i=0; i<y.size();i++)
         {
            if( y.get(i)=("ganesh");
            c3++;
            if(c3==0)
            {
                System.out.println("element  ganesh  is  not  found in  string/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of 50: " +c3);
            }    
            else{
            if( x.get(i))
            c3++;
            if(c3==0)
            {
                System.out.println("element  ganesh  is    found/exist in  linkedlist  of  strings ");
                System.out.println("occanace of ganesh: " +c3);


                  //searching ganapati in  linkedlist  of strings
       int c4; 
       for(int i=0; i<y.size();i++)
         {
            if( y.get(i)=("ganapati");
            c4++;
            if(c4==0)
            {
                System.out.println("element  ganapati  is  not  found in  string/exist in  linkedlist  of  integers  number ");
                System.out.println("occanace of ganapati: " +c4);
            }    
            else{
            if( x.get(i))
            c4++;
            if(c4==0)
            {
                System.out.println("element  ganpati  is    found/exist in  linkedlist  of  strings ");
                System.out.println("occanace of ganapati: " +c4);
            }    

         }



    }








} 
    

