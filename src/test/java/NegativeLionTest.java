import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class NegativeLionTest {

    @Mock
    Feline feline;
    String sex;

    public NegativeLionTest(String sex) {
        this.sex = sex;
    }

    @Parameterized.Parameters
    public static Object[] getData() {
        return new Object[]{
                "Male", "Female", "Он", "Она", "Лев", "Львица", "М", "Ж"
        };
    }

    @Test(expected = Exception.class)
    public void whenExceptionThrown_doesHaveManeTest() throws Exception {
        new Lion(sex, feline);
    }

    @Test
    public void message_whenExceptionThrown_doesHaveManeTest(){
        Exception exception = null;
        try {
            new Lion(sex, feline);
        } catch (Exception e) {
            exception = e;
        } finally {
            Assert.assertEquals("Используйте допустимые значения пола животного - самец или самка", exception.getMessage());
        }
    }
}
