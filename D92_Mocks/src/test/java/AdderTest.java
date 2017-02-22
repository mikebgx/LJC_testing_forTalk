import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by mikeburton on 16/12/2016.
 */
@RunWith(MockitoJUnitRunner.class)
public class AdderTest {

    @Mock
    private Inputter inputter;  // (Mockito can mock Classes too, not just interfaces)

    @Test
    public void add3InputInts() throws Exception {

        Adder adder = new Adder();
        when(inputter.nextInt()).thenReturn(1).thenReturn(2).thenReturn(3);
        adder.setInputter( inputter );

        int result= adder.add3InputInts();

        assertThat( result, equalTo(6) );  // 3 or 6 depending which "when" call we do, above
        // Or 6 if we instead did: when(inputter.nextInt()).thenReturn(1).thenReturn(2).thenReturn(3);

    }

}