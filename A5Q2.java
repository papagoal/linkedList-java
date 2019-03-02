/**QUESTION 2
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment05
 * @author       Danhang Liu, 7716234
 * @version      2015-07-29    
 */
public class A5Q2{
  final int NUM = 100;
  public static void main(String[] args){
    LinkedList a = new LinkedList();
    a.add("p");
    a.add("a");
    a.add("b");
    a.add("c");
    a.add("b");
    a.remove(0);
    a.remove(9);
    a.set(0,"d");
    System.out.println("list:\n"+a.toString());
    System.out.println(a.get(0));   
    System.out.println(a.indexOf("e")); 
    System.out.println(a.indexOf("b")); 
    System.out.println(a.lastIndexOf("b")); 
    System.out.println(a.size()); 
    
    //Testing add operations
    System.out.println("\nTesting add operations:");
    LinkedList list = new LinkedList();//creat a LinkedList object
    String[] numAdd ={"10","20","30","40","50","60"};
    for(int i=0;i<numAdd.length;i++){
     list.add(numAdd[i]); 
    }
    System.out.println("list:\n"+list.toString());//print the list
    //Testing remove operations
    System.out.println("\nTesting remove operations:");
    int oriSize = list.size();
    int[] numList = {-1,0,1,2,3,4,5,8};
    for(int i=0;i<numList.length;i++){
      list.remove(numList[i]);
      if(oriSize!=list.size()){
       oriSize--; 
       System.out.println("remove position: "+numList[i]);
      }
      else{
        System.out.println("Invalid remove position: "+numList[i]);
      }
    }
    System.out.println("list:\n"+list.toString());//print the list
    
    //Testing indexOf()
    System.out.println("\nTesting indexOf operations:");
    LinkedList list2 = new LinkedList();//creat a LinkedList object
    list2.add("60");list2.add("60");list2.add("70");list2.add("80");
    list2.add("90");list2.add("60");list2.add("80");list2.add("90");
    String[] numList2 = {"50","60","70","80","90","100"};
    for(int i=0;i<numList2.length;i++){
      System.out.println(numList2[i]+" postion: "+list2.indexOf(numList2[i]));
    }
    System.out.println("list2:\n"+list2.toString());//print the list2
    
    //Testing lastIndexOf()
    System.out.println("\nTesting lastIndexOf operations:");
    for(int i=0;i<numList2.length;i++){
      System.out.println(numList2[i]+" postion: "+list2.lastIndexOf(numList2[i]));
    }
    System.out.println("list2:\n"+list2.toString());//print the list2
    
    //Testing set operations
    System.out.println("\nTesting set operations:");
    for(int i=0;i<numList2.length/2;i++){
     list2.set(i,"$"+numList2[i]); 
    }
    System.out.println("list2:\n"+list2.toString());//print the list2
  }
}