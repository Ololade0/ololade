package DataStructureAndAlgorith;

public class Set {
    private ArrayList set = new ArrayList();
    public boolean isEmpty() {
        return set.isEmpty();
    }

    public void add(String item) {

        set.add(item);

    }

    private boolean contain(String item) {
        for (int i = 0; i < set.size(); i++) {
            if (item.equalsIgnoreCase(set.get(i))) {
                return true;
            }
        }
        return false;
    }

    public void remove(String item) {
        set.remove(item);
    }


    public int size() {
        return set.size();
    }


    public String getItem(int index) {
        return set.get(index);
    }
}