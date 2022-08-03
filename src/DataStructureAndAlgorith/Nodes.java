package DataStructureAndAlgorith;

public class Nodes {
    int data;

    Nodes previous;
    Nodes next;

    public Nodes(int data) {
        this.data = data;
        this.next = null;
    }

    public void setNext(Nodes next) {
        this.next = next;
    }

    public Nodes getNext() {
        return next;
    }

    public int getNodes(int data) {
        return data;
    }
}
