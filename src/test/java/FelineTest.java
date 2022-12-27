import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class FelineTest {

    @Test
    public void getFamilyReturnsValidFamily () {
        Feline feline = new Feline();
        String actualFamily = feline.getFamily();
        Assert.assertEquals(actualFamily, "Кошачьи");
    }

    @Test
    public void eatMeatReturnsValidListFood() throws Exception {
        Feline feline = new Feline();
        List<String> expected = Arrays.asList( "Животные", "Птицы", "Рыба" );
        List<String> actual = feline.eatMeat();
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
