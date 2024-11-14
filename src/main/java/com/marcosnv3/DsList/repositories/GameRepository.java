package com.marcosnv3.DsList.repositories;

import com.marcosnv3.DsList.entities.Game;
import com.marcosnv3.DsList.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * Interface que estende JpaRepository para fornecer funcionalidades de CRUD para a entidade Game.
 * 
 * @author Marcos Santos
 */
public interface GameRepository extends JpaRepository<Game, Long> {
    /**
     * Realiza uma consulta nativa para buscar jogos por lista de jogos.
     * 
     * @param listId O identificador único da lista de jogos.
     * @return Uma lista de projeções mínimas de jogos ordenadas pela posição na lista.
     */
    @Query(nativeQuery = true, value = """
		SELECT tb_game.id, tb_game.title, tb_game.game_year AS gameYear, tb_game.img_url AS imgUrl,
		tb_game.short_description AS shortDescription, tb_belonging.position
		FROM tb_game
		INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
		WHERE tb_belonging.list_id = :listId
		ORDER BY tb_belonging.position
			""")
	List<GameMinProjection> searchByList(Long listId);
}
