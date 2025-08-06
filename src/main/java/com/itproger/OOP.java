// ООП: классы и объекты
package com.itproger;

public class OOP {

    public static void main(String[] args) {

        Car bmw = new Car (250.5f, 2500, "White", new byte[]{0, 0, 0}); // Создание объекта используя рвнее созданный класс OOPTransport
//        OOPTransport bmw = new OOPTransport(250.5f, 2500, "White", new byte[] {0, 0, 0}); // Создание объекта используя рвнее созданный класс OOPTransport

//        bmw.setValues(250.5f, 2500, "White", new byte[] {0, 0, 0});
//        String res1 = bmw.getValues();
//        System.out.println(res1);
//        bmw.speed = 250.5f; // Обращение к полю объекта speed и установка значения данного поля объекта
//        bmw.weight = 2500;
//        bmw.color = "White";
//        bmw.coordinate = new byte[] {0, 0, 0};

        Track truck = new Track(5600, new byte[]{100, 0, 100}, false);

        truck.setLoaded(true);
        truck.getLoaded();
//        OOPTransport truck = new OOPTransport();
//        truck.speed = 140.5f;
//        truck.weight = 5600;
//        truck.color = "Red";
//        truck.coordinate = new byte[] {100, 0, 100};
//
//        String res2 = truck.getValues();
//        System.out.println(res2);
//        System.out.println("Truck speed: " + truck.speed + ". BMW speed: " + bmw.speed + "." );

    }
}
