import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTestGetFood {

    @Mock
    Feline feline;

    @Test
    public void lionTestGetFood() throws Exception {
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Рыба", "Птицы"));
        Lion lion = new Lion("Самка", feline);
        List<String> actual = lion.getFood();
        List<String> exception = feline.getFood("Хищник");
        Assert.assertEquals(exception, actual);
    }
}