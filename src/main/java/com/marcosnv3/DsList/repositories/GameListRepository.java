package com.marcosnv3.DsList.repositories;

import com.marcosnv3.DsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
