package tech.futuresolucoes.gestorfinanceiro.categorias.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.categoria_recycler.view.*
import tech.futuresolucoes.gestorfinanceiro.CategoriasActivity
import tech.futuresolucoes.gestorfinanceiro.OperacoesActivity
import tech.futuresolucoes.gestorfinanceiro.R
import tech.futuresolucoes.gestorfinanceiro.models.Categoria

class CategoriaAdapter(val categorias : MutableList<Categoria>, val context: Context) : RecyclerView.Adapter<CategoriaAdapter.CategoriaViewHolder>(){

    class CategoriaViewHolder(view: View) : RecyclerView.ViewHolder(view){

        val name = view.txtVw_ctg_name
        val operacoes = view.txtVw_ctg_operacoes

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CategoriaViewHolder =
        CategoriaViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.categoria_recycler, parent, false)
        )


    override fun getItemCount(): Int = categorias.size

    override fun onBindViewHolder(holder: CategoriaViewHolder, position: Int) {
        val categoria = categorias[position]
        holder.name.text = categoria.nome.toString()
        holder.operacoes.setOnClickListener{
            val intent = Intent(context, OperacoesActivity::class.java)
            intent.putExtra("nome", categoria.id.toString())
            context.startActivity(intent)
        }
    }



}