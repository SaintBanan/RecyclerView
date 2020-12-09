package com.example.recyclerview;

//Шаровой кран
public class BallValve {
    private String name, manufacturer, material, lever;
    private static int count;
    private int id;

    static {
        count = 0;
    }

    BallValve(String name, String manufacturer, String material, String lever) {
        this.manufacturer = manufacturer;   //Производитель
        this.material = material;           //Материал
        this.lever = lever;                 //Тип рукоятки
        this.name = name;
        id = ++count;
    }

    //Получить наименование товара
    public String getName() {
        return name;
    }

    //Получить id товара
    public int getId() {
        return id;
    }

    //Получить характеристики товара в виде строки
    public String getFeatures() {
        return String.format("Характеристики шарового крана №%s:\n Производитель: %s\n Материал: %s\n Рукоятка: %s", id, manufacturer, material, lever);
    }
}
