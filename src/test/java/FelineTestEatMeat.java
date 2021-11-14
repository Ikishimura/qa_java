import com.example.Animal;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;


public class FelineTestEatMeat {
    Animal animal = new Animal();

    Feline feline = new Feline();


    @Test
    public void testEatMeat() throws Exception {
        List<String> actual = feline.eatMeat();
        List<String> expected = animal.getFood("Хищник");
        Assert.assertEquals(expected, actual);
    }
}