package aulaAbstracao;

//classes abstratas não possuem corpo, é somente a classe ex: sem um sysout 
/* 
  ex de uma classe não abstrata: 
  public void receberMensagem() {
		System.out.println("Recebendo mensagem");
	}
*/
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();	
}
