package com.itsoul.lab.bitcoin.services;

import com.itsoul.lab.bitcoin.models.CoinbaseResponse;
import reactor.core.publisher.Mono;

public interface CoinbaseService {
    public Mono<CoinbaseResponse> getCryptoPrice(String priceName);
}
