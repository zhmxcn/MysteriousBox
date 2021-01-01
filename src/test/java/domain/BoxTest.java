package domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BoxTest {

    @Test
    public void should_return_lastHashCode_0_when_boxid_is_1() throws Exception {

        Box box = new Box();

        assertEquals(box.getLastHashCode(),"0");
    }
}
