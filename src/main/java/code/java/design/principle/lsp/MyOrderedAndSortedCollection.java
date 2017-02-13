package code.java.design.principle.lsp;

import java.util.Collections;

public class MyOrderedAndSortedCollection extends MyOrderedCollection {
    //overriding addElement so that the collection is sorted
    public void addElement(Integer i) {
        super.addElement(i);
        Collections.sort(super.list);
    }
}