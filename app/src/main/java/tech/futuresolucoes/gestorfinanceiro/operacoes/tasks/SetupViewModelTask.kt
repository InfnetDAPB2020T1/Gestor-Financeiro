package tech.futuresolucoes.gestorfinanceiro.operacoes.tasks

import android.content.Context
import android.os.AsyncTask
import tech.futuresolucoes.gestorfinanceiro.database.DbBuilder
import tech.futuresolucoes.gestorfinanceiro.models.Categoria

class SetupViewModelTask(val context : Context, val id : Int) : AsyncTask<Void, Void, Categoria>(){

    override fun doInBackground(vararg params: Void?): Categoria {
        val db = DbBuilder.getInstance(context)
        return db.categoriaDAO().selectId(id)
    }



}