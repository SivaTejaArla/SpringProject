package com.example.firstproj.repositories;

import com.example.firstproj.dataclass.Game;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {

    // 🔍 Find game by name (case-insensitive)
    Optional<Game> findByNameIgnoreCase(String name);

    // 🔍 Find games by exact price
    List<Game> findByPrice(double price);

    // 🔍 Find games with price less than or equal to a value
    List<Game> findByPriceLessThanEqual(double maxPrice);

    // 🔍 Find games with name containing a string (like search)
    List<Game> findByNameContainingIgnoreCase(String keyword);
}
