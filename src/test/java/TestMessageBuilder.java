
import static org.junit.Assert.assertEquals;
import org.junit.Test;

import webapp.MessageBuilder;
public class TestMessageBuilder {
    @Test
    public void TestMessage(){
        assertEquals(MessageBuilder.getHelloWorld(), "hello world");
    }
}
