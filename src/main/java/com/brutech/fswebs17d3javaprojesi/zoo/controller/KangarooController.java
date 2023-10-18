package com.brutech.fswebs17d3javaprojesi.zoo.controller;

import com.brutech.fswebs17d3javaprojesi.zoo.entity.Gender;
import com.brutech.fswebs17d3javaprojesi.zoo.entity.Kangaroo;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/kangaroos")
public class KangarooController {
    private Map<Integer, Kangaroo> kangaroos;

    @PostConstruct
    public void init() {
        kangaroos = new HashMap<>();
        kangaroos.put(1, new Kangaroo(1, "Boxer", 200, 100, Gender.MALE, true));
    }

    @GetMapping("/")
    public List<Kangaroo> get() {
        return kangaroos.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Kangaroo getById(@PathVariable int id) {
        return kangaroos.get(id);
    }

    @PostMapping("/")
    public Kangaroo save(@RequestBody Kangaroo kangaroo) {
        kangaroos.put(kangaroo.getId(), kangaroo);
        return kangaroo;
    }

    @PutMapping("/{id}")
    public Kangaroo update(@RequestBody Kangaroo kangaroo, @PathVariable int id){
        kangaroos.put(id, kangaroo);
        return kangaroos.get(id);
    }

    @DeleteMapping("/{id}")
    public Kangaroo delete(@PathVariable int id){
        return kangaroos.remove(id);
    }
}
