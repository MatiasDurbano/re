package mail;

public class MailConfig {

	private String formMail;
	private String password;
	private String toMail;
	
	public MailConfig() {
		this.formMail = "quadrasoft.ungs@gmail.com";
		this.password = "159ungs159";
		this.toMail = "je.d.10@hotmail.com";
	}

	public String getFormMail() {
		return formMail;
	}

	public void setFormMail(String formMail) {
		this.formMail = formMail;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getToMail() {
		return toMail;
	}

	public void setToMail(String toMail) {
		this.toMail = toMail;
	}
	
	
}
