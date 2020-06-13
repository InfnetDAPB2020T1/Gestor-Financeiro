package tech.futuresolucoes.gestorfinanceiro.operacoes.viewmodels

import androidx.lifecycle.ViewModel
import tech.futuresolucoes.gestorfinanceiro.models.Categoria

class CategoriaViewModel : ViewModel() {
    var categoria : Categoria? = null
    var navegador = 0
    var mes = 0

    fun incrementar_mes(){
        mes++
    }
    fun decrementar_mes(){
        mes--
    }


}