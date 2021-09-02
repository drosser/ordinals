package currencycloud.ordinals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrdinalsTests {

    Ordinals ordinals;

    @BeforeEach void setUp() {
        ordinals = new Ordinals();
    }

    @Test
    public void convert1To1st() {
        String result = ordinals.convert(1);

        assertEquals("1st", result);
    }
}
