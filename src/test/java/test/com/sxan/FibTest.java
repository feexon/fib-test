package test.com.sxan;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

/**
 * Created with IntelliJ IDEA.
 * User: Administrator
 * Date: 13-5-24
 * Time: 上午9:41
 * To change this template use File | Settings | File Templates.
 */
public class FibTest {
    @Test
    public void constantValue() throws Exception {
        assertThat(fib(1), is(1));
        assertThat(fib(2), is(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldGiveAnInvalidN_raiseException() throws Exception {
        fib(0);
    }

    private int fib(int n) {

        return 1;
    }
}
