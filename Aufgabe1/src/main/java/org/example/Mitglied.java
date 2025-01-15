package org.example;


import java.util.Date;

public class Mitglied {
Integer id;
String name;
Haus haus;
String ereignis;
String date;
Mitglied(Integer id, String name, Haus haus, String ereignis, String date) {
    this.id = id;
    this.name = name;
    this.haus = haus;
    this.ereignis = ereignis;
    this.date = date;
}

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEreignis() {
        return ereignis;
    }

    public void setEreignis(String ereignis) {
        this.ereignis = ereignis;
    }

    public Haus getHaus() {
        return haus;
    }

    public void setHaus(Haus haus) {
        this.haus = haus;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
