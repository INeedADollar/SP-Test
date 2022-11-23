package org.testsp;

import java.util.ArrayList;
import java.util.List;

public class Semigrupa implements Element {
    private final String nume;
    private final List<Student> studenti;

    public Semigrupa(String nume) {
        this.nume = nume;
        this.studenti = new ArrayList<>();
    }

    public String getNume() {
        return nume;
    }

    public Element add(Element element) {
        if(element instanceof Student) {
            studenti.add((Student) element);
        }

        return element;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitSemigrupa(this);
    }

    public List<Student> getStudenti() {
        return studenti;
    }
}
