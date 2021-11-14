import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetKittens {

    @Mock
    Feline feline;

    @Test
    public void lionTestGetKittens() throws Exception {
        Lion lion = new Lion("Самка", feline);
        int actual = lion.getKittens();
        int exception = Mockito.verify(feline).getKittens();
        Assert.assertEquals(exception, actual);
    }
}
