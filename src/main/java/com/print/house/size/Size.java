package com.print.house.size;

import javax.persistence.*;

@Entity
public class Size {

    @Id
    @Column(name = "id_size")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "size_name")
    private String sizeName;

    public Size() {
    }

    public Size(String sizeName) {
        this.sizeName = sizeName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSizeName() {
        return sizeName;
    }

    public void setSizeName(String sizeName) {
        this.sizeName = sizeName;
    }
}