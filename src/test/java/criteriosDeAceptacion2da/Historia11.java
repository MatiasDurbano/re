package criteriosDeAceptacion2da;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

import mail.MailConfig;
import mail.MailMessage;
import mail.MailSender;
import modelo.Menu;
import modelo.Plato;

public class Historia11 {
	
	@Test
	public void test1() {
		Menu menu = new Menu();
		Plato p1 = BateriaDeTest.arrozConTuco();
		Plato p2 = BateriaDeTest.ensalada();
		menu.agregarPlato(p1);
		menu.agregarPlato(p2);
		
		MailConfig mc = new MailConfig();
		MailSender ms = new MailSender(mc);
		String s1 = "Recomendacion de Menu";
		String s2 = MailMessage.crearMensaje(menu);
		String s3 = mc.getFormMail();		
		boolean test1 = ms.SendMail(s1, s2);
		assertTrue(test1);		
	}
	
	@Test
	public void test2() {
		Menu menu = new Menu();
		Plato p1 = BateriaDeTest.arrozConTuco();
		Plato p2 = BateriaDeTest.ensalada();
		menu.agregarPlato(p1);
		menu.agregarPlato(p2);
		
		MailConfig mc = new MailConfig();
		mc.setFormMail("correofalso@g@gmail.com"); //cambio el correo enviador
		MailSender ms = new MailSender(mc);
		String s1 = "Recomendacion de Menu";
		String s2 = MailMessage.crearMensaje(menu);
		String s3 = mc.getFormMail();		
		boolean test2 = ms.SendMail(s1, s2);
		assertTrue(test2);		
	}

}
