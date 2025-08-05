package com.itproger;

public class OOPTransport { // Создание класса

//    public float speed; // Созданно поле скорость
//    public int weight; // Созданно поле вес
//    public String color; // Созданно поле цвет
//    public byte[] coordinate; // Созданно поле с массивом координат

    // private используется исходя из принципов инкапсуляции, чтобы доступ к параметрам был только через методы или конструкторы
    private float speed; // Созданно поле скорость
    private int weight; // Созданно поле вес
    private String color; // Созданно поле цвет
    private byte[] coordinate; // Созданно поле с массивом координат

    public OOPTransport(float _speed, int _weight, String _color, byte[] _coordinate) { // Создание конструктора
        // Join to DB (Подключение к базе данных
        System.out.println("Object created");
        setValues(_speed, _weight, _color, _coordinate);
        System.out.println(getValues());
    }

    public OOPTransport(int weight, byte[] coordinate) {
        this.weight = weight;
        this.coordinate = coordinate;
        System.out.println(this.getValues());
    }


    public void setValues(float speed, int weight, String color, byte[] coordinate) {
        this.speed = speed; //this - обращение к полям класса
        this.weight = weight;
        this.color = color;
        this.coordinate = coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + this.speed + ". Weight: " + this.weight + ". Color: " + this.color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for (int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;

    }

}
