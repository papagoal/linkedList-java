import java.util.Arrays;
public class A5Q3V1{
  public static void main(String[] args){
     
     int[] arr = {1,2,3,4,5,6,7,8,9,10};

     //determine the size of the array
     int aSize = (int)Math.sqrt(arr.length);
     int[][] newArr = new int[aSize][];
     for(int i=0;i<aSize;i++){
       if(arr.length%aSize!=0){   
         if(i == aSize-1){
           newArr[i] = new int[aSize+arr.length%aSize];
         }
         else{
           newArr[i] = new int[aSize];
         }
       }
       else
         newArr[i] = new int[aSize];
     }
     int count =0;
     //assign a 1d array to a 2d array
     for(int i=0; i<aSize; i++){
       for(int j=0; j<newArr[i].length;j++){
           newArr[i][j] = arr[count];
           count++;
       }
     }
     //print the matrix
     for(int i=0; i<aSize; i++){
       for(int j=0; j<newArr[i].length;j++){
         System.out.print(newArr[i][j]+" ");
       }
       System.out.println();
     }
     

  }  
}
class matrix{
  private int num;
  int[] array;
  public matrix(int num){
    array = new int[num];
  }
  public void print(){
    
    
  }
  
}