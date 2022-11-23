package org.testsp;

import java.util.ArrayList;
import java.util.List;

public class An implements Element {
    private final String specializare;
    private final List<Grupa> grupe;
    private Grupa ultimaGrupa;
    private Semigrupa ultimaSemigrupa;

    public An(String nume) {
        this.specializare = nume;
        this.grupe = new ArrayList<>();
    }

    public String getSpecializare() {
        return specializare;
    }

    public Element add(Element element) {
        if(element instanceof Grupa) {
            grupe.add((Grupa) element);
            ultimaGrupa = (Grupa)element;
        }

        if(element instanceof Semigrupa) {
            if(ultimaGrupa != null) {
                ultimaGrupa.add(element);
            }

            ultimaSemigrupa = (Semigrupa)element;
        }

        if(element instanceof Student) {
            if(ultimaSemigrupa != null) {
                ultimaSemigrupa.add(element);
            }
        }

        return this;
    }

    public void accept(Visitor visitor) {
        visitor.visitAn(this);

        for(Grupa grupa : grupe) {
            grupa.accept(visitor);

            Semigrupa semigrupa1 = grupa.getSemigrupa1();
            if(semigrupa1 != null) {
                semigrupa1.accept(visitor);
                for (Student student : semigrupa1.getStudenti()) {
                    student.accept(visitor);
                }
            }

            Semigrupa semigrupa2 = grupa.getSemigrupa2();
            if(semigrupa2 != null) {
                semigrupa2.accept(visitor);
                for (Student student : semigrupa2.getStudenti()) {
                    semigrupa2.accept(visitor);
                }
            }
        }
    }
}
