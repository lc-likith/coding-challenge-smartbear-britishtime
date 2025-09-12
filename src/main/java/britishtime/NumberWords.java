package britishtime;

final class NumberWords {

    private static final String[] below20 = {"zero","one","two","three","four","five","six","seven","eight","nine",
            "ten","eleven","twelve","thirteen","fourteen","fifteen", "sixteen","seventeen","eighteen","nineteen"};

    private static final String[] tens = {"","","twenty","thirty","forty","fifty"};

    private NumberWords() {}

    static String word(int n) {
        if (n < 0 || n >= 60)
            throw new IllegalArgumentException("only 0 to 59 is Supported : " + n);

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
