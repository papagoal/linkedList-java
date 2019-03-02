/**QUESTION 1
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment05
 * @author       Danhang Liu, 7716234
 * @version      2015-07-29    
 */
import java.util.Arrays;
public class A5Q1
{
 public static void main(String[] parms)
 {
  processList();

  System.out.println("\nProgram completed normally.");
 }

 public static void processList()
 {
  int[] list = new int[] {20, 50, 30, 10, 60, 40};

  System.out.println("\n" +Arrays.toString(list));
  sort(list);
  System.out.println("\n" +Arrays.toString(list));
 }

 public static void sort(int[] list)
 {
  int position;

  for (position=1; position<list.length; position++)
  {
   insert(list, list[position], position);
  }
 }

 public static void insert(int[] list, int element, int position)
 {
   if (position > 0 && list[position - 1] > element) {
     int temp = element;
     list[position] = list[position-1];
     list[--position] = temp;
     insert(list, list[position], position);
   }
 }
}

/*
*/
