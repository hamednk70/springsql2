package com.demis.springsql.demo.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Department {
    private int id;
    private String code;
    private Customer customerByCustomeerId;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "code")
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Department that = (Department) o;
        return id == that.id &&
                Objects.equals(code, that.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, code);
    }

    @ManyToOne
    @JoinColumn(name = "customeer_id", referencedColumnName = "id")
    public Customer getCustomerByCustomeerId() {
        return customerByCustomeerId;
    }

    public void setCustomerByCustomeerId(Customer customerByCustomeerId) {
        this.customerByCustomeerId = customerByCustomeerId;
    }
}
