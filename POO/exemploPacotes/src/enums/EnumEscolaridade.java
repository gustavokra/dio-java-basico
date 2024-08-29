package enums;

public enum EnumEscolaridade {
	ANA("Analfabeto"),
	FUN("Fundamental"),
	MED("Médio"),
	SUP("Superior");
	
	private String descricao;
	
	private EnumEscolaridade(String descricao) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}
	
}
