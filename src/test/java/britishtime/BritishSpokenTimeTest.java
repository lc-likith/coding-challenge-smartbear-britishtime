package britishtime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BritishSpokenTimeTest {

    @Test
    void specialCases() {
        assertEquals("noon", BritishSpokenTime.toBritishTime("12:00"));
        assertEquals("midnight", BritishSpokenTime.toBritishTime("00:00"));
    }

    @Test
    void colloquialStyle() {
        assertEquals("one o'clock", BritishSpokenTime.toBritishTime("01:00"));
        assertEquals("ten past three", BritishSpokenTime.toBritishTime("03:10"));
        assertEquals("twenty to nine", BritishSpokenTime.toBritishTime("20:40"));
        assertEquals("quarter to ten", BritishSpokenTime.toBritishTime("09:45"));
        assertEquals("ten to eleven", BritishSpokenTime.toBritishTime("10:50"));
        assertEquals("five to twelve", BritishSpokenTime.toBritishTime("11:55"));
        assertEquals("quarter past four", BritishSpokenTime.toBritishTime("16:15"));
        assertEquals("twenty past five", BritishSpokenTime.toBritishTime("05:20"));
        assertEquals("twenty-five past six", BritishSpokenTime.toBritishTime("06:25"));
        assertEquals("half past seven", BritishSpokenTime.toBritishTime("07:30"));
        assertEquals("twenty-five to eight", BritishSpokenTime.toBritishTime("07:35"));
    }

    @Test
    void digitalStyle() {
        assertEquals("six thirty-two", BritishSpokenTime.toBritishTime("06:32"));
        assertEquals("seven forty-seven", BritishSpokenTime.toBritishTime("19:47"));
        assertEquals("twelve four", BritishSpokenTime.toBritishTime("12:04"));
        assertEquals("three twenty-one", BritishSpokenTime.toBritishTime("15:21"));

    }

    @Test
    void validation() {
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime(null));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime(""));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("9:5"));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("12:60"));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("test"));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("14:35:25"));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("24:00"));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("  "));
        assertThrows(IllegalArgumentException.class, () -> BritishSpokenTime.toBritishTime("-1:30"));
    }
}
