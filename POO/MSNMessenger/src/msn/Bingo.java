package msn;

public class Bingo extends Messenger {
	
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem BINGO");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem BINGO");
		salvarHistoricoMensagem();
	}
}
