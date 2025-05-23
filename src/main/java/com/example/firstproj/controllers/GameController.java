package com.example.firstproj.controllers;


import com.example.firstproj.dataclass.Game;
import com.example.firstproj.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GameController {

    @Autowired
    GameService g;

    @GetMapping("/getAllGames")
    public List<Game> showGames() {
        return g.getGames();
    }

    @GetMapping("/getGame/{name}")
    public Game showGameByName(@PathVariable String name) {
        return g.getGameByName(name);
    }

    @PostMapping("/postGame")
    public void addGame(@RequestBody Game gme) {
        g.addGame(gme);
    }


}
