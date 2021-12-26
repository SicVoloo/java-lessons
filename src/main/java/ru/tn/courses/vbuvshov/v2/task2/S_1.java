package ru.tn.courses.vbuvshov.v2.task2;
public class S_1 {
    public static void main(String[] args) {
        TheCar car = new TheCarText(0L, TheCar.Type.PassengerCar, "LADA", "Новый автомобиль LADA в наличии.");
        print(car);
        car = new TheCarJson(1L, TheCar.Type.Truck, "ShockWave 36", "Новый грузовик ShockWave 36 в наличии.");
        print(car);
        car = new TheCarXml(2L, TheCar.Type.Bike, "Kawasaki Z1000", "Новый мотоцикл Kawasaki Z1000 в наличии.");
        print(car);
    }
    private static String convert(ConvertInterface obj) {return obj.convert();}
    private static void print(TheCar theCar) {
        if (theCar instanceof TheCarText) {System.out.println("Готово");}
        System.out.println(convert(theCar));
    }
}