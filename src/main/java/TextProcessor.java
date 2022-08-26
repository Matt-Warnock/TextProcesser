public class TextProcessor {
    public String analyse(String string) {
        int amountOfWords = string.split(" ").length;

        return formatWordCount(amountOfWords);
    }

    private static String formatWordCount(int amountOfWords) {
        return "The text has in total " + amountOfWords + " " + pluraliseWord(amountOfWords);
    }

    private static String pluraliseWord(int amountOfWords) {
        return amountOfWords != 1 ? "words" : "word";
    }
}
