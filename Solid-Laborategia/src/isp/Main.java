package isp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		GmailAccount g = new GmailAccount("Pablo", "Pablo@ehu.eus");
		EmailSender.sendEmail(g, "Kaixo");
		//SMSSender.sendSMS(g,"Kaixo"); ERROREA emango du.
		
		Person p = new Person();
		p.setEmail("Mikel@gmail.com");
		p.setTelephone("699327422");
		EmailSender.sendEmail(p, "kaixo");
		SMSSender.sendSMS(p, "kaixo"); 

	}

}
