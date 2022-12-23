import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {
    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeReturnsTrue () throws Exception {
        Lion lion = new Lion("Самец");
        boolean actualHaveMane =  lion.doesHaveMane();
        boolean expectedHaveMane = true;
        Assert.assertEquals(actualHaveMane, expectedHaveMane);

    }

    @Test
    public void doesHaveManeReturnsFalse () throws Exception {
        Lion lion = new Lion("Самка");
        boolean actualHaveMane =  lion.doesHaveMane();
        boolean expectedHaveMane = false;
        Assert.assertEquals(actualHaveMane, expectedHaveMane);

    }

    @Test(expected = Exception.class)
    public void doesHaveManeReturnsException () throws Exception {
        Lion lion = new Lion("Unknown");
        lion.doesHaveMane();
    }


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
        Assert.assertArrayEquals(
                new String[]{"Животные", "Птицы", "Рыба"},
                lion.getFood().toArray()
        );
    }


}
