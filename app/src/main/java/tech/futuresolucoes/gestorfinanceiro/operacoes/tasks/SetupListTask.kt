package tech.futuresolucoes.gestorfinanceiro.operacoes.tasks

import android.content.Context
import android.os.AsyncTask
import tech.futuresolucoes.gestorfinanceiro.database.DbBuilder
import tech.futuresolucoes.gestorfinanceiro.models.Operacao
import tech.futuresolucoes.gestorfinanceiro.operacoes.fragments.ExibirFragment


class SetupListTask(val context: Context, val fragment : ExibirFragment, val id:Int) : AsyncTask<Void, Void, MutableList<Operacao>>() {

    override fun doInBackground(vararg params: Void?): MutableList<Operacao> {
        return DbBuilder.getInstance(context).operacaoDAO().selectOpsByUserId(id)
    }

    override fun onPostExecute(result: MutableList<Operacao>) {
        super.onPostExecute(result)
        fragment.setList(result)
    }
}