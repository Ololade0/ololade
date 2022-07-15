package DataStructureAndAlgorith;

public class LinkedList  {
  private Nodes head;
  private int size;


  public void add(int value){
      Nodes node = new Nodes(value);
      node.setNext(head);
      head = node;
      size++;
  }

  private int getSize(){
      return size;
  }

  private boolean isEmpty(){
      return head == null;
  }

  private Nodes remove(){
      Nodes removedNode = head;
      head = head.getNext();
      size--;
      return removedNode;
  }


}


