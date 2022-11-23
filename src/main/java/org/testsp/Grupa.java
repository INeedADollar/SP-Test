package org.testsp;

import java.util.List;

public class Grupa implements Element {
    private final String nume;
    private Semigrupa semigrupa1;
    private Semigrupa semigrupa2;

    public Grupa(String nume) {
        this.nume = nume;
        this.semigrupa1 = null;
        this.semigrupa2 = null;
    }

    public String getNume() {
        return nume;
    }

    public Element add(Element element) {
        if(element instanceof Semigrupa) {
            if(semigrupa1 == null) {
                semigrupa1 = (Semigrupa) element;
            }
            else if(semigrupa2 == null) {
                semigrupa2 = (Semigrupa) element;
            }
        }

        return element;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitGrupa(this);
    }

    public Semigrupa getSemigrupa1() {
        return semigrupa1;
    }

    public Semigrupa getSemigrupa2() {
        return semigrupa2;
    }
}
