package mail;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
public class MailSenderTest {

	@Test
	public void Test() {
		
		MailConfig mc = new MailConfig();
		mc.setToMail("kei_0@hotmail.com.ar");
		MailSender ms = new MailSender(mc);
		String s1 = "asunto_Test";
		String s2 = "mensaje_test";
		String s3 = mc.getFormMail();
		
		ms.SendMail(s1, s2);
		assertFalse(s2.equals("quadrasoft@gmail.com"));		
		
	}
	
	
	
}
