package DataStructureAndAlgorith;

public interface Map {
    boolean isEmpty();

    void put(String keys, String values);
    int size();
    boolean containKey(String keys);
    boolean containValue(String value);
    String getKey(int index);
    void removeKey(String key);

    String getValue(int index);
    void clearAll(String values);
}
