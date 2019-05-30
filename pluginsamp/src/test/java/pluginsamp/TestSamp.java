package pluginsamp;

import org.junit.Before;
import org.junit.Test;

public class TestSamp {
	String msg;
	@Before
	public void begin()
	{
		msg="Project execution successful";
	}
	@Test
	public void done()
	{
		System.out.println(msg);
	}
	

}
