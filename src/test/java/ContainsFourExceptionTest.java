import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import ru.geekbrains.java3.lesson6.ContainsFour;

public class ContainsFourExceptionTest {
    private ContainsFour containsFour;

    @Before
    public void init(){
        containsFour = new ContainsFour();
    }


    @Test(expected = RuntimeException.class)
    public void containsFourExceptionTest(){
        Assert.assertArrayEquals(new int[]{}, containsFour.containsFour(new int[]{1,3,5,10,16,22,7,3,2,1}));
    }
}
