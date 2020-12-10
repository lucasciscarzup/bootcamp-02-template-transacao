package com.zup.lucasciscar.cartaotransacao.dto;

import com.zup.lucasciscar.cartaotransacao.model.Transacao;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TransacaoResponse {

    private BigDecimal valor;
    private EstabelecimentoResponse estabelecimento;
    private CartaoResponse cartao;
    private LocalDateTime efetivadaEm;

    public TransacaoResponse(Transacao transacao) {
        valor = transacao.getValor();
        estabelecimento = new EstabelecimentoResponse(transacao.getEstabelecimento());
        cartao = new CartaoResponse(transacao.getCartao());
        efetivadaEm = transacao.getEfetivadaEm();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public EstabelecimentoResponse getEstabelecimento() {
        return estabelecimento;
    }

    public CartaoResponse getCartao() {
        return cartao;
    }

    public LocalDateTime getEfetivadaEm() {
        return efetivadaEm;
    }
}
