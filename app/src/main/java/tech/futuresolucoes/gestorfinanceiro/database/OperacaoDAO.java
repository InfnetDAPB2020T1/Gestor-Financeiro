package tech.futuresolucoes.gestorfinanceiro.database;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import tech.futuresolucoes.gestorfinanceiro.models.Operacao;

@Dao
public interface OperacaoDAO {
    @Insert
    void armazenarOp(Operacao op);

    @Insert
    void armazenarops(Operacao... op);

    @Update
    void updateOp(Operacao op);


    @Delete
    void deleteOp(Operacao op);

    @Query("SELECT * FROM operacoes")
    List<Operacao> selectAll();


    @Query("SELECT * FROM operacoes WHERE id =:id")
    Operacao selectId(int id);

    @Query("SELECT * FROM operacoes WHERE userOwnerId =:userOwnerId")
    List<Operacao> selectOpsByUserId(int userOwnerId);
}

