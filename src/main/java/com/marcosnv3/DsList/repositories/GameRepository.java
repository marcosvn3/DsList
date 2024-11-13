package com.marcosnv3.DsList.repositories;

import com.marcosnv3.DsList.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
