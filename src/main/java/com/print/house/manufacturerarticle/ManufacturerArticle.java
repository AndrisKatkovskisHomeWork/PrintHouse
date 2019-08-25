package com.print.house.manufacturerarticle;

import javax.persistence.*;

@Entity
public class ManufacturerArticle {

    @Id
    @Column(name = "id_manufacturer_article")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "manufacturer_name")
    private String manufacturerName;

    @Column(name = "model_name")
    private String modelName;

    @Column(name = "model_number")
    private String modelNumber;

    public ManufacturerArticle() {
    }

    public ManufacturerArticle(String manufacturerName, String modelName, String modelNumber) {
        this.manufacturerName = manufacturerName;
        this.modelName = modelName;
        this.modelNumber = modelNumber;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }
}
