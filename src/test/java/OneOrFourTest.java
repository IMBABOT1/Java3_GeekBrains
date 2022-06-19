import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import ru.geekbrains.java3.lesson6.ContainsFour;
import ru.geekbrains.java3.lesson6.OneOrFour;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(Parameterized.class)
public class OneOrFourTest {
    @Parameterized.Parameters
    public static Collection<Object[]> params(){
        return Arrays.asList(new Object[][]{
                {new int[]{1, 1, 1, 4, 4, 1, 4, 4}, true},
                {new int[]{1, 1, 1, 1, 1, 1}, false},
                {new int[]{4,4,4,4},false},
                {new int[]{1, 4, 4, 1, 1, 4, 3}, false},
                {new int[]{4}, false},
                {new int[]{1}, false},
                {new int[]{1,4}, true}

        });
    }


    private int[] input;
    private boolean output;

    public OneOrFourTest(int[] input, boolean output) {
        this.input = input;
        this.output = output;
    }
    private OneOrFour oneOrFour;

    @Before
    public void init(){
        oneOrFour = new OneOrFour();
    }

    @Test
    public void containsFourTest(){
        Assert.assertEquals(output, oneOrFour.oneOrFour(input));
    }
}
