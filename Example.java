import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.LinkedBlockingDeque;

 public class Example 
 {
      public static void main(String args[]) 
      {
            Date d1 = new Date (99, 11, 31);
            Date d2 = new Date (99, 11, 31);

            method(d1, d2);
            
            List<Integer> list = new LinkedList<Integer>();
            list.add(4);
            list.add(14);
            list.add(24);
            list.add(34);
            
            go(list); 
            
            Iterator iter = list.iterator();
            while(iter.hasNext())
            {
            	System.out.print(iter.next() + ",");
            }
            System.out.println("d1 is " + d1 + "\nd2 is " + d2);
      }
     
      public static void method(Date d1, Date d2) 
      {
            d2.setYear (100);
            d1 = d2;
      }
      
      public static void go(List a)
      {
    	  a.add(40);
    	  a.add(80);
    	  a.add(140);
    	  a.add(240);
      }
}