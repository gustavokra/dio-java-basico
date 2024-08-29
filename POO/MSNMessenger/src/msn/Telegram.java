package msn;

public class Telegram extends Messenger  {
	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando Mensagem Telegram");
		salvarHistoricoMensagem();

	}

	@Override
	public void receberMensagem() {
		validarConectadoInternet();
		System.out.println("Recebendo Mensagem Telegram");
		salvarHistoricoMensagem();
	}
}
