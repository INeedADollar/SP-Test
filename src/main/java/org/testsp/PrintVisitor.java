package org.testsp;

public class PrintVisitor implements Visitor {

    @Override
    public void visitAn(An an) {
        System.out.println(an.getSpecializare());
    }

    @Override
    public void visitGrupa(Grupa grupa) {
        System.out.println("\t" + grupa.getNume());
    }

    @Override
    public void visitSemigrupa(Semigrupa semigrupa) {
        System.out.println("\t\t" + semigrupa.getNume());
    }

    @Override
    public void visitStudent(Student student) {
        System.out.println("\t\t\t" + student.getNume() + ", " + student.getEmail());
    }
}
