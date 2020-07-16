package com.jalasoft.practice3;

import java.util.ArrayList;
import java.util.List;

public class ListLandTransport {
    private final List<Land> lands;

    public ListLandTransport() {
        lands = new ArrayList<>();
    }

    public void addLand(final Land land) {
        lands.add(land);
    }

    public void display() {
        lands.forEach(land -> System.out.println(land.displayData()));
    }
}
