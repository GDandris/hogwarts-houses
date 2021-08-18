package com.codecool.hogwartshouses.controller.restController;

import com.codecool.hogwartshouses.model.entity.SpellEntity;
import com.codecool.hogwartshouses.service.SpellService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rest-api/spells")
public class SpellRestController {
    @Autowired
    private SpellService spellService;

    @PostMapping
    public void add(@RequestBody SpellEntity spellEntity) {
        spellEntity.setId(null);
        spellService.save(spellEntity);
    }

    @PutMapping("/{id}")
    public void update(@PathVariable Long id, @RequestBody SpellEntity spellEntity) {
        spellEntity.setId(id);
        spellService.save(spellEntity);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        spellService.delete(id);
    }

    @GetMapping("/{id}")
    public SpellEntity findSpellById(@PathVariable Long id) {
        return spellService.findSpellById(id);
    }

    @GetMapping
    public List<SpellEntity> findAll() {
        return spellService.findAll();
    }
}
