import org.junit.Assert;
import org.junit.Test;

import main.Main;
public class mainTest 
{
	@Test
	public void testArmarInstancia() 
	{
		String[] args = new String[10];
		
		Assert.assertTrue(Main.run(args));
	}
}
