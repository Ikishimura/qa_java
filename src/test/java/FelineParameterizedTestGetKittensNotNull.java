import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;


@RunWith(Parameterized.class)
public class FelineParameterizedTestGetKittensNotNull {

    private final int kittensCount;
    private final int expectedKittensCount;

    public FelineParameterizedTestGetKittensNotNull(int kittensCount,int expectedKittensCount){
        this.kittensCount = kittensCount;
        this.expectedKittensCount = expectedKittensCount;
    }

    @Parameterized.Parameters
    public static Object[][] getKittensCount() {
        return new Object[][] {
                { 2, 2},
                { 3, 3},
        };
    }
    @Test
    public void parameterizedTestFelineGetKittensNotNull(){
        Feline feline = new Feline();
        int actual = feline.getKittens(kittensCount);
        int expected =feline.getKittens(expectedKittensCount);
        Assert.assertEquals(expected, actual);
    }
}

