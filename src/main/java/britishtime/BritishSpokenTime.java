package britishtime;

public class BritishSpokenTime {

    private static final MixedFormatter formatter = new MixedFormatter();

    private BritishSpokenTime() {
    }

    public static String toBritishTime(String time) {
        if (time == null || !time.matches("\\d{1,2}:\\d{2}")) {
            throw new IllegalArgumentException("Use proper hh:mm format (24-hour)");
        }
        String[] hm = time.split(":");
        int hh = Integer.parseInt(hm[0]);
        int mm = Integer.parseInt(hm[1]);

        if (hh < 0 || hh > 23 || mm < 0 || mm > 59) {
            throw new IllegalArgumentException("Hour must be between 0–23 and Minute must be between 0–59");
        }

        if (hh == 12 && mm == 0)
            return "noon";
        if (hh == 0 && mm == 0)
            return "midnight";

        return formatter.format(hh, mm);
    }
}