package com.zup.lucasciscar.cartaotransacao.model;

import javax.persistence.Embeddable;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Embeddable
public class Cartao {

    @NotBlank
    private String numCartao;
    @NotBlank
    @Email
    private String email;

    @Deprecated
    public Cartao() {};

    public Cartao(@NotBlank String numCartao, @NotBlank @Email String email) {
        this.numCartao = numCartao;
        this.email = email;
    }
}
