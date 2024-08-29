package enums;

public enum EnumDiaSemana {
	SEG("Segunda", "SEG");
	
	private String descricao;
	
	private String chave;
	
	private EnumDiaSemana(String descricao, String chave) {
		this.descricao = descricao;
		this.chave = chave;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
	public String getChave() {
		return this.chave;
	}
}
