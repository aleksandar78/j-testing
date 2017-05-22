import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by aleksandar on 22/05/17.
 */
public class SimpleCaseTest {

    @Test
    public void shouldGiveAlwaysTrue() throws Exception {
        assertThat(SimpleCase.alwaysFalse(), CoreMatchers.equalTo(false));
    }

    @Test
    public void shouldGiveAlwaysFalse() throws Exception {
        assertThat(SimpleCase.alwaysFalse(), CoreMatchers.equalTo(true));
    }
}