//implememation of array ds using collection class
// Array Sata Structure using ArrayList Collection class
// program for: creating dynamic array add elements,diaplay the array

import java.util.ArrayList;
class student
{
    int rollno;
    String name;
    double feespaid;

    student(){
        rollno = 5;
        name = "sham patil";
        feespaid = 25000;

    }
}

public class arrayds1{

    public static void main (String args[]) {
        // Creating Interger Array Ds(dynamic Array) using ArrayList Collection
    ArrayList <Integer> ar1 = new ArrayList();
        ar1.add(10);
        ar1.add(20);
        ar1.add(30);
        ar1.add(40);
        ar1.add(50);
        System.out.println("Elements of Integer Array are stored below\n" + ar1);
        System.out.println("--------------------------------------------------------");

        // Creating Float Array Ds(dynamic Array) using ArrayList Collection
        ArrayList <Float> ar2 = new ArrayList();
        ar2.add(10f);
        ar2.add(20f);
        ar2.add(30f);
        ar2.add(40f);
        ar2.add(50f);
        System.out.println("Elements of Float Array are stored below\n" + ar2);
        System.out.println("--------------------------------------------------------");

        // Creating Character Array Ds(dynamic Array) using ArrayList Collection
        ArrayList <Character> ar3 = new ArrayList();
        ar3.add('A');
        ar3.add('b');
        ar3.add('Y');
        ar3.add('w');
        ar3.add('9');
        ar3.add('+');
        System.out.println("Elements of Character Array are stored below\n" + ar3);

        // Creating Double Array Ds(dynamic Array) using ArrayList Collection
        ArrayList <Double> ar4 = new ArrayList();
        ar4.add(10.0);
        ar4.add(20.0);
        ar4.add(30.0);
        ar4.add(40.0);
        ar4.add(50.0);
        System.out.println("Elements of Float Array are stored below\n" + ar4);
        System.out.println("--------------------------------------------------------");

        // Creating String Array Ds(dynamic Array) using ArrayList Collection
        ArrayList <String> ar5 = new ArrayList <> ();
        ar5.add("Omkar");
        ar5.add("pranit");
        ar5.add("sanket");
        ar5.add("shruti");
        ar5.add("om");
        System.out.println("Elements of String Array are stored below\n" + ar5);
        System.out.println("--------------------------------------------------------");

        // Creating object type of Array Ds(dynamic Array) using ArrayList Collection
        //Creating array to store any datatype of values of objects
        ArrayList <Object> x = new ArrayList <Object> ();
        x.add(25);
        x.add(7.3f);
        x.add('A'); 
        x.add(200.75);
        x.add("shruti");
        Integer obj1 = new Integer(500);
        x.add(obj1);
        String obj2 = new String("ram patil");
        x.add(obj2);
        student obj3 = new student();
        x.add(obj3);
        
        System.out.println("Elements of Object Array are stored below\n" + x);
        System.out.println("--------------------------------------------------------");

    }
}