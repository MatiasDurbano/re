import org.junit.Assert;
import org.junit.Test;


import modelo.TextAnalyzer;

public class TextAnalyzerTest {
	
	@Test
	public void test1() {
		Assert.assertFalse(TextAnalyzer.encontrar("pure", "buenos dias"));
		Assert.assertTrue(TextAnalyzer.encontrar("pure", "que rico pure"));
		Assert.assertFalse(TextAnalyzer.encontrar("puxr", "que rico pure"));
	}
}
