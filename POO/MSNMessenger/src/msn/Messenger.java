package msn;

public abstract class Messenger {
	
	public abstract void enviarMensagem();
	
	public abstract void receberMensagem();
	
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet!");
	}
	
	protected void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico da mensagem!");
	}
	
}
