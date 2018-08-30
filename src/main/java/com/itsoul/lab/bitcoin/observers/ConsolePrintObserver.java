package com.itsoul.lab.bitcoin.observers;

import com.itsoul.lab.bitcoin.models.CoinbaseResponse;
import io.reactivex.observers.DefaultObserver;
import reactor.core.publisher.Mono;

import java.time.LocalDateTime;

public class ConsolePrintObserver extends DefaultObserver {
    @Override
    public void onNext(Object o) {
        Mono<CoinbaseResponse> response = (Mono<CoinbaseResponse>)o;
        response.subscribe(coinbase -> {
            System.out.println("[" + LocalDateTime.now() + "] "
            + coinbase.getData().getBase()
            + " Buy Price: $" + coinbase.getData().getAmount()
            + " " + coinbase.getData().getCurrency());
        });
    }

    @Override
    public void onError(Throwable throwable) {
        System.out.println("error :" + throwable.getMessage());
    }

    @Override
    public void onComplete() {
        System.out.println("Complete");
    }
}
