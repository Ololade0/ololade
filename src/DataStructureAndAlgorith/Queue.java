package DataStructureAndAlgorith;

public interface Queue {

    boolean isEmpty();

    int size();

    void add(String item);

    void remove(String item);

    String get(int index);

    String peekItem(int index);

     // String get(int index);
}
