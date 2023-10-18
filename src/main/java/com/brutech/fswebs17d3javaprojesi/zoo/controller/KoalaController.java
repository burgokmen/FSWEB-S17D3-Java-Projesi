package com.brutech.fswebs17d3javaprojesi.zoo.controller;

import com.brutech.fswebs17d3javaprojesi.zoo.entity.Gender;
import com.brutech.fswebs17d3javaprojesi.zoo.entity.Koala;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/koalas")
public class KoalaController {
    private Map<Integer, Koala> koalas;

    @PostConstruct
    public void init() {
        koalas = new HashMap<>();
        koalas.put(1, new Koala(1, "Koa", 200, 10, Gender.MALE));
    }

    @GetMapping("/")
    public List<Koala> get() {
        return koalas.values().stream().toList();
    }

    @GetMapping("/{id}")
    public Koala getById(@PathVariable int id) {
        return koalas.get(id);
    }

    @PostMapping("/")
    public Koala save(@RequestBody Koala kangaroo) {
        koalas.put(kangaroo.getId(), kangaroo);
        return kangaroo;
    }

    @PutMapping("/{id}")
    public Koala update(@RequestBody Koala kangaroo, @PathVariable int id){
        koalas.put(id, kangaroo);
        return koalas.get(id);
    }

    @DeleteMapping("/{id}")
    public Koala delete(@PathVariable int id){
        return koalas.remove(id);
    }

}
