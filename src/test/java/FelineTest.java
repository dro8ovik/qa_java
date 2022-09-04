import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FelineTest {

    Feline feline;

    @Before
    public void init(){
        feline = new Feline();
    }

    @Test
    public void getCustomKittensTest(){
        Assert.assertEquals(2, feline.getKittens(2));
    }

    @Test
    public void getKittensTest(){
        Assert.assertEquals(1, feline.getKittens());
    }

    @Test
    public void getFamilyTest(){
        Assert.assertEquals("Кошачьи", feline.getFamily());
    }

    @Test
    public void eatMeatTest() throws Exception {
        List<String> list = new ArrayList<>(Arrays.asList("Животные", "Птицы", "Рыба"));
        Assert.assertEquals(list, feline.eatMeat());
    }
}
