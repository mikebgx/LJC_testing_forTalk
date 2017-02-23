import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers. lessThan;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by mikeburton on 16/12/2016.
 */
public class CalculatorTest {

    @Test
    public void test1() throws Exception {
        int max= 10;
        int result= 11;
        assertThat(s, notNull());
        
        assertThat( result, lessThan(max) );
        // assertThat( result, new LessThanMatcher(max) );
        // Function Object  /  Factory method

    }

}