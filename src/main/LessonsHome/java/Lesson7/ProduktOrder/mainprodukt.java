package Lesson7.ProduktOrder;

import java.util.Objects;

public class mainprodukt {
    public static void main(String[] args) {
ProduktOrder p=new ProduktOrder(1234566,200,500,productType.DRINK);
ProduktOrder p1=new ProduktOrder(2334780,50,200,productType.FOOD);
ProduktOrder p2=new ProduktOrder(23467789,2000,2,productType.ELECTRONICS);
        System.out.println(p.getId()+"-"+ p.getPrice()+"грн - "+ p.size+"мл- "+p.type);
        System.out.println(p1.getId()+"-"+ p1.getPrice()+"грн - "+ p1.size+"гр- "+p1.type);
        System.out.println(p2.getId()+"-"+ p2.getPrice()+"грн - "+ p2.size+"кг- "+p2.type);
    }
}

