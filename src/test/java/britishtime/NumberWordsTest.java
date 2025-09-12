package britishtime;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberWordsTest {

    @Test
    void boundaries() {
        assertEquals("zero", NumberWords.word(0));
        assertEquals("nineteen", NumberWords.word(19));
        assertEquals("twenty", NumberWords.word(20));
        assertEquals("fifty-nine", NumberWords.word(59));
    }

    @Test
    void hyphenedNumbers() {
        assertEquals("twenty-one", NumberWords.word(21));
        assertEquals("twenty-five", NumberWords.word(25));
        assertEquals("thirty-three", NumberWords.word(33));
        assertEquals("forty-six", NumberWords.word(46));
        assertEquals("fifty-nine", NumberWords.word(59));
    }

    @Test
    void validation() {
        assertThrows(IllegalArgumentException.class, () -> NumberWords.word(-1));
        assertThrows(IllegalArgumentException.class, () -> NumberWords.word(60));
        assertThrows(IllegalArgumentException.class, () -> NumberWords.word(99));
        assertThrows(IllegalArgumentException.class, () -> NumberWords.word(1000));
    }
}
