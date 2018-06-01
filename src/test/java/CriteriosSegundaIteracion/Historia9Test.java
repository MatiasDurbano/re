package CriteriosSegundaIteracion;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import properties.DataConfig;
import properties.PropertiesLoader;

public class Historia9Test {
	@Rule
	public ExpectedException thrown = ExpectedException.none();
	
	@Test
	public void Test() {
		PropertiesLoader pLoader = new PropertiesLoader();
		DataConfig dConfig;		
		dConfig = pLoader.getDataConfig();
		assertTrue(dConfig.getCachesize() == 5);		
	}
	@Test
	public void Test2() throws NumberFormatException{		
		PropertiesLoader pLoader = new PropertiesLoader();
		pLoader.setDirProperties("src/main/java/properties/testfail.properties");
		DataConfig dConfig;		
		dConfig = pLoader.getDataConfig();
		//assertTrue(dConfig.getCachesize() == 5);		
	}
	@Test
	public void Test3() throws IOException {
		PropertiesLoader pLoader = new PropertiesLoader();
		pLoader.setDirProperties("src/main/java/properties/noexiste.properties");
		DataConfig dConfig;
		//thrown.expect(IOException.class);
		dConfig = pLoader.getDataConfig();
		//assertTrue(dConfig.getCachesize() == 5);
	}
}
