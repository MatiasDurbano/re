package mail;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

public class MailSender {
	
	private Properties props;
	private MailConfig mConfig;
	private Authenticator auth;
	private Session session;
	
	public MailSender(MailConfig mc) {
		this.props = new Properties();
		this.mConfig = mc;
		loadGmailConfig();
		loadAutentication();
	}
	public void loadGmailConfig() {
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.socketFactory.port", "465"); //SSL Port
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory"); //SSL Factory Class
		props.put("mail.smtp.auth", "true"); //Enabling SMTP Authentication
		props.put("mail.smtp.port", "465"); //SMTP Port
	}
	public void loadAutentication() {
		String address = mConfig.getFormMail();
		String pass = mConfig.getPassword();
		this.auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(address, pass);
				}
		};		
	}
	
	public void SendMail(String subject, String message) {
		session = Session.getInstance(props, auth);	
		MailApi.sendEmail(session, mConfig.getToMail(),subject, message);
	}
}
