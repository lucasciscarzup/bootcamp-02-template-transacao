package com.zup.lucasciscar.cartaotransacao.repository;

import com.zup.lucasciscar.cartaotransacao.model.Cartao;
import com.zup.lucasciscar.cartaotransacao.model.Transacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface TransacaoRepository extends JpaRepository<Transacao, UUID> {

    List<Transacao> findTop10ByCartaoOrderByEfetivadaEmDesc(Cartao cartao);

}
