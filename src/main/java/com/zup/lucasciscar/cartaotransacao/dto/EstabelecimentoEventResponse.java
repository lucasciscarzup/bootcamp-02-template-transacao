package com.zup.lucasciscar.cartaotransacao.dto;

import com.zup.lucasciscar.cartaotransacao.model.Estabelecimento;

public class EstabelecimentoEventResponse {

    private String nome;
    private String cidade;
    private String endereco;

    public EstabelecimentoEventResponse() {}

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Estabelecimento toModel() {
        return new Estabelecimento(nome, cidade, endereco);
    }
}
