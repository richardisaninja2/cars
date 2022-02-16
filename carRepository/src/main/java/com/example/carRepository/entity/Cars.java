package com.example.carRepository.entity;

import javax.persistence.*;

@Table(name = "car")
@Entity
public class Cars {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "make")
    private String name;

    @Column(name = "model")
    private String model;

    @Column(name = "color")
    private String color;

    @Column(name = "front_view")
    private String frontView;

    @Column(name = "side_view")
    private String sideView;

    @Column(name = "back_view")
    private String backView;

    @Column(name = "performance")
    private String performance;

    public Cars() {
    }

    public Cars(String name, String model, String color, String frontView, String sideView, String backView, String performance) {
        this.name = name;
        this.model = model;
        this.color = color;
        this.frontView = frontView;
        this.sideView = sideView;
        this.backView = backView;
        this.performance = performance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getFrontView() {
        return frontView;
    }

    public void setFrontView(String frontView) {
        this.frontView = frontView;
    }

    public String getSideView() {
        return sideView;
    }

    public void setSideView(String sideView) {
        this.sideView = sideView;
    }

    public String getBackView() {
        return backView;
    }

    public void setBackView(String backView) {
        this.backView = backView;
    }

    public String getPerformance() {
        return performance;
    }

    public void setPerformance(String performance) {
        this.performance = performance;
    }
}
