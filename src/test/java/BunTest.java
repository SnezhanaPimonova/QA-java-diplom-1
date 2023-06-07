import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Bun;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class BunTest {
    private Bun bun;
    private final String bunName;
    private final float bunPrice;

    public BunTest(String bunName, float bunPrice) {
        this.bunName = bunName;
        this.bunPrice = bunPrice;
    }

    @Parameterized.Parameters(name = "Название: {0}, цена: {1}")
    public static Object[][] dataForBun() {
        return new Object[][]{
                {"какая-то булка", 100},
                {"delicious bun", 999.99f},
                {null, 0},
                {"negative bun", -1},
        };
    }

    @Before
    public void setUp() {
        bun = new Bun(bunName, bunPrice);
    }

    @Test
    public void getBunName() {
        assertEquals(bunName, bun.getName());
    }

    @Test
    public void getBunPrice() {
        assertEquals(bunPrice, bun.getPrice(), 0);
    }
}
