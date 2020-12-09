package com.zup.lucasciscar.cartaotransacao.model;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Positive;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "transacoes")
public class Transacao {

    @Id
    @GeneratedValue
    private UUID id;
    @NotBlank
    private String idLegado;
    @NotNull
    @Positive
    private BigDecimal valor;
    @NotNull
    @Embedded
    private Estabelecimento estabelecimento;
    @NotNull
    @Embedded
    private Cartao cartao;
    @NotNull
    @Past
    private LocalDateTime efetivadaEm;

    @Deprecated
    public Transacao() {}

    public Transacao(@NotBlank String idLegado, @NotNull @Positive BigDecimal valor,
                     @NotNull Estabelecimento estabelecimento, @NotNull Cartao cartao,
                     @NotNull @Past LocalDateTime efetivadaEm) {
        this.idLegado = idLegado;
        this.valor = valor;
        this.estabelecimento = estabelecimento;
        this.cartao = cartao;
        this.efetivadaEm = efetivadaEm;
    }
}
