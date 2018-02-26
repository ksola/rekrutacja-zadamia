package zadania;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Zadanie1 {

    public static class A {

        public String hello(List<String> names) {
            return "Hello " + names.stream().collect(Collectors.joining(", "));
        }
    }

    public static class B extends A {

        public String hello(ArrayList<String> names) {
            return "Dzień Dobry " + names.stream().collect(Collectors.joining(", "));
        }
    }

    public static void main(String[] args) {

        A a = new A();
        B b = new B();
        List<String> names = Arrays.asList("Piotrek", "Marcin", "Agata");
        System.out.println(a.hello(names));
        System.out.println(b.hello(names));

    }
}
