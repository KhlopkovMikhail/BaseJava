package com.itproger;

public class Track extends OOPTransport {    // extends - метод наследования класса

    private boolean isLoaded; // Добавление нового параметра только для грузовиков

    public Track(int weight, byte[] coordinate) {
        super(weight, coordinate); // Обращение к классу родителю, в скобках передача параметров

    this.color = "red";
    }

    public Track(int weight, byte[] coordinate, boolean isLoaded) {
        super(weight, coordinate); // Обращение к классу родителю, в скобках передача параметров
        this.isLoaded = isLoaded;
    }

    public void setLoaded(boolean loaded) {
        this.isLoaded = loaded;
    }

    public void getLoaded() {
        if (isLoaded)
            System.out.println("Грузовик загружен");
        else
            System.out.println("Грузовик не загружен");
    }
}
