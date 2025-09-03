// Modelo de dados (DTO - Data Transfer Object) que representa a resposta json da API
package com.example.projectcurrencyconverterapi2;

import java.util.HashMap; // Importa a classe Map da biblioteca Java, usada para armazenar pares das chave-valor.
import java.util.Map; // Importa a classe Map da biblioteca Java, usada para armazenar pares chave-valor.

public class ExchangeRatesResponse {
    // Declara um mapa que armazena taxas de conversão em moedas. (ex. USD, EUR, GBP).
    // A chave (String) representa o código da Moeda e o valor (Double) representa a taxa de conversão.

    private Map<String, Double> conversion_rates = new HashMap<>();
    // Metodo público para acessar as taxas de conversão.
    // Retorna o mapa de taxas de conversão.

    public Map<String, Double> getConversion_rates() {
        return conversion_rates;
    }

}
