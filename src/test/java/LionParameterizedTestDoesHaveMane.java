import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;


@RunWith(Parameterized.class)
public class LionParameterizedTestDoesHaveMane {
    @Mock
    Feline feline;

    private final String sex;
    private final boolean expectedHasMane;

    public LionParameterizedTestDoesHaveMane(String sex, boolean expectedHasMane){
        this.sex = sex;
        this.expectedHasMane = expectedHasMane;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { "Самец", true},
                { "Самка", false}
        };
    }
    @Test
    public void parameterizedTestFelineGetKittensNotNull() throws Exception {
        Lion lion = new Lion(sex, feline);
        boolean exception = expectedHasMane;
        boolean actual = lion.doesHaveMane();
        Assert.assertEquals(exception, actual);
    }
}