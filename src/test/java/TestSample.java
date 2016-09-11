import static org.hamcrest.CoreMatchers.is;
import org.junit.Assert;
import org.junit.Test;

public class TestSample {

	@Test
	public void testMethod1_Success() {
		Assert.assertThat(new Sample().method1(1), is(1));
	}
}
