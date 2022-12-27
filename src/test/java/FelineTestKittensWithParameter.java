import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class FelineTestKittensWithParameter {
    private final int kittensCount;
    private final int expected;

    public FelineTestKittensWithParameter(int kittensCount, int expected) {
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
    public void getKittensWithParameter() {
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        Assert.assertEquals(expected, actual);
    }
}
