package com.rahul.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Welcome {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }

    @Id
    @GeneratedValue
    int id;
    String welcome;
}
