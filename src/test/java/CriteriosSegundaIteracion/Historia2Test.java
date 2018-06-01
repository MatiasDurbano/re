package CriteriosSegundaIteracion;



import org.junit.Assert;
import org.junit.Test;

import Historial.MenuLogger;
import Historial.MenuRecord;
import Historial.ProxyRecordStub;

public class Historia2Test {
	
	@Test
	public void MenuRecordAgregar() {
		MenuRecord menuRecord = BateriaMenuLogger.MenuRecordEscenario2();
		menuRecord.agregar(BateriaDeTest.menuPrueba4());
		Assert.assertEquals(BateriaDeTest.menuRecordExpectativa1(), menuRecord);
	}
	
	@Test
	public void MenuLoggerAgregar() {
		MenuLogger menuLogger = new MenuLogger(BateriaMenuLogger.MenuRecordEscenario1(), BateriaMenuLogger.ProxyRecordStubEscenario1());
		menuLogger.load();
		Assert.assertEquals(BateriaMenuLogger.MenuRecordEscenario2(), menuLogger.getRegistroMenus());
	}
	
	@Test
	public void MenuLoggerSave() {
		MenuLogger menuLogger = new MenuLogger(BateriaMenuLogger.MenuRecordEscenario2(), BateriaMenuLogger.ProxyRecordStubEscenario3());
		menuLogger.save();
		Assert.assertEquals(new ProxyRecordStub().getMenues(), menuLogger.getProxyRecord().getMenues());
	}
	
	@Test
	public void MenuLoggerUpdate() {
		MenuLogger menuLogger = new MenuLogger(BateriaMenuLogger.MenuRecordEscenario1(), BateriaMenuLogger.ProxyRecordStubEscenario1());
		menuLogger.update(BateriaDeTest.menuPrueba1());
		Assert.assertEquals(BateriaDeTest.menuRecordExpectativa2(), menuLogger.getRegistroMenus());
	}
}
