package fr.efrei.pokemon.models;

import jakarta.persistence.*;

@Entity
public class Arena {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;

    private String name;

    private String location;

    @ManyToOne
    private Trainer leader; // Le dresseur qui est le lead de l'arène

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Trainer getLeader() {
        return leader;
    }

    public void setLeader(Trainer leader) {
        this.leader = leader;
    }
}
