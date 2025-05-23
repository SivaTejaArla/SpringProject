package com.example.firstproj.dataclass;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "games")
public class Game {

    @Id
    private String name ;
    private int price ;
    private  double size ;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Game{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }

    public void setSize(double size) {
        this.size = size;
    }

    public Game(){

    }

    public Game(String name, int price, double size) {
        this.name = name;
        this.price = price;
        this.size = size;
    }

}
