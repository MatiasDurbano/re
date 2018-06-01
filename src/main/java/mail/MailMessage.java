package mail;

import static org.junit.Assert.assertTrue;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import baterias_test.BateriaDeTest;
import modelo.Menu;
import modelo.MenuCreator;
import modelo.Plato;

public class MailMessage {
	
	private static String message = "Menu Sugerido:\n\n";
	private static String saludo = "\n\nSaludos";
	
	public static String crearMensaje(Menu m) {
		String ret ="";
		ret=ret+message+m.toString()+saludo;
		return ret;
	}
}
