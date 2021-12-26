package ru.tn.courses.vbuvshov.v2.task2;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.annotation.XmlRootElement;
import java.io.StringWriter;

@XmlRootElement(name = "the-car")
public class TheCarXml extends ru.tn.courses.vbuvshov.v2.task2.TheCar {
    public TheCarXml() {super();}
    public TheCarXml(ru.tn.courses.vbuvshov.v2.task2.TheCar theCar) {super(theCar);}
    public TheCarXml(Long id, Type type, String name, String description) {super(id, type, name, description);}
    @Override
    public String convert() {
        try {
            StringWriter res = new StringWriter();
            Marshaller marshaller = JAXBContext.newInstance(TheCarXml.class).createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(this, res);return res.toString();
        } catch (JAXBException e) {e.printStackTrace();}return null;
    }
}
