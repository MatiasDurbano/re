package mail;

import modelo.Menu;

public class MailMessage {
	
	private static String message = "Menu a Sugerir:\n\n";
	private static String saludo = "\n\nSaludos";
	
	public static String crearMensaje(Menu m) {
		String ret ="";
		ret=ret+message+m.toString()+saludo;
		return ret;
	}
}
