/*program for treemap  collection class(needed  for graph  implementation )
program to  store subject code and markse obtainted for perticulaer student in  key  value  paied  format  and course fees of all corses codected in  pravara  rural collage in  key value paired  format   */
//import java.util.TreeMap;
import java.util.TreeMap;
public class treehashdemo {
public static void main(String[] args) {
TreeMap<Integer,Integer> course= new TreeMap<Integer,Integer>();  //key  is  unic ti  repete hot nehi 

    course.put(301,92);
    course.put(302,95);
    course.put(303 ,93);
    course.put(304 ,87);
     course.put(305 ,97);
   
    System.out.println("elements of hashmap(student  subject code and marks)are  shown below");
    System.out.println(course);

    


}
    
}
