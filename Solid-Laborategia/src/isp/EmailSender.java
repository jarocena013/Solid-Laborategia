package isp;

public class EmailSender {
	
	 public static void sendEmail(EmailRecipient c, String message){
		// Mezu bat bidaltzen du Person klaseko korreo helbidera. 
		 System.out.println("Email: " + c.getEmail() + ": " + message);
		}

}
