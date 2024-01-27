package arif10522014unikom.belajarjavasequencedcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.SequencedCollection;
import java.util.TreeSet;

public class SetTest {

    @Test
    void set() {

        SequencedCollection<String> set = new TreeSet<>();
        set.add("Arif");
        set.add("Desty");
        set.add("Zira");

        Assertions.assertEquals("Arif", set.getFirst());
        Assertions.assertEquals("Zira", set.getLast());

        SequencedCollection<String> reversed = set.reversed();

        Assertions.assertEquals("Zira", reversed.getFirst());
        Assertions.assertEquals("Arif", reversed.getLast());

        String value = set.removeFirst();
        Assertions.assertEquals("Arif", value);

        value = set.removeFirst();
        Assertions.assertEquals("Desty", value);


    }
}
