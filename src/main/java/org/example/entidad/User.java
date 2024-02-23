package org.example.entidad;

import jakarta.persistence.*;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    @OneToMany(mappedBy = "user")
    private Loan loans;
    public User() {
    }

    public User(long id, String name, Loan loans) {
        this.id = id;
        this.name = name;
        this.loans = loans;
    }

    public User(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Loan getLoans() {
        return loans;
    }

    public void setLoans(Loan loans) {
        this.loans = loans;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", loans=" + loans +
                '}';
    }
}
