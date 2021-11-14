import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

public class CatTestGetFood {

    Feline feline = new Feline();

    Cat TestCat = new Cat(feline);

    @Test
    public void catTestGetFood() throws Exception {
        List<String> actual = TestCat.getFood();
        List<String> expected = Arrays.asList("Животные","Птицы","Рыба");
        Assert.assertEquals(expected, actual);
    }
}