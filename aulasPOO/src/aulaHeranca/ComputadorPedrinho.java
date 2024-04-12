package aulaHeranca;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msnMessenger = new MSNMessenger();
		
		msnMessenger.enviarMensagem();
		msnMessenger.receberMensagem();
		System.out.println("MSN OK");
		
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		
		facebookMessenger.enviarMensagem();
		facebookMessenger.receberMensagem();
		System.out.println("Facebook OK");
		
		TelegramMessenger telegramMessenger = new TelegramMessenger();
		
		telegramMessenger.enviarMensagem();
		telegramMessenger.receberMensagem();
		System.out.println("Telegram OK");	
	}
}
