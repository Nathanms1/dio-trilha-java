package aulaAbstracao;

public class ComputadorPedrinho {
	public static void main(String[] args) {
		MSNMessenger msnMessenger = new MSNMessenger();
		
		msnMessenger.enviarMensagem();
		msnMessenger.receberMensagem();
		
		FacebookMessenger facebookMessenger = new FacebookMessenger();
		
		facebookMessenger.enviarMensagem();
		facebookMessenger.receberMensagem();
		
		TelegramMessenger telegramMessenger = new TelegramMessenger();
		
		telegramMessenger.enviarMensagem();
		telegramMessenger.receberMensagem();
	}
}
