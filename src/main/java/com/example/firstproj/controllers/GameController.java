package com.example.firstproj.controllers;

import com.example.firstproj.dataclass.Game;
import com.example.firstproj.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/games") // Common base path for all game-related endpoints
public class GameController {

    @Autowired
    private GameService gameService;

    // ✅ GET all games
    @GetMapping
    public ResponseEntity<List<Game>> getAllGames() {
        List<Game> games = gameService.getGames();
        return new ResponseEntity<>(games, HttpStatus.OK); // 200 OK instead of 302 FOUND
    }

    // ✅ GET game by name
    @GetMapping("/{name}")
    public ResponseEntity<Game> getGameByName(@PathVariable String name) {
        Game game = gameService.getGameByName(name);
        if (game != null) {
            return new ResponseEntity<>(game, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // ✅ POST a new game
    @PostMapping
    public ResponseEntity<String> addGame(@RequestBody Game game) {
        gameService.addGame(game);
        return new ResponseEntity<>("Game added successfully", HttpStatus.CREATED);
    }
    @PutMapping("/{name}")
    public ResponseEntity<String> updateGame(@PathVariable String name, @RequestBody Game updatedGame) {
        Game existingGame = gameService.getGameByName(name);
        if (existingGame == null) {
            return new ResponseEntity<>("Game not found", HttpStatus.NOT_FOUND);
        }

        // Update fields - for example, only update fields you want to allow changing
        existingGame.setPrice(updatedGame.getPrice());
        existingGame.setSize(updatedGame.getSize());
        existingGame.setName(updatedGame.getName());


        // You can also update the name if you want, but usually the name is identifier

        gameService.updateGame(existingGame);
        return new ResponseEntity<>("Game updated successfully", HttpStatus.OK);
    }

}
