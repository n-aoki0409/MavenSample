import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

public class TestSample {

	@Test
	public void testMethod1() {
		Assert.assertThat(new Sample().method1(), is(1));
	}
}
