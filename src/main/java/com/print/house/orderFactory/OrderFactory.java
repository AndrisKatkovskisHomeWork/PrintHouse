package com.print.house.orderFactory;

import com.print.house.color.Color;
import com.print.house.manufacturerArticle.ManufacturerArticle;
import com.print.house.size.Size;

import javax.persistence.*;
import java.util.List;

@Entity
public class OrderFactory {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_order_factory")
    private int id;

//    @OneToOne
//    private Day day;

    @OneToOne
    private Color color;

    @OneToOne
    private ManufacturerArticle manufacturerArticle;

    @OneToOne
    private Size size;

//    @ManyToMany
//    private List<Accessory> accessories;

//    private String email;


    public OrderFactory() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ManufacturerArticle getManufacturerArticle() {
        return manufacturerArticle;
    }

    public void setManufacturerArticle(ManufacturerArticle manufacturerArticle) {
        this.manufacturerArticle = manufacturerArticle;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }
}
