package com.indra.minsaitapp.entity;
import com.indra.minsaitapp.enums.Agency;
import com.indra.minsaitapp.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

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
    @Column(name = "role")
    private Role role;

    @Setter
    @Getter
    @Column(name = "agency")
    private Agency agency;

    @Setter
    @Getter
    @Column(name = "entry_date")
    private Date entryDate;

    @Setter
    @Getter
    @Column(name = "exit_date")
    private Date exitDate;

    @Setter
    @Getter
    @ElementCollection
    @CollectionTable(name = "worker_tags", joinColumns = @JoinColumn(name = "id_worker"))
    @Column(name = "tag")
    private Set<String> tags;

    @Setter
    @Getter
    @Column(name = "tasa")
    private float tasa;

    public Worker() {
        super();
    }

    public Worker(String name, String surname, Role role, Agency agency, Date entryDate, Date exitDate, Set<String> tags, float tasa) {
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.agency = agency;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.tags = tags;
        this.tasa = tasa;
    }

    public Worker(int matricula, String name, String surname, Role role, Agency agency, Date entryDate, Date exitDate, Set<String> tags, float tasa) {
        this.matricula = matricula;
        this.name = name;
        this.surname = surname;
        this.role = role;
        this.agency = agency;
        this.entryDate = entryDate;
        this.exitDate = exitDate;
        this.tags = tags;
        this.tasa = tasa;
    }

}
