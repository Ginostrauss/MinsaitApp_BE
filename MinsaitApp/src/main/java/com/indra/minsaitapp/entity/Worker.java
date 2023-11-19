package com.indra.minsaitapp.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "worker")
public class Worker {

    @Getter
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_worker")
    private int matricula;

    @Setter
    @Getter
    @Column(name = "first_name")
    private String name;

    @Setter
    @Getter
    @Column(name = "last_name")
    private String surname;

    @Setter
    @Getter
    @Column(name = "email")
    private String email;

    public Worker() {
        super();
    }

    public Worker(String name, String surname, String email) {
        super();
        this.name = name;
        this.surname = surname;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "matricula=" + matricula +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
