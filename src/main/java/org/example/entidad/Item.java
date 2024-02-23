package org.example.entidad;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToOne
    private Box box;
    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "item_category",
            joinColumns = @JoinColumn(name = "item_id"),
            inverseJoinColumns = @JoinColumn(name = "category_id"))
    private List<Category> categories;
    @OneToOne(mappedBy = "item")
    private Loan loans;

    public Item() {
    }

    public Item(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Item(Long id, String name, String description, Box box, List<Category> categories, Loan loans) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.box = box;
        this.categories = categories;
        this.loans = loans;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Box getBox() {
        return box;
    }

    public void setBox(Box box) {
        this.box = box;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Loan getLoans() {
        return loans;
    }

    public void setLoans(Loan loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", box=" + box +
                ", categories=" + categories +
                ", loans=" + loans +
                '}';
    }
}
