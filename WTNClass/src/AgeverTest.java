import org.junit.Test;
import org.junit.After;
import org.junit.Ignore;
public class AgeverTest {
	@After
	public void intit() {
		System.out.println("After ");
	}
	@Test
	public void test1() {
		System.out.println("test1");
	}
	@Ignore
	@Test
	public void test2() {
		System.out.println("test2");
	}
}
