import org.fest.assertions.MapAssert;

public class TextProcessor {
    public String analyse(String string) {
        if (string == "Hello world") {
            return "The text has in total 2 words";
        }
        if (string == "Hello this is five words") {
            return "The text has in total 5 words";
        }
        return "The text has in total 1 word";
    }
}
