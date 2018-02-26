package zadania;

import java.util.function.Supplier;

public class Zadanie2 {

    public static void main(String[] args) {
        display(new Supplier<String>() {
            @Override
            public String get() {
                return "Czesc ";
            }
        });

        display(() -> "Czesc");
    }

    public static void display(Supplier<String> supplier)
    {
        System.out.println(supplier.get());
    }
}
