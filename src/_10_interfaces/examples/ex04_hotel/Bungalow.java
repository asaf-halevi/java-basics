package _10_interfaces.examples.ex04_hotel;

import java.time.LocalDateTime;
import java.util.Date;

public class Bungalow extends Room implements IExecutiveServices {
    private boolean isHeatedPool;
    private double poolServices;

    public Bungalow(String type, int size, int location, double price, double poolServices) {
        super(type, size, location, price);
        this.isHeatedPool = true;
        this.poolServices = poolServices;
    }

    public boolean isHeatedPool() {
        return isHeatedPool;
    }

    public void setHeatedPool(boolean heatedPool) {
        isHeatedPool = heatedPool;
    }

    public double getPoolServices() {
        return poolServices;
    }

    public void setPoolServices(double poolServices) {
        this.poolServices = poolServices;
    }

    @Override
    public void privateChefService(LocalDateTime dateTime) {
        poolServices += getPrice() * 0.23;
    }

    @Override
    public void privateFitnessInstructor(Date startTime, Date endTime) {
        double diff = (endTime.getTime() - startTime.getTime()) / MILLISECONDS_IN_HOUR;
        poolServices += getPrice() * 0.12 * diff;
    }

    @Override
    public double perNightPrice() {
        return (getPrice() + poolServices) * getVAT();
    }

    @Override
    public double accommodationPeriodPrice(int days) {
        return (days * getPrice() + poolServices) * getVAT();
    }

    @Override
    public String toString() {
        return "Bungalow{" +
                "isHeatedPool=" + isHeatedPool +
                ", poolServices=" + poolServices +
                '}' + " " + super.toString();
    }
}
