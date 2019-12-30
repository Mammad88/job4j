package ru.job4j.poly;

public class Bus implements Transport {

    public int priceFuel;
    public long fuel;

    @Override
    public void drive() {
        System.out.println("Машина едет");
    }

    @Override
    public void passenger(int passengers) {
        System.out.println("количество пассажиров: " + passengers);

    }

    @Override
    public long price(long fuel, int priceFuel) {
        long price = fuel * priceFuel;
        return price;
    }
}
