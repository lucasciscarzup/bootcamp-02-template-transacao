package com.zup.lucasciscar.cartaotransacao.dto;

import com.zup.lucasciscar.cartaotransacao.model.Estabelecimento;

public class EstabelecimentoResponse {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoResponse(Estabelecimento estabelecimento) {
        nome = estabelecimento.getNome();
        cidade = estabelecimento.getCidade();
        endereco = estabelecimento.getEndereco();
    }

    public String getNome() {
        return nome;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEndereco() {
        return endereco;
    }
}
