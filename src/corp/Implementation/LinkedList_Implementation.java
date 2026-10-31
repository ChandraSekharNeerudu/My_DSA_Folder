package corp.Implementation;
class LinkedList{
    private Node head;
    private Node tail;
    private class Node{
    int data;
    Node next;
    public Node(int d){
        data=d;
    }
  }  
  public LinkedList(){
      head=tail=null;
  }
  public LinkedList(int d){
      Node newNode=new Node(d);
      head=tail=newNode;
  }
  public void add(int d){
      Node newNode=new Node(d);
      if(head==null){
          head=tail=newNode;
          return;
      }
      tail.next=newNode;
      tail=newNode;
  }
  public void print(){
      int i=0;
      Node cur=head;
      while(cur!=null){
          if(i!=0)System.out.print("->");
          System.out.print(cur.data);
          cur=cur.next;
          i++;
      }
      System.out.println();
  }
  public int size(){
      int size=0;
      Node cur=head;
      while(cur!=null){
          size++;
          cur=cur.next;
      }
      return size;
  }
  private Node previous(Node n){
      Node cur=head;
     
      while(cur!=null){
          if(cur.next==n)return cur;
          cur=cur.next;
      }
      return null;
  }
  //O(n*n)
  public void reverse1(){        
      if(this.size()<1)return;
      Node end=tail;
      Node start=head;
      int s=0,e=this.size();
      
      while(s<e){
          int t=end.data;
          end.data=start.data;
          start.data=t;
          
          start=start.next;
          end=this.previous(end);
          s++;
          e--;
      }
  }
  //O(n)
  public void reverse2()
  {
      if(size()<2)return;
      
      Node prev=null;
      Node cur=head;
      Node next=head.next;
      while(next!=null)
      {
          next=cur.next;
          cur.next=prev;
          prev=cur;
          cur=next;
      }
      tail=head;
      head=prev;
  }
  private Node middle(){
      Node slow=head;
      Node fast=head;
      while(fast!=null && fast.next!=null){
          slow=slow.next;
          fast=fast.next.next;
      }
      return slow;
  }
  public int middleValue(){
      Node m=this.middle();
      return m.data;
  }
  public void sort(){
      int n=this.size();
      if(n<2)return;
      
      for(int i=n;i>1;i--){
          Node prev=head;
          Node N=head.next;
          int swaps=0;
          for(int j=1;j<i;j++){
                  if(prev.data>N.data){
                      int t=prev.data;
                      prev.data=N.data;
                      N.data=t;
                      swaps++;
                  }
                  prev=prev.next;
                  N=N.next;
          }
          if(swaps==0)return;
      }
      
  }
}

public class LinkedList_Implementation {
	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add(10);
		list.add(30);
		list.add(50);
		list.add(20);
		list.add(40);
		list.add(60);
		list.add(20);
		list.add(40);
		list.print();
	//	list.reverse1();
	//	list.print();
		//System.out.println(list.middleValue());
		//list.sort();
		list.reverse2();
		list.print();
	}
}
