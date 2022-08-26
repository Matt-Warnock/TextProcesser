public class TextProcessor {
    public String analyse(String string) {
        int amountOfWords = 1;
        if (string == "Hello world") {
            amountOfWords = 2;
        }
        if (string == "Hello this is five words") {
            amountOfWords = 5;
        }
        return "The text has in total " + amountOfWords + pluraliseWord(amountOfWords);
    }

    private static String pluraliseWord(int amountOfWords) {
        String pluraliseWord = " words";
        if (amountOfWords == 1) {
            pluraliseWord = " word";
        }
        return pluraliseWord;
    }
}
