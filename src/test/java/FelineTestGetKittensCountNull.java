import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;


public class FelineTestGetKittensCountNull {

    Feline feline =new Feline();

    @Test
    public void testGetKittensCountNull(){
        int actual = feline.getKittens();
        int expected = feline.getKittens(1);
        Assert.assertEquals(expected, actual);
    }

}
