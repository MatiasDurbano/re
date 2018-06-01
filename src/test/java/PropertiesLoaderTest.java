
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import properties.DataConfig;
import properties.PropertiesLoader;
public class PropertiesLoaderTest {
	
	@Test
	public void test() {
		
		PropertiesLoader pLoader = new PropertiesLoader();
		DataConfig dConfig;		
		dConfig = pLoader.getDataConfig();
		assertTrue(dConfig.getCachesize() == 5);
		assertFalse(dConfig.getCachesize() == null);
		assertEquals(dConfig.getFilter(),"celiacos");		
		
	}

}
