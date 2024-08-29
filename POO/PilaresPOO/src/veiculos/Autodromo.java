package veiculos;

public class Autodromo {
	
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.setChassi("12231");
//		jeep.ligar();
		
		Moto z400 = new Moto();
		z400.setChassi("1asd1");
//		z400.ligar();
		
		Veiculo veiculo = z400;
		veiculo.ligar();
				
	}
	
}
