package com.jalasoft.practice2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static final String BOLIVIA = "Bolivia";
    public static final String ARGENTINA = "Argentina";
    public static final String ARGELIA = "Argelia";
    public static final String PORTUGAL = "Portugal";
    public static final String ITALIA = "Italia";
    public static final String AUSTRALIA = "Australia";

    public static void main(String[] args) {
        List<String> countries = new ArrayList<>();
        countries.add(BOLIVIA);
        countries.add(ARGENTINA);
        countries.add(ARGELIA);
        countries.add(PORTUGAL);
        countries.add(ITALIA);
        countries.add(AUSTRALIA);

        // Filtrar solo los que empiecen con la letra A
        printSeparator();
        countries.stream().filter(country -> country.startsWith("A")).forEach(System.out::println);
        printSeparator();

        // Filtrar solo los que tengan mayor a 5 caracteres
        printSeparator();
        countries.stream().filter(country -> country.length() > 5).forEach(System.out::println);
        printSeparator();

        // Filtrar solo los que la suma de sus caracteres sea par
        printSeparator();
        countries.stream().filter(country -> country.length() % 2 == 0).forEach(System.out::println);
        printSeparator();
    }
    private static void printSeparator() {
        System.out.println("---------------------------");
    }
}
