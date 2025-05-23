package com.example.firstproj.services;


import com.example.firstproj.dataclass.Consoles;
import com.example.firstproj.repositories.ConsoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ConsoleService {

public List<Consoles> consolesList;
    public ConsoleService() {
        this.consolesList = createConsoles();
    }

    public List<Consoles> createConsoles(){
        return new ArrayList<>(List.of(new Consoles("XBOX" , 35, "White" ) , new Consoles("PS5" , 50, "White" ) ,new Consoles("PS4" , 25, "Black" )  ));
    }

    @Autowired
    public ConsoleRepository cr;

    public List<Consoles> getConsolesList(){
        return cr.findAll();
    }


    public void postConsole(Consoles cn) {
        cr.save(cn);
    }
}
