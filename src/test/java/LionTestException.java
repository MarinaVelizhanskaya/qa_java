import com.example.Feline;
import com.example.Lion;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class LionTestException {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }
    @Mock
    private Feline feline;

    @Test
    public void doesHaveManeReturnsException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion(feline, "unknown");
        lion.doesHaveMane();
    }
}
