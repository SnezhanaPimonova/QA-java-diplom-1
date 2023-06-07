import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import praktikum.IngredientType;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class IngredientTypeTest {

    private final IngredientType ingredientType;
    private final String nameIngredientType;

    public IngredientTypeTest(IngredientType ingredientType, String nameIngredientType) {
        this.ingredientType = ingredientType;
        this.nameIngredientType = nameIngredientType;
    }

    @Parameterized.Parameters(name = "Ингредиент: {0}")
    public static Object[][] dataForIngredientType() {
        return new Object[][]{
                {IngredientType.SAUCE, "SAUCE"},
                {IngredientType.FILLING, "FILLING"},
        };
    }

    @Test
    public void checkIngredientType() {
        assertEquals(ingredientType, IngredientType.valueOf(nameIngredientType));
    }

}
