package britishtime;

final class MixedFormatter {

    String format(int hh24, int mm) {
        if (mm % 5 != 0) {
            return digital(hh24, mm);
        }
        return colloquial(hh24, mm);
    }

    private static String digital(int hh, int mm) {
        int hour = to12(hh);
        return NumberWords.word(hour) + " " + NumberWords.word(mm);
    }

    private static String colloquial(int hh, int mm) {
        int hour = to12(hh);
        int nextHour = to12((hh + 1) % 24);

        if (mm == 0)
            return NumberWords.word(hour) + " o'clock";
        if (mm == 15)
            return "quarter past " + NumberWords.word(hour);
        if (mm == 30)
            return "half past " + NumberWords.word(hour);
        if (mm == 45)
            return "quarter to "   + NumberWords.word(nextHour);
        if (mm < 30)
            return NumberWords.word(mm) + " past " + NumberWords.word(hour);
        else
            return NumberWords.word(60 - mm) + " to " + NumberWords.word(nextHour);
    }

    private static int to12(int hh) {
        int h = hh % 12;
        if(h == 0)
            return 12;
        else
            return h;
    }
}
