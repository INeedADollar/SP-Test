package org.testsp;

public class Student implements Element {
    private final String nume;
    private final String email;

    public Student(String nume, String email) {
        this.nume = nume;
        this.email = email;
    }

    public String getNume() {
        return nume;
    }

    public String getEmail() {
        return email;
    }

    public Element add(Element element) {
        return element;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitStudent(this);
    }
}
