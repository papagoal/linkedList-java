public class LinkedList {
  
  private Node first;
  private Node last;
  private int size = 0;
  
  public LinkedList(){
    first = last = null;
  }
  
  public void add(String str){
    Node newNode = new Node(str);
    if(last==null)
      first=last=newNode;
    else {
      last.next = newNode;
      newNode.prev = last;
    }
    last = newNode;
    size++;
  }
  public String get(int pos){
    int count =0;
    Node newNode = first;
    if(pos >= 0 && pos < size){
      while(newNode!=null){  
        if(count == pos)
          return newNode.str;
        count++;
        newNode = newNode.next;
      } 
    }
    return null;
  }
  public void remove(int pos){
    int count =0;
    Node newNode = first;
    Node right = new Node(null);
    if(pos >= 0 && pos < size){
      while(newNode!=null){  
        if(count == pos)
          right = newNode;
        count++;
        newNode = newNode.next;
      } 
    if(right.equals(first))
      first = right.next;
    else
      right.prev.next=right.next;
    if (right.equals(last))
      last = right.prev;
    else
      right.next.prev = right.prev;
    size--;
    }
  }
  public void set(int pos, String str){
    int count =0;
    Node newNode = first;
    Node right = new Node(null);
    if(pos >= 0 && pos < size){
      while(newNode!=null){  
        if(count == pos)
          right = newNode;
        count++;
        newNode = newNode.next;
      } 
    }
    right.str = str;   
  }
  public int indexOf(String value){
    if(first!=null){
      int count =0;
      Node newNode = first;
      while(newNode!=null){  
        if(count<size && value == newNode.str)
          return count;
        count++;
        newNode = newNode.next;
      }
    }
    return -1; 
  }
  public int lastIndexOf(String value){
    if(first!=null){
      int count =0;
      Node newNode = first;
      while(newNode!=null){  
        if(count<size && value == newNode.str)
          return size-count;
        count++;
        newNode = newNode.next;
      }
    }
    return -1; 
  }
  public int size() {
    return size;
  }
  public String toString(){
    String answer = "[";
    for(Node n = first; n!=null; n = n.next)
      answer += " "+n.str+" ";
    return answer+"]";
  }
}