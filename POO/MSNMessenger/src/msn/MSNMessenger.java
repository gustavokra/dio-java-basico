package msn;

public class MSNMessenger extends Messenger  {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem MSN");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem MSN");
		salvarHistoricoMensagem();
	}

}
