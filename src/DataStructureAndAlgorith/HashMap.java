package DataStructureAndAlgorith;

public class HashMap implements Map {
    Set myKeys = new Set();
    ArrayList myValues = new ArrayList();

    private int size;

    @Override
    public boolean isEmpty() {
        return myKeys.isEmpty();

    }
    @Override
    public void put(String keys, String values) {
        myValues.add(values);
        myKeys.add(keys);


    }

    @Override
    public int size() {
        return myKeys.size();
    }

    @Override
    public boolean containKey(String keys) {
        for (int i = 0; i <= myKeys.size() ; i++) {
            if(keys.equalsIgnoreCase(myKeys.getItem(i)));
            return true;
        }
        return false;
    }

    @Override
    public String getKey(int index) {
       return myValues.get(index);
        }

    @Override
    public void removeKey(String key) {
        myKeys.remove(key);
    }

    @Override
    public String getValue(int index) {
        return myValues.get(index);
    }

    @Override
    public void clearAll(String values){
            myValues.remove(myValues.get(size() - 3));
        }




    @Override
    public boolean containValue(String value) {
        for (int i = 0; i <= myValues.size() ; i++) {
            if(value.equalsIgnoreCase(myValues.get(i)));
            return true;

        }
        return false;
    }




}

