package com.zup.lucasciscar.cartaotransacao.dto;

import com.zup.lucasciscar.cartaotransacao.model.Cartao;

public class CartaoResponse {

    private String numero;
    private String email;

    public CartaoResponse(Cartao cartao) {
        numero = cartao.getNumero();
        email = cartao.getEmail();
    }

    public String getNumero() {
        return numero;
    }

    public String getEmail() {
        return email;
    }
}
