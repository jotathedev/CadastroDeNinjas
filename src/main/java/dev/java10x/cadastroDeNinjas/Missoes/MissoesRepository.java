package dev.java10x.cadastroDeNinjas.Missoes;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

    @Query("SELECT m FROM MissoesModel m WHERE m.dificuldade = :dificuldade")
    public List<MissoesModel> findByDificuldade(@Param("dificuldade") String dificuldade);

}
