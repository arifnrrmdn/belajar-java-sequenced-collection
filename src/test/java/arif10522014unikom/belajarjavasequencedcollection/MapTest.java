package arif10522014unikom.belajarjavasequencedcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.LinkedHashMap;
import java.util.SequencedMap;
import java.util.TreeMap;

public class MapTest {

    @Test
    void map() {

        SequencedMap<String, String> map = new TreeMap<>();
        map.put("b", "N");
        map.put("c", "Ramadhan");
        map.put("a", "Arif");
        

        Assertions.assertEquals("Arif", map.firstEntry().getValue());
        Assertions.assertEquals("Ramadhan", map.lastEntry().getValue());

        SequencedMap<String, String> reversed = map.reversed();

        Assertions.assertEquals("Ramadhan", reversed.firstEntry().getValue());
        Assertions.assertEquals("Arif", reversed.lastEntry().getValue());
    }

    @Test
    void linkedmap() {

        SequencedMap<String, String> map = new LinkedHashMap<>();
        map.putFirst("b", "N");
        map.putFirst("a","Arif");
        map.putLast("c", "Ramadhan");

        Assertions.assertEquals("Arif", map.firstEntry().getValue());
        Assertions.assertEquals("Ramadhan", map.lastEntry().getValue());
    }
}
