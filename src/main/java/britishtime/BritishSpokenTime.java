package britishtime;

public class BritishSpokenTime {
    public static String toBritishTime(String time) {
        String[] hm = time.split(":");
        int hh = Integer.parseInt(hm[0]);
        int mm = Integer.parseInt(hm[1]);

        if (hh == 12 && mm == 0)
            return "noon";
        if (hh == 0 && mm == 0)
            return "midnight";

        int hour;
        if(hh % 12 == 0) hour = 12;
        else hour = hh % 12;
        int nextHour;
        if((hh + 1) % 12 == 0 ) nextHour = 12;
        else nextHour = (hh + 1) % 12;

        if(mm % 5 == 0) {
            if (mm == 0)
                return numToWords(hour) + " o'clock";
            if (mm == 15)
                return "quarter past " + numToWords(hour);
            if (mm == 30)
                return "half past " + numToWords(hour);
            if (mm == 45)
                return "quarter to " + numToWords(nextHour);
            if (mm < 30)
                return numToWords(mm) + " past " + numToWords(hour);
            else
                return numToWords(60 - mm) + " to " + numToWords(nextHour);
        }
        else
            return numToWords(hour) + " " +  numToWords(mm);
    }

    private static String numToWords(int n) {
        String[] below20 = {"zero","one","two","three","four","five","six","seven",
                "eight","nine","ten","eleven","twelve","thirteen","fourteen",
                "fifteen","sixteen","seventeen","eighteen","nineteen"};
        String[] tens = {"","","twenty","thirty","forty","fifty"};

        if (n < 20)
            return below20[n];
        if (n < 60) {
            int n1 = n / 10;
            int n2 = n % 10;
            if(n2 == 0)
                return tens[n1];
            else
                return tens[n1] + "-" + below20[n2];
        }
        return String.valueOf(n);
    }
}