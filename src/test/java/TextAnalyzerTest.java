import org.junit.Assert;
import org.junit.Test;


import modelo.TextAnalyzer;

public class TextAnalyzerTest {
	
	@Test
	public void test1() {
		TextAnalyzer textAnalyzer = new TextAnalyzer();
		Assert.assertFalse(textAnalyzer.encontrar("pure", "buenos dias"));
		Assert.assertTrue(textAnalyzer.encontrar("pure", "que rico pure"));
		Assert.assertFalse(textAnalyzer.encontrar("puxr", "que rico pure"));
	}
}
