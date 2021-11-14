import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineTestGetFamily {

    Feline feline = new Feline();

    @Test
    public void testGetFamily() {
        String actual = feline.getFamily();
        String expected = "Кошачьи";
        Assert.assertEquals(expected, actual);
    }
}