import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void getKittensReturnsValidCount() {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getKittens()).thenReturn(1);
        int actualCountKittens = lion.getKittens();
        int expectedCountKittens = 1;
        Assert.assertEquals(expectedCountKittens, actualCountKittens);
    }

    @Test
    public void getFoodReturnsValidListFood() throws Exception {
        Lion lion = new Lion(feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        List<String> expected = Arrays.asList( "Животные", "Птицы", "Рыба" );
        List<String> actual = lion.getFood();
        Assert.assertEquals(expected, actual);
    }


}
