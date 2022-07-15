package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ListTest {
    List list;

    @BeforeEach
    void setUp() {
        list = new ArrayList();
    }
    @Test
    public void newListIsEmptyTest(){
        assertTrue(list.isEmpty());
    }

    @Test
    void addItemListIsNotEmpty(){
        list.add("G-String");
        assertFalse(list.isEmpty());
    }

    @Test
    public void addItem_removeItem_listIsEmptyTest(){
        list.add("E-String");
        list.remove("E-String");
        assertTrue(list.isEmpty());

    }

    @Test
    void addItem_sizeIncreasesTest(){
        list.add("A-String");
        assertEquals(1, list.size());
    }
    @Test
    void addX_addY_sizeIsTwoTest(){
        list.add("G-String");
        list.add("A-String");
        assertEquals(2, list.size());
    }

    @Test
    void addX_addY_removex_sizeIsOneTest(){
        list.add("G-String");
        list.add("A-String");
        list.remove("G-String");
        assertEquals(1, list.size());
    }

    @Test
    void addX_addY_removeX_ListIsNotEmptyTestTest(){
        list.add("G-String");
        list.add("A-String");
        list.remove("A-String");
        assertFalse(list.isEmpty());
    }

    @Test
    void addX_addY_retrieveXTest(){
        list.add("G-String");
        String item = list.get(0);
        assertEquals("G-String", item);

    }
    @Test
    void addX_addY_retrieveYTest(){
        list.add("G-String");
        list.add("A-String");
        String item = list.get(1);
        assertEquals("A-String", item);

    }

    @Test
    void addX_addY_retrieveXTest1(){
        list.add("G-String");
        list.add("A-String");
        String item = list.get(0);
        assertEquals("G-String", item);

    }

    @Test
    void addX_addYandZ_getXShouldRetrieveYTest(){
        list.add("G-String");
        list.add("C-String");
        list.add("A-String");
        list.add("C-String");
        list.remove("A-String");
        String item = list.get(1);
        assertEquals("C-String", item);

    }

@Test
    public void addSixElement_capacityShouldDoubleTest(){
        assertEquals(5, list.addCapacity());
    list.add("G-String");
    list.add("C-String");
    list.add("A-String");
    list.add("C-String");
    list.add("F-String");
    list.add("Y-String");
    assertEquals(10, list.addCapacity());


}



}