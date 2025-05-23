package com.example.firstproj.repositories;

import com.example.firstproj.dataclass.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface GameRepository extends MongoRepository<Game,String> {
}
