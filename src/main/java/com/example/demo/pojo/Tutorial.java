package com.example.demo.pojo;

import java.io.Serializable;

/**
 * Created by sunzhenzhou on 2017/11/15.
 */

public class Tutorial implements Serializable {

    private Long id;
    private String name;//教程名称

    //setters and getters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //toString
    @Override
    public String toString() {
        return "Tutorial{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
