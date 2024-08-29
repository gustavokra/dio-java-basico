package veiculos;

public class Carro extends Veiculo {
	
	public void ligar() {
		System.out.println("Carro Ligado");
		conferindoCambio();
		conferirCombistivel();
	}
	
	private void conferirCombistivel() {
		System.out.println("Conferindo combustível");
	}
	
	private void conferindoCambio() {
		System.out.println("Conferindo cambio em P");
	}

}
