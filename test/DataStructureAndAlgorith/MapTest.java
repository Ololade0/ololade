package DataStructureAndAlgorith;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MapTest {
    Map map;

    @BeforeEach
    void setUp() {
        map = new HashMap();
    }

    @Test
    void mapCanBeCreated() {
        assertTrue(map.isEmpty());
    }

    @Test
    void addValueCanBeTested() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertFalse(map.isEmpty());

    }

    @Test
    void mapSizeCanBeTested() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertEquals(3, map.size());

    }

    @Test
    void containKeyTest() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertTrue(map.containKey("Abia"));


    }

    @Test
    void getAddedKey() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertEquals("Yola", map.getKey(2));
    }

    @Test
    void getAddedValue() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertEquals("Yola", map.getValue(2));
    }

    @Test
    void containValueTest() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        assertTrue(map.containValue("Yola"));
        System.out.println("" + map.containValue("Yola"));
    }

    @Test
    void removeKeyTest() {
        map.put("Adamawa", "Yola");
        map.removeKey("Adamawa");
        assertTrue(map.isEmpty());
    }

    @Test
    void ClearAllTest() {
        map.put("Lagos", "Ikeja");
        map.put("Abia", "Umuahia");
        map.put("Adamawa", "Yola");
        map.removeKey("Adamawa");
        map.removeKey("Abia");
        map.removeKey("Lagos");
        assertTrue(map.isEmpty());

    }


}

