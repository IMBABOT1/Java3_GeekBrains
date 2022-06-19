import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.java3.lesson6.ContainsFour;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class ContainsFourTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
            return Arrays.asList(new Object[][]{
                    {new int[]{1,3,5,10,16,22,4,7,3,2,1}, new int[]{7,3,2,1}},
                    {new int[]{1,3,5,10,16,22,7,3,2,1}, new int[]{7,3,2,1}},
                    {new int[]{1,3,5,10,16,22,7,4,3,2,1}, new int[]{3,2,1}},
                    {new int[]{1,4}, new int[]{}}
        });
    }


    private int[] input;
    private int[] output;

    public ContainsFourTest(int[] input, int[] output) {
        this.input = input;
        this.output = output;
    }
    private ContainsFour containsFour;

    @Before
    public void init(){
        containsFour = new ContainsFour();
    }

    @Test
    public void containsFourTest(){
        Assert.assertArrayEquals(output, containsFour.containsFour(input));
    }
}
