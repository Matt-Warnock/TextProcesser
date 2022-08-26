import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TextProcessorTest {

    @Test
    void one_word_sentence(){
        String string = "Hello";
        String sentence = "The text has in total 1 word";

        assertTrue(new TextProcessor().analyse(string).contains(sentence));
    }

    @Test
    void two_word_sentence(){
        String string = "Hello world";
        String sentence = "The text has in total 2 words";

        assertTrue(new TextProcessor().analyse(string).contains(sentence));
    }



}