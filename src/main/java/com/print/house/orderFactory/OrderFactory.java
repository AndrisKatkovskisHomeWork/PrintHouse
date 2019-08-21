package com.print.house.orderFactory;

import com.print.house.color.Color;
import com.print.house.manufacturerArticle.ManufacturerArticle;

import javax.persistence.*;

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

    private String menXS;
    private String menS;
    private String menM;
    private String menL;
    private String menXL;
    private String menXXL;
    private String menXXXL;

    private String kid6;
    private String kid8;
    private String kid12;

    private String womenXS;
    private String womenS;
    private String womenM;
    private String womenL;
    private String womenXL;
    private String womenXXL;
    private String womenXXXL;

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

    public String getMenXS() {
        return menXS;
    }

    public void setMenXS(String menXS) {
        this.menXS = menXS;
    }

    public String getMenS() {
        return menS;
    }

    public void setMenS(String menS) {
        this.menS = menS;
    }

    public String getMenM() {
        return menM;
    }

    public void setMenM(String menM) {
        this.menM = menM;
    }

    public String getMenL() {
        return menL;
    }

    public void setMenL(String menL) {
        this.menL = menL;
    }

    public String getMenXL() {
        return menXL;
    }

    public void setMenXL(String menXL) {
        this.menXL = menXL;
    }

    public String getMenXXL() {
        return menXXL;
    }

    public void setMenXXL(String menXXL) {
        this.menXXL = menXXL;
    }

    public String getMenXXXL() {
        return menXXXL;
    }

    public void setMenXXXL(String menXXXL) {
        this.menXXXL = menXXXL;
    }

    public String getKid6() {
        return kid6;
    }

    public void setKid6(String kid6) {
        this.kid6 = kid6;
    }

    public String getKid8() {
        return kid8;
    }

    public void setKid8(String kid8) {
        this.kid8 = kid8;
    }

    public String getKid12() {
        return kid12;
    }

    public void setKid12(String kid12) {
        this.kid12 = kid12;
    }

    public String getWomenXS() {
        return womenXS;
    }

    public void setWomenXS(String womenXS) {
        this.womenXS = womenXS;
    }

    public String getWomenS() {
        return womenS;
    }

    public void setWomenS(String womenS) {
        this.womenS = womenS;
    }

    public String getWomenM() {
        return womenM;
    }

    public void setWomenM(String womenM) {
        this.womenM = womenM;
    }

    public String getWomenL() {
        return womenL;
    }

    public void setWomenL(String womenL) {
        this.womenL = womenL;
    }

    public String getWomenXL() {
        return womenXL;
    }

    public void setWomenXL(String womenXL) {
        this.womenXL = womenXL;
    }

    public String getWomenXXL() {
        return womenXXL;
    }

    public void setWomenXXL(String womenXXL) {
        this.womenXXL = womenXXL;
    }

    public String getWomenXXXL() {
        return womenXXXL;
    }

    public void setWomenXXXL(String womenXXXL) {
        this.womenXXXL = womenXXXL;
    }
}