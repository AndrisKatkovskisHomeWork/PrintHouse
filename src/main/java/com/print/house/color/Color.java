package com.print.house.color;

import javax.persistence.*;

@Entity
public class Color {

    @Id
    @Column(name = "id_color")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "color_name")
    private String colorName;

    public Color() {
    }

    public Color(String colorName) {
        this.colorName = colorName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }
}