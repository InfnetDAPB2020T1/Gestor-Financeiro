package tech.futuresolucoes.gestorfinanceiro.api;

import retrofit2.Call;
import retrofit2.http.GET;
import tech.futuresolucoes.gestorfinanceiro.models.Cotacao;

public interface CotacaoService {


    @GET("latest?base=USD")
    Call<Cotacao> converterMoeda();


}
