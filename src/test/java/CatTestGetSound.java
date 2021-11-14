import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class CatTestGetSound {

    Feline feline = new Feline();

    Cat TestCat = new Cat(feline);

    @Test
    public void catTestGetSound() {
        String expected = "Мяу";
        String actual = TestCat.getSound();
        Assert.assertEquals(expected, actual);
    }

}