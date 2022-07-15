package DataStructureAndAlgorith;

public class QueueList implements Queue {
    private String[] myArray = new String[10];
    private int size;


    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void add(String item) {
        if (size == myArray.length) {
            myArray = new String[10];
        }
        //if(size == myArray){
        //myArray = new String[10]
        //myArray[size++] = item;
        myArray[size++] = item;

    }

    @Override
    public void remove(String item) {
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == item) {
                for (int j = i; j < size; j++) {
                    myArray[j] = myArray[j + 1];
                }

            }

        }
        --size;
        for (int i = 0; i < myArray.length; i++) {
            if(myArray[i] == item){
                for (int j = i; j < size; j++) {
                    myArray[j] = myArray[j + 1];

                }
            }

        }
        --size;


    }

    @Override
    public String get(int index) {
        return myArray[index];
    }

    @Override
    public String peekItem(int index) {
        return myArray[0];
    }


}







