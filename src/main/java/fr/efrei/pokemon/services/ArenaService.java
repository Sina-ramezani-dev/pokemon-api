package fr.efrei.pokemon.services;

import fr.efrei.pokemon.models.Arena;
import fr.efrei.pokemon.repositories.ArenaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ArenaService {

    private final ArenaRepository arenaRepository;

    @Autowired
    public ArenaService(ArenaRepository arenaRepository) {
        this.arenaRepository = arenaRepository;
    }

    public List<Arena> findAll() {
        return arenaRepository.findAll();
    }

    public Arena findById(String id) {
        return arenaRepository.findById(id).orElse(null);
    }

    public void save(Arena arena) {
        arenaRepository.save(arena);
    }

    public void delete(String id) {
        arenaRepository.deleteById(id);
    }

    public void update(String id, Arena arenaBody) {
        Arena arenaAModifier = findById(id);
        arenaAModifier.setName(arenaBody.getName());
        arenaAModifier.setLocation(arenaBody.getLocation());
        arenaAModifier.setLeader(arenaBody.getLeader());
        arenaRepository.save(arenaAModifier);
    }
}
