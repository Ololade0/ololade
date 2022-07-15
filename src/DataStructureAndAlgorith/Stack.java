package DataStructureAndAlgorith;

import java.util.Objects;

public class Stack {
    private ArrayList myStack = new ArrayList();

    public boolean isEmpty() {
        return myStack.isEmpty();
    }


    public void push(String item) {
        myStack.add(item);

    }


    public void pop() {
        myStack.remove(myStack.get(size() - 1));
    }


    public int size() {
        return myStack.size();
    }




  //  public String getElement(int index) {
    //    return myStack.get(index);
   // }


    public String searchElement(String item) {
        for (int i = 0; i <= myStack.size(); i++) {
            if(Objects.equals(myStack.get(i), item));
        }
        return item;
            }



    public String peek() {
       return myStack.get(myStack.size() - 1);

    }
}



