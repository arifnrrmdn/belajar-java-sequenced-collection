package arif10522014unikom.belajarjavasequencedcollection;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.SequencedCollection;

public class CollectionTest {


    @Test
    void collection() {
        SequencedCollection<String> list = new ArrayList<>();
        list.addLast("Ramadhan");
        list.addFirst("N");
        list.addFirst("Arif");

        Assertions.assertEquals(List.of("Arif", "N", "Ramadhan"), list);

        Assertions.assertEquals("Arif", list.getFirst());
        Assertions.assertEquals("Ramadhan", list.getLast());

        SequencedCollection<String> reversed = list.reversed();
        Assertions.assertEquals(List.of("Ramadhan","N","Arif"), reversed);

        String value = list.removeFirst();
        Assertions.assertEquals("Arif", value);
        Assertions.assertEquals("N", list.getFirst());

        value = list.removeLast();
        Assertions.assertEquals("Ramadhan",value);
        Assertions.assertEquals("N", list.getLast());
    }
}
