package com.itproger;

public class OOPTransport { // Создание класса

    public float speed; // Созданно поле скорость
    public int weight; // Созданно поле вес
    public String color; // Созданно поле цвет
    public byte[] coordinate; // Созданно поле с массивом координат

    public void setValues(float _speed, int _weight, String _color, byte[] _coordinate) {
        speed = _speed;
        weight = _weight;
        color = _color;
        coordinate = _coordinate;
    }

    public String getValues() {
        String info = "Object speed: " + speed + ". Weight: " + weight + ". Color: " + color + ".\n";
        String infoCoordinates = "Coordinates:\n";
        for(int i = 0; i < coordinate.length; i++) {
            infoCoordinates += coordinate[i] + "\n";
        }
        return info + infoCoordinates;

    }

}
