package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetTest {
    Set set;

    @BeforeEach
    void setUp() {
        set = new Set();

    }

    @Test
    void isEmptyTest() {
        assertTrue(set.isEmpty());
    }

    @Test
    void addItemTest() {
        set.add("fabrics");
        assertFalse(set.isEmpty());
    }

    @Test
    void removeItemTest(){
        set.add("fabrics");
        set.remove("fabrics");
        assertTrue(set.isEmpty());
    }

    @Test
    void addItemIncreaseSize(){
        set.add("Cloth");
        assertEquals(1, set.size());
    }

    @Test
    void addTwoItemTest(){
        set.add("Pant");
        set.add("fabric");
        assertEquals(2, set.size());

    }
    @Test
    void addTwoRemoveOneTest(){
        set.add("Pant");
        set.add("fabric");
        set.remove("pant");
        assertEquals(1, set.size());

    }

    @Test
    void addTwoRetrieveOneItemTest(){
        set.add("popcorn");
        set.add("Hamburger");
       String item = set.getItem(0);
        assertEquals("popcorn", item);
    }


}
