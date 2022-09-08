package Factory_Design;

import Factory_Design.ProfessionFactory;

public class FactoryPatternMainClass {

    public static void main(String[] args) {
        ProfessionFactory professionFactory = new ProfessionFactory();

        Profession doc = professionFactory.getProfession("Doctor");
        doc.print();

    }

}