package ru.tn.courses.vbuvshov.v2.task2;

public abstract class TheCar implements ru.tn.courses.vbuvshov.v2.task2.ConvertInterface {
    private Long id;
    private Type type;
    private String name;
    private String description;
    public TheCar() {}
    public TheCar(TheCar theCar) {
        this(theCar.getId(), theCar.getType(), theCar.getName(), theCar.getDescription());
    }
    public TheCar(Long id, Type type, String name, String description) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.description = description;
    }
    public Long getId() {return this.id;}
    public Type getType() {return this.type;}
    public String getName() {return this.name;}
    public String getDescription() {return this.description;}
    public TheCar setId(Long id) {this.id = id;return this;}
    public TheCar setType(Type type) {this.type = type;return this;}
    public TheCar setName(String name) {this.name = name;return this;}
    public TheCar setDescription(String description) {this.description = description;return this;}
    public enum Type {PassengerCar, Truck, Bike}
}