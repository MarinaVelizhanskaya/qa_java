import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)

public class FelineTest {
   private final int kittensCount;
    private final int expected;

    public FelineTest(int kittensCount, int expected) {
        this.kittensCount = kittensCount;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] getSomeKittens() {
        return new Object[][] {
                { 0, 0},
                { 1, 1},
                {10, 10}
        };
    }

    @Test
    public void getFamilyReturnsValidFamily () {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        Assert.assertEquals(actualFamily, "Кошачьи");
    }

    @Test
    public void eatMeatReturnsValidListFood() throws Exception {
        Feline feline = new Feline();
        Assert.assertArrayEquals(
                new String[]{"Животные", "Птицы", "Рыба"},
                feline.eatMeat().toArray()
        );
    }

    @Test
    public void getKittensWithParameter() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getKittensWithoutParameter() {
        Feline feline = new Feline();
        int expectedCount = 1;
        int actualCount = feline.getKittens();
        Assert.assertEquals(expectedCount, actualCount);
    }

}
