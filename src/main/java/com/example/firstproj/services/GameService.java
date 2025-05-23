package com.example.firstproj.services;

import java.util.ArrayList;
import java.util.List;

import com.example.firstproj.dataclass.Game;
import com.example.firstproj.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {


    List<Game> gameList;

    public GameService() {
        this.gameList = createGAmeList();
    }

    private List<Game> createGAmeList() {
        return new ArrayList<>(List.of(new Game("GTA V", 4000, 99.8), new Game("GTA IV", 3000, 9.8), new Game("God of war", 4000, 85.5), new Game("NFS", 2000, 20.4)));

    }
    @Autowired
    public GameRepository gr;

    public List<Game> getGames() {
        return gr.findAll();
    }

    public Game getGameByName(String name) {

        return gameList.stream().filter(p -> p.getName().equalsIgnoreCase(name)).findFirst().get();
    }

    public void addGame(Game gme) {
       gr.save(gme);
    }

}
