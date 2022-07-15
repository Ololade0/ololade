package DataStructureAndAlgorith;

import java.util.Objects;

public class ArrayList implements List {
    private int size;
    private String[] element = new String[5];

    @Override
    public boolean isEmpty(){

        return size == 0;
    }

    @Override
    public void add(String item){
        if(size == element.length){
            String[] newElements = new String[element.length * 2];
            System.arraycopy(element, 0, newElements, 0, element.length );
            element = newElements;
        }
        element[size++] = item;

    }
    @Override
    public void remove(String item){
        for (int i = 0; i < element.length ; i++) {
            if (Objects.equals(element[i], item)) {
                for (int j = i; j < size; j++) {
                    element[j] = element[j + 1];

                }
            }
        }
        --size;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public String get(int index) {
        return element[index];
    }

    @Override
    public int addCapacity() {
        return element.length;
    }


}



