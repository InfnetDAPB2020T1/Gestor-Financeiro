package tech.futuresolucoes.gestorfinanceiro.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tech.futuresolucoes.gestorfinanceiro.models.Categoria;

@Dao
public interface CategoriaDAO {

    @Insert
    void armazenar(Categoria ctg);

    @Insert
    void armazenarvar(Categoria... ctg);

    @Update
    void update(Categoria ctg);


    @Delete
    void delete(Categoria ctg);

    @Query("SELECT * FROM categorias")
    List<Categoria> selectAll();


    @Query("SELECT * FROM categorias WHERE id =:id")
    Categoria selectId(int id);

    @Query("SELECT * FROM categorias WHERE nome =:nome")
    Categoria selectByName(String nome);

    @Query("SELECT * FROM categorias WHERE status =:status AND mes=:mes AND userOwnerId =:userOwnerid")
    List<Categoria> selectAllByStatusAndMonth(Boolean status, int mes, String userOwnerid);


}