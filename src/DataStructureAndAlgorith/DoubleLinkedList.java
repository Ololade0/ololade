package DataStructureAndAlgorith;

public class DoubleLinkedList {
   private Nodes head;
   private Nodes tail;
    private int size;

    public boolean isEmpty() {
        return head == null;

    }





    public void addNodes(int data) {
            Nodes nodes = new Nodes(data);
            if(head == null){
                head = tail = nodes;
                head.previous = null;
                tail.next = null;
            }
            else {
                tail.next = nodes;
                nodes.previous = tail;
                tail = nodes;
                tail.next = null;
            }

        size++;

    }

    public int getDoubleNodes(int data) {

        return data ;
    }

    public int getSize() {
        return size;
    }

    public void removeNodes(int data) {
        }

    }

