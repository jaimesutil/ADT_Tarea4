package org.example.entidad;

import jakarta.persistence.*;

@Entity
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private String user;
    @OneToOne
    private Item item;
    private String checkout_date;
    private String due_date;
    private String returned_date;

    public Loan() {
    }

    public Loan(Long id, String user, Item item, String checkout_date, String due_date, String returned_date) {
        this.id = id;
        this.user = user;
        this.item = item;
        this.checkout_date = checkout_date;
        this.due_date = due_date;
        this.returned_date = returned_date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getCheckout_date() {
        return checkout_date;
    }

    public void setCheckout_date(String checkout_date) {
        this.checkout_date = checkout_date;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public String getReturned_date() {
        return returned_date;
    }

    public void setReturned_date(String retured_date) {
        this.returned_date = retured_date;
    }

    @Override
    public String toString() {
        return "Loan{" +
                "id=" + id +
                ", user='" + user + '\'' +
                ", item=" + item +
                ", checkout_date='" + checkout_date + '\'' +
                ", due_date='" + due_date + '\'' +
                ", retured_date='" + returned_date + '\'' +
                '}';
    }
}
