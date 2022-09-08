package abstract_factory;

import java.util.Optional;

public class FactoryPatternMainClass {

    public static void main(String[] args) {
       // first get factory instance from factory of factory ,if u want trainees
       AbstractFactory abstractFactory=new AbstractFactoryProducer().getProfession(true);
       Profession engg=abstractFactory.getProfession(("Engineer"));
       engg.print();

    }

}