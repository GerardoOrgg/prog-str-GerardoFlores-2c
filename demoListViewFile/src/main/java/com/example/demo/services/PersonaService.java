package com.example.demo.services;

import com.example.demo.repositories.PersoneFileRepository;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PersonaService {

    PersoneFileRepository repo = new PersoneFileRepository();

    public List<String> loadForListView() throws IOException {
        List<String> lines  = repo.readAllLines();

        List<String> result = new ArrayList<>();

        for (String line : lines){
            if (line == null || line.isBlank()) continue;

            String[] parts = line.split(",");
            String name = parts[0];
            String email = parts[1];
            result.add(name+"-"+email);
        }
        return result;
    }
}
