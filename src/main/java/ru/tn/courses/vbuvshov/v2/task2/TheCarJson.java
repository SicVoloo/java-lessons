package ru.tn.courses.vbuvshov.v2.task2;

public class TheCarJson extends ru.tn.courses.vbuvshov.v2.task2.TheCar {
    public TheCarJson(Long id, Type type, String name, String description) {super(id, type, name, description);}
    public TheCarJson(ru.tn.courses.vbuvshov.v2.task2.TheCar theCar) {super(theCar);}
    @Override
    public String convert() {
        return new StringBuilder().append("{\n\t\"id\": ").append(getId()).append(",\n")
                .append("\t\"type\": \"").append(getType()).append("\",\n").append("\t\"Name\": \"").append(getName()).append("\",\n")
                .append("\t\"Description\": \"").append(getDescription()).append("\",\n}").toString();
    }
}
