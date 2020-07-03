import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AgeverTest2 {
	private int input;
	private String output;
	public AgeverTest2 (int input,String output){
		this.input = input;
		this.output = output;
	}
@Parameterized.Parameters
public static Collection init()
{
	// covert object array into collections
	return Arrays.asList(new Object[][] {
		{15,"NO RIGHT TO VOTE"},{22,"RIGHT TO VOTE"},{9,"NO RIGHT TO VOTE"}
	});
}
@Test
public void test() {
	Agever age = new Agever();
	assertEquals(output,age.agev(input));
}
}