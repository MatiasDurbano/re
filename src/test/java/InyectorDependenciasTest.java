import main.InyectorDependencias;

import org.junit.Assert;
import org.junit.Test;

public class InyectorDependenciasTest 
{
	@Test
	public void testArmarInstancia() 
	{
		Assert.assertNotEquals(null,InyectorDependencias.crearAPP());
	}
}
