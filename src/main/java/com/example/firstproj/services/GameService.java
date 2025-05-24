package com.example.firstproj.services;

import java.util.List;
import java.util.Optional;

import com.example.firstproj.dataclass.Game;
import com.example.firstproj.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    public List<Game> getGames() {
        return gameRepository.findAll();
    }

    public Game getGameByName(String name) {
        Optional<Game> game = gameRepository.findByNameIgnoreCase(name);
        return game.orElse(null); // or throw custom exception if preferred
    }

    public void addGame(Game game) {
        gameRepository.save(game);
    }

    public void updateGame(Game game) {
        gameRepository.save(game);
    }
}
