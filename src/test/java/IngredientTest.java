import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.Ingredient;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTest {
    private Ingredient ingredient;
    private final IngredientType ingredientType;
    private final String name;
    private final float price;


    public IngredientTest(IngredientType ingredientType, String name, float price) {
        this.ingredientType = ingredientType;
        this.name = name;
        this.price = price;
    }

    @Parameterized.Parameters(name = "Тип: {0}, название: {1}, цена: {2}")
    public static Object[][] dataForIngredient() {
        return new Object[][]{
                {IngredientType.SAUCE, "chili sauce", 127.00f},
                {IngredientType.FILLING, "cheese", 590.99f}
        };
    }

    @Before
    public void setUp() {
        ingredient = new Ingredient(ingredientType, name, price);
    }


    @Test
    public void getIngredientPrice() {
        assertEquals(price, ingredient.getPrice(), 0);
    }

    @Test
    public void getIngredientName() {
        assertEquals(name, ingredient.getName());
    }

    @Test
    public void getIngredientType() {
        assertEquals(ingredientType, ingredient.getType());
    }
}
