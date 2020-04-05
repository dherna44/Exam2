package com.exam2SpringBoot.exam2SpringBoot.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Property Fields for Viruses table:
@Entity
@Table(name = "viruses")

//Viruses Class:
public class Viruses{

    @Id
    @Column(name = "id")
    private int id;
    @Column (name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    private String duration;
    @Column(name = "mortalityrate")
    private String mortalityrate;
    @Column(name = "imageaddress")
    private String imageaddress;

    public Viruses(){

    }

    //Viruses Class Constructor:
    public Viruses(int id, String name, String description, String symptoms, String duration, String mortalityrate, String imageaddress){
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
        this.imageaddress = imageaddress;
    }

    //Setter and Getter for ID:
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    //Setter and Getter for Name:
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //Setter and Getter for Description:
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    //Setter and Getter for Symptoms:
    public String getSymptoms() {
        return symptoms;
    }
    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    //Setter and Getter for Duration:
    public String getDuration() {
        return duration;
    }
    public void setDuration(String duration) {
        this.duration = duration;
    }

    //Setter and Getter for Mortalityrate:
    public String getMortalityrate() {
        return mortalityrate;
    }
    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate = mortalityrate;
    }

    //Setter and Getter for Imageaddress:
    public String getImageaddress() {
        return imageaddress;
    }
    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }
}