package ru.tn.courses.vbuvshov.v2.task2;
public class TheCarText extends ru.tn.courses.vbuvshov.v2.task2.TheCar {
    public TheCarText() {super();}
    public TheCarText(ru.tn.courses.vbuvshov.v2.task2.TheCar theCar) {super(theCar);}
    public TheCarText(Long id, Type type, String name, String description) {super(id, type, name, description);}
    @Override
    public String convert() {
        return new StringBuilder().append("ID: ").append(getId()).append("\nType: ").append(getType())
                .append("\nName: ").append(getName()).append("\nDescription: ").append(getDescription()).toString();
    }
}