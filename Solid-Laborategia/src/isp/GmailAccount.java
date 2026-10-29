package isp;

public class GmailAccount implements EmailRecipient {
	
	String name,emailAddress;
	
	public GmailAccount(String name,String email) {
		this.name=name;
		this.emailAddress=email;
	}
	
	@Override
	public String getEmail() { 
		return emailAddress;
	}

}
