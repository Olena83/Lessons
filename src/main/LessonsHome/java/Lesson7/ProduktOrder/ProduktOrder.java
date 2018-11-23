package Lesson7.ProduktOrder;

import java.util.Objects;

public class ProduktOrder  {
    int id;
    int price;
    int size;
    productType type;

    public ProduktOrder(int id, int price, int size,productType type) {
        this.id = id;
        this.price = price;
        this.size = size;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public productType getType() {
        return type;
    }

    public void setType(productType type) {
        this.type = type;
    }
    @Override
    public String toString() {
        return  id +
                "-" + price +
                "-" + size +
                "-" + type;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProduktOrder that = (ProduktOrder) o;
        return id == that.id &&
                price == that.price &&
                size == that.size &&
                type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, price, size, type);
    }

}