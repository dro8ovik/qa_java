import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    Lion lion;

    @Before
    public void init() throws Exception {
        lion = new Lion("Самец", feline);
    }

    @Test
    public void getFoodTest() throws Exception {
        lion.getFood();
        Mockito.verify(feline).getFood("Хищник");
    }

    @Test
    public void getKittensTest() {
        lion.getKittens();
        Mockito.verify(feline).getKittens();
    }

    @Test
    public void doesHaveManeTest() {
        Assert.assertTrue(lion.doesHaveMane());
    }

    @Test
    public void doesNotHaveManeTest() throws Exception {
        lion = new Lion("Самка", feline);
        Assert.assertFalse(lion.doesHaveMane());
    }
}
