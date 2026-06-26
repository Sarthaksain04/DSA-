package Generics;

public class StartPrintDifferent {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Integer> printer1 = new Printer<>(24);
        printer1.print();

        Printer<String> print = new Printer<>("hi i am sarthak");
        print.print();

        Printer<Double> prin = new Printer<>(12.3);
        prin.print();
    }
}
