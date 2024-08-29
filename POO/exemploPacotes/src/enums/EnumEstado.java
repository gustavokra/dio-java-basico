package enums;

public enum EnumEstado {
		
	SP("SP", "São Paulo"),
	PR("PR", "Paraná"),
	SC("SC", "Santa Catarina");
	
	private String sigla;
	private String descricao;
	
	private EnumEstado(String sigla, String descricao) {
		this.sigla = sigla;
		this.descricao = descricao;
	}
	
	public String getSigla() {
		return this.sigla;
	}
	
	public String getDescricao() {
		return this.descricao;
	}
	
}
