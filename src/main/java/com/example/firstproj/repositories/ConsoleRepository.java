package com.example.firstproj.repositories;

import com.example.firstproj.dataclass.Consoles;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ConsoleRepository extends MongoRepository<Consoles, String> {
}
