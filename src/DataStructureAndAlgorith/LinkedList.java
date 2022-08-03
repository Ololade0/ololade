package DataStructureAndAlgorith;

public class LinkedList  {


    private Nodes head;

  private int size;


  public void addNodes(int value){
      Nodes node = new Nodes(value);
      node.setNext(head);
      head = node;
      size++;
  }

  public int getSize(){
      return size;
  }

  boolean isEmpty(){
      return head == null;
  }

  public Nodes removeNodes(){
      Nodes removedNode = head;
      head = head.getNext();
      size--;
      return removedNode;
  }


    public int getNodes(int value) {
      return value;
    }
}


