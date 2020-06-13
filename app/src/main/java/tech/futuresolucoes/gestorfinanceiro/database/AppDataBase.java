package tech.futuresolucoes.gestorfinanceiro.database;


import androidx.room.Database;
import androidx.room.RoomDatabase;

import tech.futuresolucoes.gestorfinanceiro.models.Categoria;
import tech.futuresolucoes.gestorfinanceiro.models.Operacao;

@Database(entities = {Operacao.class, Categoria.class}, version = 1)
public abstract class AppDataBase extends RoomDatabase {


    public abstract OperacaoDAO operacaoDAO();

    public abstract CategoriaDAO categoriaDAO();

}