package com.jalasoft.practice3;

public class Main {
    public static void main(String[] args) {
        ListLandTransport transport = new ListLandTransport();
        transport.addLand(new Bicycle("Cross", 1500, false, false));
        transport.addLand(new Car("Audi", 20000, true, false));
        transport.display();
    }
}
