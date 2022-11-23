package org.testsp;

public interface Element {

    public Element add(Element element);
    void accept(Visitor visitor);
}
