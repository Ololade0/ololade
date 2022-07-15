package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {
    Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack();
    }
    @Test


    void stackCanBeTested(){
        assertTrue(stack.isEmpty());
    }

    @Test
    void pushItemToStackTest(){
        stack.push("Flour");
        stack.push("Yam");
        stack.push("Rice");
        stack.push("Beans");
        assertFalse(stack.isEmpty());

    }

    @Test
    void sizeCanBeTest(){
        stack.push("Flour");
        stack.push("Yam");
        stack.push("Rice");
        stack.push("Beans");
        assertEquals(4, stack.size());

    }
    @Test
    void popElementCanBeTest(){
        stack.push("Flour");
        stack.push("Yam");
        stack.push("Rice");
        stack.push("Beans");
        stack.pop();
        assertEquals(3, stack.size());

    }
@Test
    void peekElementCanBeTested(){
    stack.push("Flour");
    stack.push("Yam");
    stack.push("Rice");
    stack.push("Beans");
    stack.peek();
    assertEquals(4, stack.size());

}

@Test
    void searchElementCanBeTested(){
    stack.push("Flour");
    stack.push("Yam");
    stack.push("Rice");
    stack.push("Beans");
    stack.searchElement("Beans");
    assertEquals("Beans", stack.searchElement("Beans"));
//    System.out.println("" + stack.searchElement("Beans"));


}


    }
