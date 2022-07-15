package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {
    Queue queue;

    @BeforeEach
    void setUp() {
        queue = new QueueList();
    }

    @Test
    void queueCanBeCreated() {
        assertTrue(queue.isEmpty());
    }

    @Test
    void addItemCanBeTested(){
        queue.add("Fabrics");
        queue.add("Garment");
       queue.add("Cotton");
       assertFalse(queue.isEmpty());
    }

    @Test
    void sizeCanBeTested(){
        queue.add("Fabrics");
        queue.add("Garment");
        queue.add("Cotton");
        assertEquals(3, queue.size());

    }


    @Test
    void ItemCanBeRemoveTest(){
        queue.add("Fabrics");
        queue.add("Garment");
        queue.add("Cotton");
        queue.remove("Cotton");
        assertEquals(2, queue.size());


    }

    @Test
    void retrieveItemTest(){
        queue.add("Fabrics");
        queue.add("Garment");
        queue.add("Cotton");
      String item =  queue.get(2);
        assertEquals("Cotton", item);
    }

    @Test
    void peekItemTEst(){
        queue.add("Fabrics");
        queue.add("Garment");
        queue.add("Cotton");
        assertEquals("Fabrics", queue.peekItem(0));
        System.out.println("" + queue.peekItem(0));

    }

}