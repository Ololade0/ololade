package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LinkedListTest {
    LinkedList link;
    Nodes nodes;
    DoubleLinkedList doubleLinkedList;
   // DoubleNodes doubleNodes;

    @BeforeEach
    void setUp() {
        link = new LinkedList();
        nodes = new Nodes(10);
        //nodes = new Nodes(20);
        doubleLinkedList = new DoubleLinkedList();

    }

    @Test
    void LinkedListCanBeCreated() {
        assertTrue(link.isEmpty());
    }

    @Test
    void addElementToLinkedListTest() {
        link.addNodes(10);
        link.addNodes(15);
        link.addNodes(20);
        link.addNodes(25);
        assertEquals(15, link.getNodes(15));
       assertFalse(link.isEmpty());
    }


    @Test
    void ListSizeCanBeCreated() {
        link.addNodes(10);
        link.addNodes(15);
        link.addNodes(20);
        link.addNodes(25);
        assertEquals(4, link.getSize());
    }
    @Test
    void testThatNodesCanBeRemove() {
        link.addNodes(10);
        link.addNodes(15);
        link.addNodes(20);
        link.addNodes(25);
        link.removeNodes();
        assertEquals(3, link.getSize());

    }

    @Test
    void thatNodesCanBeRetrieveTest(){
        link.addNodes(10);
        link.addNodes(15);
        link.addNodes(20);
        link.addNodes(25);
       // link.retrieveNodes();
       // assertEquals("4", link.getNodes());

    }


    @Test
    void testThatDoubleLinkedListIsEmpty(){
        assertTrue(doubleLinkedList.isEmpty());
    }

    @Test
    void testThatDoubleNodesIsNotEmpty(){
        doubleLinkedList.addNodes(20);
        doubleLinkedList.addNodes(30);
        assertFalse(doubleLinkedList.isEmpty());
        assertEquals(30, doubleLinkedList.getDoubleNodes(30));

    }

    @Test
    void DoubleLinkedListSizeCanBeTested() {
        doubleLinkedList.addNodes(20);
        doubleLinkedList.addNodes(30);
        doubleLinkedList.addNodes(60);
        doubleLinkedList.addNodes(50);
        assertEquals(4, doubleLinkedList.getSize());

    }

    @Test
    void testThatDoubleNodesCanBeRemove() {
        doubleLinkedList.addNodes(20);
        doubleLinkedList.addNodes(30);
        doubleLinkedList.addNodes(60);
        doubleLinkedList.addNodes(50);
        doubleLinkedList.removeNodes(60);
        assertEquals(3, doubleLinkedList.getSize());

    }






}