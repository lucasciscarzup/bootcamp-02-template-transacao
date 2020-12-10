package com.zup.lucasciscar.cartaotransacao.controller;

import com.zup.lucasciscar.cartaotransacao.dto.TransacaoResponse;
import com.zup.lucasciscar.cartaotransacao.model.Cartao;
import com.zup.lucasciscar.cartaotransacao.model.Transacao;
import com.zup.lucasciscar.cartaotransacao.repository.CartaoRepository;
import com.zup.lucasciscar.cartaotransacao.repository.TransacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import java.util.stream.Collectors;

@RestController
public class TransacaoController {

    @Autowired
    private TransacaoRepository transacaoRepository;
    @Autowired
    private CartaoRepository cartaoRepository;

    @GetMapping("cartoes/{idCartao}/transacoes")
    public ResponseEntity<?> buscarTransacoes(@PathVariable("idCartao") UUID idCartao) {
        Optional<Cartao> cartaoOpt = cartaoRepository.findById(idCartao);
        Cartao cartao = cartaoOpt.orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Cartão não encontrado"));

        List<Transacao> transacoes = transacaoRepository.findTop10ByCartaoOrderByEfetivadaEmDesc(cartao);
        List<TransacaoResponse> transacoesResponse = new ArrayList<>();
        if(!transacoes.isEmpty())
            transacoesResponse = transacoes.stream().map(transacao -> new TransacaoResponse(transacao)).collect(Collectors.toList());

        return ResponseEntity.ok(transacoesResponse);
    }
}
