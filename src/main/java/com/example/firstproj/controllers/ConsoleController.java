package com.example.firstproj.controllers;


import com.example.firstproj.dataclass.Consoles;
import com.example.firstproj.services.ConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ConsoleController {

    @Autowired
    ConsoleService cs;

    @GetMapping("getAllConsoles")
    public List<Consoles> showConsoles(){
        return cs.getConsolesList();
    }

    @PostMapping("postConsole")
    public void postConsoles(@RequestBody Consoles cn){
        cs.postConsole(cn) ;
    }
}
