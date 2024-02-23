package org.example.entidad;

import jakarta.persistence.*;

@Entity
public class Box {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String label;
    private String location;
    @OneToMany(mappedBy = "box")
    private Item items;


    public Box() {
    }

    public Box(String label, String location) {
        this.label = label;
        this.location = location;
    }

    public Box(Long id, String label, String location, Item items) {
        this.id = id;
        this.label = label;
        this.location = location;
        this.items = items;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Item getItems() {
        return items;
    }

    public void setItems(Item items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Box{" +
                "id=" + id +
                ", label='" + label + '\'' +
                ", location='" + location + '\'' +
                ", items=" + items +
                '}';
    }
}
