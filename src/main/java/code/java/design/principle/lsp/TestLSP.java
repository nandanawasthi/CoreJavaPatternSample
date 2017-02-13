package code.java.design.principle.lsp;

public class TestLSP {

    public static void main(String args[]) {
        MyOrderedCollection collection1 = new MyOrderedCollection();
        MyOrderedCollection collection2 = new MyOrderedAndSortedCollection();
        int a = 8, b = 4;

        collection1.addElement(a);
        collection1.addElement(b);

        collection2.addElement(a);
        collection2.addElement(b);

        getAndPrintSecondElement(collection1);
        getAndPrintSecondElement(collection2);
    }

    public static void getAndPrintSecondElement(MyOrderedCollection collection) {
        System.out.println("The second element is :"
                + collection.getElement(1));
    }
}