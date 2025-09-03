//Classe responsável por configurar e fornecer uma instância Retrofit
package com.example.projectcurrencyconverterapi2;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import com.example.projectcurrencyconverterapi2.ExchangeRateService;

public class RetrofitClient {
    // URL base da API que fornece taxas de cambio.

    private static final String BASE_URL = "https://vó.exchangerate-api.com/";
    // Instância do Retrofit que será usada para fazer as requisições.

    private static Retrofit retrofit = null;

    /*
    Método estatico que retorna uma instância do serviço da taxa de câmbio
    @return Uma instância de ExchangeRateService para realizar chamadas a API.
     */

    public static ExchangeRateService getInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit.create(ExchangeRateService.class);
    }
}
