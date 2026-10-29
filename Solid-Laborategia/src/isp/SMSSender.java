package isp;

public class SMSSender {

	public static void sendSMS(SMSRecipient c, String message){
		//SMS bat bidaltzen du Person klaseko telefono zenbakira. 
		 System.out.println("SMS: " + c.getTelephone() + ": " + message);
		}
}
