package britishtime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MixedFormatterTest {

    private final MixedFormatter formatter = new MixedFormatter();

    @Test
    void digital() {
        assertEquals("six thirty-eight", formatter.format(6, 38));
        assertEquals("two twenty-three", formatter.format(14, 23));
    }

    @Test
    void colloquial() {
        assertEquals("half past seven", formatter.format(7, 30));
        assertEquals("twenty to nine", formatter.format(8, 40));
        assertEquals("ten to five", formatter.format(16, 50));
    }

    @Test
    void quartersAndOclock() {
        assertEquals("three o'clock", formatter.format(15, 0));
        assertEquals("quarter past four", formatter.format(4, 15));
        assertEquals("quarter to ten", formatter.format(21, 45));
    }
}
