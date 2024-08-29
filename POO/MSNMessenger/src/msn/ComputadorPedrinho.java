package msn;

public class ComputadorPedrinho {
	
	public static void main(String[] args) {	
		
		Messenger ms = null;
		
		String empresaMessenger = "fb";
		
		if(empresaMessenger.equals("fb")) {
			ms = new FecebookMessenger();
		} else if(ms.equals("tl")) {
			ms = new Telegram();
		} else if(ms.equals("bg")) {
			ms = new Bingo();
		} else if (ms.equals("msn")) {
			ms = new MSNMessenger();
		}
		
		ms.enviarMensagem();
		ms.receberMensagem();
	}

}
