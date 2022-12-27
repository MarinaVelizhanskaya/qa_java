import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;


@RunWith(Parameterized.class)

public class LionTestHaveMane {
    private final String sex;
    private final boolean expected;

    public LionTestHaveMane(String sex, boolean expected) {
        this.sex = sex;
        this.expected = expected;
    }
    @Parameterized.Parameters
    public static Object[][] HaveMan() {
        return new Object[][] {
                { "Самка", false},
                { "Самец", true},
        };
    }
    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    private Feline feline;
    @Test
    public void doesHaveManeReturnsValidResult() throws Exception {
        Lion lion = new Lion(feline, sex);
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(expected, actual);

    }
}
