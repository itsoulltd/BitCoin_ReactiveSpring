package com.itsoul.lab.bitcoin.services;

import com.itsoul.lab.bitcoin.models.CoinbaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CoinbaseServiceImpl implements CoinbaseService{

    @Autowired
    private WebClient webClient;

    @Override
    public Mono<CoinbaseResponse> getCryptoPrice(String priceName) {
        return webClient
                .get()
                .uri("https://api.coinbase.com/v2/prices/{cryptoName}/buy", priceName)
                .accept(MediaType.APPLICATION_JSON)
                .exchange()
                .flatMap(coinbase -> coinbase.bodyToMono(CoinbaseResponse.class));
    }
}
