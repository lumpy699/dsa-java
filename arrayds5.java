import java.util.ArrayList;
public class arrayds5 {
    public static void main(String args[]){
        // Creating Integer Array (Dynamic array)using ArrayList Collection
        ArrayList<Integer> myarray= new ArrayList<>();

       //Count Number of elements in array(finding array length)
        System.out.println("Number of elements in array :\n"+ myarray.size());

        //Checking is array empty
        if (myarray.isEmpty())
            System.out.println("Yes, Array is empty");
        else
            System.out.println("No, Array is Not empty");


        //append (add to the end) Element in array
        myarray.add(10);
        myarray.add(20);
        myarray.add(30);
        myarray.add(40);

        //Print the array
        System.out.println("array elements are :\n"+ myarray);

        //Count Number of elements in array(finding array length)
        System.out.println("Number of elements in array :\n"+ myarray.size());

        //Checking is array empty
        if (myarray.isEmpty())
            System.out.println("Yes, Array is empty");
        else
            System.out.println("No, Array is Not empty");

        //Insert new element in array
        myarray.add(3,33);
        myarray.add(5,77);
        myarray.add(0,25);

        System.out.println("After Insert,Current Array elements are :\n"+ myarray);

        //add new element in the beginning of array
        myarray.addFirst(35);
        System.out.println("After add First,Current Array elements are :\n"+ myarray);

        //add new element in the ending of array
        myarray.addLast(99);
        System.out.println("After add last,Current Array elements are :\n"+ myarray);

        //set (add) element in array
        myarray.set(4,66);
        System.out.println("After set last,Current Array elements are :\n"+ myarray);

        //remove parricular element from array
        myarray.remove(4);
        System.out.println("After remove,Elements of are :\n"+ myarray);

        //remove first element pof array
        myarray.removeFirst();
        System.out.println("After remove First,Elements of array are :\n"+ myarray);
          System.out.println("remove  element");

          //remove  perticular  element from  array
          myarray.remove(Integer.valueOf(77));
          System.out.println("After remove remove 77:\n"+ myarray);
          System.out.println("remove  element");

           //remove Last element from array
        myarray.removeLast();
        int n2;
        n2=myarray.removeLast();
        System.out.println("After remove last,Elements of array are :\n"+ myarray);
          System.out.println("remove  element");

          //remove  all element from  array 
          myarray.clear();
           System.out.println("After clear Elements of array are :\n"+ myarray);
          System.out.println("remove  element");
           System.out.println("Number of elements in array :\n"+ myarray.size());



            if (myarray.isEmpty())
            System.out.println("Yes, Array is empty");
        else
            System.out.println("No, Array is Not empty");




         //crate element  in  array
        myarray.add(10);
        myarray.add(20);
        myarray.add(30);
        myarray.add(20);
         myarray.add(70);
          myarray.add(80);
             myarray.add(50);
          

        //Print the array
        System.out.println("array elements are :\n"+ myarray);

        //Count Number of elements in array(finding array length)
        System.out.println("Number of elements in array :\n"+ myarray.size());

        //finding index  of  perticular element
        System.out.println("Index of 20 is: "+myarray.indexOf(20));
         System.out.println("Index of 77 is: "+myarray. indexOf(77));
         System.out.println("Index of 80 is: "+myarray.indexOf(80));

           //finding lastindex  of  perticular element
        System.out.println("lastIndex of 20 is: "+myarray.lastIndexOf(20));
         System.out.println("lastIndex of 77 is: "+myarray. lastIndexOf(77));
         System.out.println("lastIndex of 80 is: "+myarray.lastIndexOf(80));





         //read/get  pessifide index of  array
         System.out.println("Third element: "+myarray.get(2));
         int n3;
         n3=myarray.get(4);
         System.out.println("Fifth element: "+n3 );

        //get FRIST element of  array
         System.out.println("Frist element: "+myarray.getFrist());
         
        int n4=myarray.getFrist();
         System.out.println("Frist element: "+n4 );


         //get Last element of  array
         System.out.println("Last element: "+myarray.getLast());
         
        int n5=myarray.getLast();
         System.out.println("Frist element: "+n5 );


         //search perticular  element  in  array 
         if(myarray.contains(77))
            System.out.println("Yes 77 is  found  in  array");
        else
             System.out.println("NO 77 is  found  in  array");

             if(myarray.contains(30))
            System.out.println("Yes 30 is  exist/Found  in  array");
        else 
             System.out.println("NO 30 does not exist in  array");













    }
}