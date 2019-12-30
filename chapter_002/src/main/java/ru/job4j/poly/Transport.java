package ru.job4j.poly;

public interface Transport {

    public void drive();

    public void passenger(int passengers);

    public long price(long fuel, int priceFuel);
}
