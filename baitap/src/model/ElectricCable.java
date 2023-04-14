package model;

import java.io.Serializable;

public class ElectricCable  implements Serializable {
    private int id;
    private String description;
    private String producer;
    private int price;

    public ElectricCable() {
    }

    public ElectricCable(int id, String description, String producer,int price) {
        this.id = id;
        this.description = description;
        this.producer = producer;
        this.price=price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "ElectricCable{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", producer='" + producer + '\'' +
                ", price=" + price +
                '}';
    }

    public void setProducer(String producer) {
        this.producer = producer;

    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
