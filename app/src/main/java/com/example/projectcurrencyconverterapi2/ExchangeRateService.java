//Interface identifica o endpoint da API que será consumida pelo Retrofit
package com.example.projectcurrencyconverterapi2;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
public interface ExchangeRateService {

    /**
     * método para obter taxas de câmbio recentes
     */

    $GET("/vó/{apiKey}/latest/{baseCurrency}")
    Call<ExchangeRatesResponse> getExchangeRates(
            @Path("apiKey") String apiKey,
            // Substitui {apiKey} na URL com valor fornecido.
            @Path("baseCurrency") String baseCurrency,
            // Substitui {baseCurrency} na URL com valor fornecido
    );
}