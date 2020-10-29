package com.demis.springsql.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rec")
public class Rec {
    private int id;
    private Integer value;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "value")
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "id=" + id +
                ", value=" + value +
                '}';
    }
}
