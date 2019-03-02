/**QUESTION 3
 * COMP 1020 SECTION A01
 * INSTRUCTOR    Amirhossein
 * ASSIGNMENT    Assignment05
 * @author       Danhang Liu, 7716234
 * @version      2015-07-29    
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.*;
public class A5Q3V1{
  public static void main(String[] args){
     
//     int[] arr = {1,2,3,4,5,1,7,9,9,10,48,49,52,45,18,46,23,25,25,99,89,56,99,23,9};
    int[] arr = {1,2,3,4,5,1,2,4,5,6,7,99,45,23,45,66,23};
     matrix mat = new matrix(arr.length);
     System.arraycopy(arr,0,mat.array,0,arr.length);
     System.out.println(Arrays.toString(mat.array));
     mat.print();
     mat.check(mat.newArr); 
  }  
}
class matrix{
  private int num;
  protected int[] array;
  protected int[][] newArr;
  public matrix(int num){
    array = new int[num];
  }
  public void print(){
    //determine the size of the array
    int aSize = (int)Math.sqrt(array.length);
    System.out.println("aSize: "+aSize);
    newArr = new int[aSize][];
    for(int i=0;i<aSize;i++){ 
      if(i == aSize-1&&aSize!=1){//last position
        newArr[i] = new int[aSize+array.length-aSize*aSize];
      }
      else if(aSize==1){
       newArr[i] = new int[array.length];
      }else{
         newArr[i] = new int[aSize];
      }
    }
    int count =0;
    //assign a 1d array to a 2d array
    for(int i=0; i<aSize; i++){
      for(int j=0; j<newArr[i].length;j++){
        newArr[i][j] = array[count];
        count++;
      }
    }
    //print the matrix
    for(int i=0; i<aSize; i++){
      System.out.print("List"+(i+1)+": ");
      for(int j=0; j<newArr[i].length;j++){
        System.out.print(newArr[i][j]+" ");
      }
      System.out.println();
    }
    
  }
//  public void check(int[][] array){
//    for(int i=0;i<array.length;i++){
//      System.out.println(Arrays.toString(array[i]));
//    }
//    int total =0;
//    for(int row = 0; row <array.length; row++){
//      for(int col = 0; col <array[row].length; col++){
//        
//        for(int i = 0; i < array.length; i++){
//          for(int j = 0; j < array[i].length; j++){
//            if(array[i][j] == array[row][col]&&i!=row&&j!=col)
//              total++;
//          }
//        }  
//      }
//    }
//    total = total/2;
//    System.out.println("total: "+total);
//  }
  public void check(int[][] array){
    for(int i=0;i<array.length;i++){
      System.out.println(Arrays.toString(array[i]));
    }
    ArrayList<Integer> n = new ArrayList<Integer>();
    System.out.println(n.size());
    int total =0;
    for(int row = 0; row <array.length; row++){
      for(int col = 0; col <array[row].length; col++){
        
        for(int i = 0; i < array.length; i++){
          for(int j = 0; j < array[i].length; j++){
            if(array[i][j] == array[row][col])
              n.add(array[i][j]);
            total++;
          }
        }  
      }
    }
      for ( int i = 0; i < n.size(); i++ ){
     for ( int j = 0; j < n.size(); j++ ){
        if ( i == j )
        { }
        else if ( n.get( j ).equals( n.get( i ) ) ){
           n.remove( j );
        }
     }
      }
    System.out.println(n.size());
    total = total/2;
    System.out.println("total: "+total);
  
  }
    
  }