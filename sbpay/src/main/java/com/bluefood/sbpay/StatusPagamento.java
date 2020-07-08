package com.bluefood.sbpay;

public enum StatusPagamento {

	Autorizado("Autorizado"),
	NaoAutorizado("Não autorizado pela instituição financeira"),
	CartaoInvalido("Cartão inválido ou bloqueado");
	
	 String descricao;
	
	StatusPagamento(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
