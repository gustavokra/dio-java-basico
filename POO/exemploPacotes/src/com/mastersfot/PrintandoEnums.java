package com.mastersfot;

import enums.EnumDiaSemana;
import enums.EnumEscolaridade;
import enums.EnumEstado;
import enums.EnumEstadoCivil;

public class PrintandoEnums {
	
	public static void main(String[] args) {
		for(EnumEscolaridade escolaridade : EnumEscolaridade.values()) {
			System.out.println(escolaridade.getDescricao());
		}
		
		for(EnumDiaSemana dia : EnumDiaSemana.values()) {
			System.out.println(dia.getDescricao() + " " + dia.getChave());
		}
		
	}
	
}
