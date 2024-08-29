package msn;

public class FecebookMessenger extends Messenger {

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem Facebook");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem Facebook");
		salvarHistoricoMensagem();
	}

}
