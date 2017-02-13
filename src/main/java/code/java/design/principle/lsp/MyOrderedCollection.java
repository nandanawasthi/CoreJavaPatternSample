package code.java.design.principle.lsp;

import java.util.ArrayList;
import java.util.List;

public class MyOrderedCollection {
    protected List<Integer> list = new ArrayList<>();

    public void addElement(Integer i) {
        list.add(i);
    }

    public Integer getElement(Integer index) {
        return list.get(index);
    }
}