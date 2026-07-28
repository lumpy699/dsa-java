import java.util.ArrayList;

public class arrayds7 {
public static void main (String args[]){

    //creating first array
    ArrayList <String> x =new ArrayList<String>();
    x.add("ram");
    x.add("sham");
    x.add("tom");
    x.add("ganesh");
    x.add("suresh");
    x.add("Muskesh");
    System.out.println("First array elements are : \n"+x);

    //creating second array
    ArrayList <String> y =new ArrayList<String>();
    y.add("Anita");
    y.add("Sunita");
    y.add("Kavita");
    y.add("Deepika");
    System.out.println("\nSecond array elements are : \n"+y);

    //add (merge)/append second array into first array(at the end)
    x.addAll(y);
    System.out.println("\n After add all(), First array elements are :\n" +x);
    //READING /TRAVALSING  FOR  FRIST  ARRAY System.out.println
    System.out.println("element of  frist  array  using  for  frist  loop");
    for(int i=0;i<x.size();i++);
    {
        System.out.println(x.get(i));

        //print the array  in  reverse  order
        System.out.println()
    }



}}