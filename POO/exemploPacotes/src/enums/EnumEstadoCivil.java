package enums;

public enum EnumEstadoCivil {
	SOL("Solteiro"),
	CAS("Casado"),
	DIV("Divorciado"),
	VIU("Viúvo");
	
	private EnumEstadoCivil(String descricao) {
		this.descricao = descricao;
	}
	
	private String descricao;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
